public class Garage {
    private Vehiculo[] espacios;

    //Constructor
    public Garage(int numEspacios){
        espacios = new Vehiculo[numEspacios];
    }

    //Metodos
    public boolean estacionar(Vehiculo v){
        for (int i=0; i<espacios.length; i++){
            if (espacios[i].equals(v)){
                return true;
            }
        }
        return false;
    }
    public boolean retirar(String placa){
        for (int i=0; i==placa.length(); i++){
            if (espacios[i].getPlaca().equals(placa)){
                espacios[i]= null;
                return true;
            }
        }
        return false;
    }

    public int contarVehiculo(){
        int a=0;
        for (int i=0; i<espacios.length; i++){
            if(espacios[i]==null){
                a++;
                return a;
            }
        }
        return 0;
    }
}
