public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(4);

        Coche auto = new Coche("MSA32","MAZDA",2);
        Motocicleta motocicleta = new Motocicleta("JGB46","HONDA",false);
        Coche auto1 = new Coche("SOJ92","NISSAN",4);
        Coche auto2 = new Coche("SVO76","SUBARU",2);
        Coche auto3 = new Coche("SOJ93","MITSUBISHI",4);

        System.out.println("Estacionado: " + garage.estacionar(auto));
        System.out.println("Estacionado: " + garage.estacionar(auto1));
        System.out.println("Estacionado: " + garage.estacionar(auto2));
        System.out.println("Estacionado: " + garage.estacionar(motocicleta));

        System.out.println("Retirado: " + garage.retirar("MSA32"));

        System.out.println("Cantidad de vehiculos: " + garage.contarVehiculo());
    }
}