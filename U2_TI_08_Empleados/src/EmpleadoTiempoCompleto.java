public class EmpleadoTiempoCompleto extends Empleado {
    //atributo extra
    private String beneficios;

    //Constructor que acepta los tres del padre + beneficios
    public EmpleadoTiempoCompleto(String id, String nombre, double salarioBase, String beneficios) {
        //super se ocupa super para atraer a los del padre (String id, String nombre, double salarioBase)
        super(id, nombre, salarioBase);
        this.beneficios = beneficios;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase(); 
    }
}
