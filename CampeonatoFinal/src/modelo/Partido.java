package modelo;

import java.util.ArrayList;

public class Partido {

    private int golesLocal;
    private int golesVisitante;

    ArrayList<Equipo> listaEquipos;

    public Partido() {
    }

    public Partido(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        listaEquipos = new ArrayList<>();
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public void agregarEquipo(Equipo equipo) {
        listaEquipos.add(equipo);
    }

    public Equipo getEquipoLocal() {
        return listaEquipos.get(0);
    }

    public Equipo getEquipoVisitante() {
        return listaEquipos.get(1);
    }
}
