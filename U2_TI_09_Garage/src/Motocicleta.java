public class Motocicleta extends Vehiculo {
    //atributo
    private boolean tieneCaja;

    // constructor
    public Motocicleta(String marca, String placa, boolean tieneCaja){
        super(marca, placa);
        this.tieneCaja = tieneCaja;
    }

    //metodo
    public boolean getTieneCaja(){
        return tieneCaja;
    }
}