public class EmpleadoTiempoCompleto extends Empleado {
    private double beneficios;

    //Constructor que acepta los tres del padre + beneficios
    public EmpleadoTiempoCompleto(String id, String nombre, double salarioBase, double beneficios) {
        //se ocupa super para atraer a los del padre (String id, String nombre, double salarioBase)
        super(id, nombre, salarioBase);
        this.beneficios = beneficios;
    }

}
