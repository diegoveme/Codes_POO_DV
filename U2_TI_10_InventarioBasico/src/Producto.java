public class Producto {
    //Atributos
    private String codigo;
    private String nombre;
    private int cantidad;

    //Constructor
    public Producto(String codigo, String nombre, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    //Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    //Setters
    public void setCodigo(String codigo) {
        if (nombre != null) {
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
    }
}