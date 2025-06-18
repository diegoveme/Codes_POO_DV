public class Main {
    public static void main(String[] args) {
        Empleado employerfulltime = new EmpleadoTiempoCompleto("Nx043", "Carlos", 10000.00, "Seguro Medico");
        Empleado employerperhour = new EmpleadoPorHoras("Nz089", "Pedro", 10000.00, 40);

        System.out.println("Employer full time: ");
        System.out.println(employerfulltime.calcularSalario());
        System.out.println("Employer per hour: ");
        System.out.println(employerperhour.calcularSalario());

    }
}