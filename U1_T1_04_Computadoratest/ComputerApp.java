public class ComputerApp{
    public static void main(String[] args) {

        Computer myComputer = new Computer();

        myComputer.setBrand("Asus");
        myComputer.setModel("Rog Zephyrus");

        System.out.println("Brand: " + myComputer.getBrand());
        System.out.println("Model: " + myComputer.getModel());

        myComputer.turnOn();
        myComputer.turnOn();

        myComputer.turnOff();
    }
}