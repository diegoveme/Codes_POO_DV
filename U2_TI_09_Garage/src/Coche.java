public class Coche extends Vehiculo {
    //atributo
    private int numPuertas;

    //contructor
    public Coche(String placa, String marca, int numPuertas) {
        super(placa, marca);
        this.numPuertas = numPuertas;
    }

    //metodo
    public int getNumPuertas() {
        return numPuertas;
    }
}