package programmer.zaman.now.application;

import programmer.zaman.now.data.Product;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Eko";
        first = first + " " + "Khannedy";

        System.out.println(first);

        String second = "Eko Khannedy";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Eko Khannedy";

        System.out.println(second == third);
        System.out.println(second.equals(third));

        // Product data for EqualsApp
        Product product = new Product("Macbook Pro", 30000000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);

        Product product2 = new Product("Macbook Pro", 30000000);

        System.out.println(product.equals(product2));   // true

        System.out.println(product.hashCode() == product2.hashCode());  // true

    }
}
