public class Inventario{
    //Atributos
    private Producto[] stock;

    //Constructor
    public Inventario(int tamano) {
        this.stock = new Producto[tamano];
    }

    //Metodos
    //Metdo agregar
    public boolean agregarProducto(Producto producto){
        for(int i=0; i<this.stock.length; i++){
            if(this.stock[i] == null){
                this.stock[i]=producto;
                return true;
            }
        }
        return false;
    }
    //Metodo eliminar
    public boolean eliminarProducto(String getCodigo){
        for(int i=0; i<this.stock.length; i++){
            if(this.stock[i] != null && this.stock[i].getCodigo().equals(getCodigo)){
                this.stock[i]=null;
                return true;
            }
        }
        return false;
    }
    //Metodo buscar
    public Producto buscar(String codigo){
        for(int i=0; i<this.stock.length; i++){
            if(this.stock[i] != null && this.stock[i].getCodigo().equals(codigo)){
                return this.stock[i];
            }
        }
        return null;
    }
    //Metodo sumar
    public int totalItems(){
        int total=0;
        for (int i=0; i<this.stock.length; i++){
            if(this.stock[i] != null){
                total+=this.stock[i].getCantidad();
            }
        }
        return total;
    }
}