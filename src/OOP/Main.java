package OOP;

public class Main {
    public static void main(String[] args){

        Product product = new Product();

        product.name = "Apple";
        product.id = 1;
        product.description = "Red";
        product.price = 15;
        product.stockAmount = 25;

        System.out.println(product.name);

        ProductManager productManager = new ProductManager();
    }
}
