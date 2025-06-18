public class Motocicleta extends Vehiculo {
    //Atributos
    private boolean tieneCaja;

    //Constructor con los del padre
    public Motocicleta (String marca, String placa, boolean tieneCaja){
        super(marca, placa);
        this.tieneCaja = tieneCaja;
    }

    //Getter
    public boolean getTeneCaja(){
        return tieneCaja;
    }
}