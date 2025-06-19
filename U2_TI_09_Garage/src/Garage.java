public class Garage {
    //atributo
    private Vehiculo[] espacios;

    //constructor
    public Garage(int numEspacios){
        espacios = new Vehiculo[numEspacios];
    }

    //metodo estacionar
    public boolean estacionar(Vehiculo v){
        for (int i = 0; i < espacios.length; i++){
            if (espacios[i]==null){
                espacios[i] = v;
                return true;
            }
        }
        return false;
    }

    //metodo retirar
    public boolean retirar(String placa){
        for (int i = 0; i == placa.length(); i++){
            if (espacios[i].getPlaca().equals(placa)){
                espacios[i] = null;
                return true;
            }
        }
        return false;
    }

    //metodo contar
    public int contarVehiculo(){
        int a = 0;
        for (int i = 0; i < espacios.length; i++){
            if (espacios[i] == null){
                return a;
            }
        }
        return 0;
    }
}
