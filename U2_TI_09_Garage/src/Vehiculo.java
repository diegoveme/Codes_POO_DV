public abstract class Vehiculo {
    //atributos
    protected String placa;
    protected String marca;

    //constructor
    public Vehiculo(String placa, String marca){
        this.placa = placa;
        this.marca = marca;
    }

    //metodos
    public String getPlaca(){
        return placa;
    }
    public String getMarca(){
        return marca;
    }
}