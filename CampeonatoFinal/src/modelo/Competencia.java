package modelo;

public class Competencia {

    private String nombre;

    public Competencia() {
    }

    public Competencia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Competencia{" + "nombre=" + nombre + '}';
    }
}
