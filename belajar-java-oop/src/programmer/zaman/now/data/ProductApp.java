package programmer.zaman.now.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro", 30000000);
        System.out.println(product.name);

        // berkat method toString() di parent Product class, output lebih mudah dibaca
        System.out.println(product);
        // output: Product name Macbook Pro price: 30000000
    }
}
