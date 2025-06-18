public abstract class Vehiculo{
    //atributos
    protected String placa;
    protected String marca;

    //Constructor
    public Vehiculo(String placa, String marca){
        this.placa = placa;
        this.marca = marca;
    }

    //Getters
    public String getPlaca(){
        return placa;
    }
    public String getMarca(){
        return marca;
    }
}