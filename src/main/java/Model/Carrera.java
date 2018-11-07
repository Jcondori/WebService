package Model;

public class Carrera {
    private String Codigo;
    private String Nombre;
    private String Abrebiacion;

    public Carrera(String codigo, String nombre, String abrebiacion) {
        Codigo = codigo;
        Nombre = nombre;
        Abrebiacion = abrebiacion;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAbrebiacion() {
        return Abrebiacion;
    }

    public void setAbrebiacion(String abrebiacion) {
        Abrebiacion = abrebiacion;
    }
}
