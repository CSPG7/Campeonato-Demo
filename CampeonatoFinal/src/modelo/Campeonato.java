package modelo;

import java.util.ArrayList;

public class Campeonato extends Competencia {

    ArrayList<Equipo> listaEquipos;
    ArrayList<Partido> listaPartidos;

    public Campeonato() {
    }

    public Campeonato(String nombre) {
        super(nombre);
        listaEquipos = new ArrayList<>();
        listaPartidos = new ArrayList<>();
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public ArrayList<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(ArrayList<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    public void agregarEquipo(String nombre) {
        listaEquipos.add(new Equipo(nombre.trim(), 0, 0, 0, 0, 0, 0, 0));
    }

    public Equipo buscarEquipo(String nombre) {
        for (Equipo e : listaEquipos) {
            if (e.getNombre().equals(nombre.trim())) {
                return e;
            }
        }
        return null;
    }

    public boolean eliminarEquipo(String nombre) {
        Equipo e = buscarEquipo(nombre);
        if (e != null) {
            listaEquipos.remove(e);
            return true;
        }
        return false;
    }

    public void agregarPartido(Equipo local, Equipo visitante,
            int golesLocal, int golesVisitante) {
        Partido p = new Partido(golesLocal, golesVisitante);
        p.agregarEquipo(local);
        p.agregarEquipo(visitante);
        listaPartidos.add(p);

        local.setJugados(local.getJugados() + 1);
        visitante.setJugados(visitante.getJugados() + 1);
        local.setGolesFavor(local.getGolesFavor() + golesLocal);
        local.setGolesContra(local.getGolesContra() + golesVisitante);
        visitante.setGolesFavor(visitante.getGolesFavor() + golesVisitante);
        visitante.setGolesContra(visitante.getGolesContra() + golesLocal);

        if (golesLocal > golesVisitante) {
            local.setGanados(local.getGanados() + 1);
            local.setPuntos(local.getPuntos() + 3);
            visitante.setPerdidos(visitante.getPerdidos() + 1);
        } else if (golesLocal < golesVisitante) {
            visitante.setGanados(visitante.getGanados() + 1);
            visitante.setPuntos(visitante.getPuntos() + 3);
            local.setPerdidos(local.getPerdidos() + 1);
        } else {
            local.setEmpatados(local.getEmpatados() + 1);
            local.setPuntos(local.getPuntos() + 1);
            visitante.setEmpatados(visitante.getEmpatados() + 1);
            visitante.setPuntos(visitante.getPuntos() + 1);
        }
    }

    public Partido buscarPartido(String nomLocal, String nomVisitante) {
        for (Partido p : listaPartidos) {
            if (p.getEquipoLocal().getNombre().equals(nomLocal)
                    && p.getEquipoVisitante().getNombre().equals(nomVisitante)) {
                return p;
            }
        }
        return null;
    }
}
