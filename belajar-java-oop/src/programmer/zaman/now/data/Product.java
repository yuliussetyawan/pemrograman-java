package programmer.zaman.now.data;

public class Product {
    // protected bisa diakses di class, package
    // subclass, tapi tidak world
    protected String name;
    protected int price;

    // publik bisa diakses di semuanya (class, package, subclass, dan world)
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
}
