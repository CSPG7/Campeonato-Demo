package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import modelo.Campeonato;
import modelo.Equipo;
import modelo.Partido;

public class Controlador {

    public void guardar(Campeonato camp, String path) {
        try {
            File file = new File(path);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            // Guardar equipos: tipo E
            for (Equipo e : camp.getListaEquipos()) {
                bw.write("E" + "\t"
                        + e.getNombre() + "\t"
                        + e.getPuntos() + "\t"
                        + e.getJugados() + "\t"
                        + e.getGanados() + "\t"
                        + e.getEmpatados() + "\t"
                        + e.getPerdidos() + "\t"
                        + e.getGolesFavor() + "\t"
                        + e.getGolesContra());
                bw.newLine();
            }

            // Guardar partidos: tipo P
            for (Partido p : camp.getListaPartidos()) {
                bw.write("P" + "\t"
                        + p.getEquipoLocal().getNombre() + "\t"
                        + p.getEquipoVisitante().getNombre() + "\t"
                        + p.getGolesLocal() + "\t"
                        + p.getGolesVisitante());
                bw.newLine();
            }

            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // fin guardar

    public Campeonato leer(String nomCampeonato, String path) {
        Campeonato camp = new Campeonato(nomCampeonato);
        File file = new File(path);
        if (!file.exists()) {
            return camp;
        }
        try {
            BufferedReader leer = new BufferedReader(new FileReader(file));
            String linea;
            while ((linea = leer.readLine()) != null) {
                String[] datos = linea.split("\t"); // token

                if (datos[0].equals("E")) {
                    String nombre    = datos[1];
                    int puntos       = Integer.parseInt(datos[2]);
                    int jugados      = Integer.parseInt(datos[3]);
                    int ganados      = Integer.parseInt(datos[4]);
                    int empatados    = Integer.parseInt(datos[5]);
                    int perdidos     = Integer.parseInt(datos[6]);
                    int golesFavor   = Integer.parseInt(datos[7]);
                    int golesContra  = Integer.parseInt(datos[8]);

                    Equipo eq = new Equipo(nombre, puntos, jugados, ganados,
                            empatados, perdidos, golesFavor, golesContra);
                    camp.getListaEquipos().add(eq);

                } else if (datos[0].equals("P")) {
                    String nomLocal     = datos[1];
                    String nomVisitante = datos[2];
                    int golesLocal      = Integer.parseInt(datos[3]);
                    int golesVisitante  = Integer.parseInt(datos[4]);

                    Equipo local     = camp.buscarEquipo(nomLocal);
                    Equipo visitante = camp.buscarEquipo(nomVisitante);

                    if (local != null && visitante != null) {
                        Partido p = new Partido(golesLocal, golesVisitante);
                        p.agregarEquipo(local);
                        p.agregarEquipo(visitante);
                        camp.getListaPartidos().add(p);
                    }
                }
            }
            leer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return camp;
    } // fin leer
}
