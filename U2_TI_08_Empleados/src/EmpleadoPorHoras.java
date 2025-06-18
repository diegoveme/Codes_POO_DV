public class EmpleadoPorHoras extends Empleado {
    //atributo extra
    private int horasTrabajadas;

    //Constructor que acepta los tres del padre + horasTrabajadas
    public EmpleadoPorHoras(String id, String nombre, double salarioBase, int horasTrabajadas) {
        //super se ocupa super para atraer a los del padre (String id, String nombre, double salarioBase)
        super(id, nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * horasTrabajadas; 
    }
}
