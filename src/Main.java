public class Main {
    public static void main(String[] args) {
        shoppingCart shoppingCart = new shoppingCart();
        shoppingCart.addProduct("manzana", 3);
        shoppingCart.addProduct("leche", 1);
        shoppingCart.addProduct("pan", 2);
        shoppingCart.addProduct("platano", 5);
        shoppingCart.addProduct("naranja", 4);

        shoppingCart.mostrarCarrito();
        shoppingCart.mostrarTotal();
    }
}
