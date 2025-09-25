/**
 * Clase que representa un carrito de la compra
 * Permite añadir, eliminar y actualizar productos en el carrito
 * También permite mostrar el contenido del carrito y el total a pagar
 */

import java.util.HashMap;

public class shoppingCart {
    private HashMap<String, Integer> cart;
    private HashMap<String, Double> prices;

    public shoppingCart() {
        cart = new HashMap<>();
        prices = new HashMap<>();

        this.prices.put("manzana", 0.50);
        this.prices.put("platano", 0.30);
        this.prices.put("naranja", 0.60);
        this.prices.put("leche", 2.50);
        this.prices.put("pan", 1.50);
    }

    public HashMap<String, Integer> getCart() {
        return cart;
    }

    public void setCart(HashMap<String, Integer> cart) {
        this.cart = cart;
    }

    public HashMap<String, Double> getPrices() {
        return prices;
    }

    public void setPrices(HashMap<String, Double> prices) {
        this.prices = prices;
    }


    /**
     * Añade un producto al carrito(Complejidad O(1))
     * @param product
     * @param cantidad
     */

    public void addProduct(String product, int cantidad){
        if(prices.containsKey(product)){
            if(cart.containsKey(product)){
                cart.put(product, cart.get(product)+cantidad);
            }else{
                cart.put(product, cantidad);
            }
            System.out.println("Añadido " + cantidad + " de " + product + " al carrito.");
        }else{
            System.out.println("El producto no está disponible.");
        }
    }


    /**
     * Elimina un producto del carrito(Complejidad O(1))
     * @param product
     */
    public void eliminarProduct(String product){
        if(cart.containsKey(product)){
            cart.remove(product);
            System.out.println("Eliminado " + product + " del carrito"  );
        }else{
            System.out.println("El producto no está en el carrito.");
        }
    }


    /**
     * Actualiza la cantidad de un producto en el carrito(Complejidad O(1))
     * @param product
     * @param cantidad
     */
    public void updateCantidad(String product, int cantidad){
        if(cantidad <= 0){
            cart.remove(product);
        }else if(cart.containsKey(product)){
            cart.put(product, cantidad);
            System.out.println("Actualizado: " + product + " cantidad a " + cantidad);
        }else {
            System.out.println("El producto no se ha encontrado en el carrito.");
        }
    }
    /**
     * Muestra el contenido del carrito(Complejidad O(n))
     */
    public void mostrarCarrito(){
        System.out.println("Contenido del carrito");
        System.out.println("-----------------------");
        for(String product : cart.keySet()){
            System.out.println(product + " - " + cart.get(product) + " - " +  (cart.get(product) * prices.get(product)) + "€");
        }
    }
    /**
     * Muestra el total del carrito(Complejidad O(n))
     */
    public void mostrarTotal(){
        Double total = 0.0;;
        for(String product : cart.keySet()){
            total += cart.get(product) * prices.get(product);
        }
        System.out.println("Total: " + total + "€");
    }
}
