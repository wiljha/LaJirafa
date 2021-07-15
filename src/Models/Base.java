package Models;

public abstract class Base {
    private int id;
    private String nombre;
    private Estado estado;

    public Base(String nombre, Estado estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public Base() {
    }

    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //
}
