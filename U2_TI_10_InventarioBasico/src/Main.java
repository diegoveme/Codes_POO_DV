public class Main {
    public static void main(String[] args) {
        //Crea inventario de tamaño 3
        Inventario inventario = new Inventario(3);
        //Intenta agregar 4 productos (el último debe fallar).
        Producto product1 = new Producto("123", "ApplePencil", 10);
        Producto product2 = new Producto("456", "Ipad", 5);
        Producto product3 = new Producto("789", "Mac", 3);
        Producto product4 = new Producto("010", "AppleWatch", 7);
        inventario.agregarProducto(product1);
        inventario.agregarProducto(product2);
        inventario.agregarProducto(product3);
        inventario.agregarProducto(product4);
        //Busca uno existente y uno no
        System.out.println("Buscar existente: " + (inventario.buscar("123") != null));
        System.out.println("Buscar inexistente: " + (inventario.buscar("999") != null));
        //Elimina uno
        System.out.println("Eliminar: " + inventario.eliminarProducto("456"));
        //Muestra el total de ítems tras cada operación.
        System.out.println("Total final: " + inventario.totalItems());
        //Vuelve a agregar.
        System.out.println("Agregar nuevo: " + inventario.agregarProducto(product4));
        //Muestra el total de ítems tras cada operación.
        System.out.println("Total final: " + inventario.totalItems());
    }
}