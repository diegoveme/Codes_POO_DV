public class Coche extends Vehiculo {
    //Atributos
    private int numPuertas;

    //Constructor con los del padre
    public Coche(String placa, String marca, int numPuertas) {
        super(placa, marca);
        this.numPuertas = numPuertas;
    }

    //Getter
    public int getNumPuertas() {
        return numPuertas;
    }
}