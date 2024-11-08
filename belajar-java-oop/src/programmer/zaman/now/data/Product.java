package programmer.zaman.now.data;

import java.util.Objects;

public class Product {
    // protected bisa diakses di class, package, subclass, tapi tidak world
    //  protected String name;
    //  protected int price;

    public String name;
    public int price;

    // publik bisa diakses di semuanya (class, package, subclass, dan world)
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    // Method ini biasanya digunakan untuk merepresentasikan object dalam bentuk String
    // untuk membuat objek lebih muda dibaca
    public String toString(){
        return "Product name " + name + " price: " + price;
    }


    // Method equals ini digenerate otomatis via fitur generate dari IDE
    // Menu -> code -> generate -> equals() & hashcode()
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    // Method hashCode adalah method representasi integer object kita,
    // mirip toString yang merupakan representasi String, hashCode adalah representasi integer
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + price;
        return result;
    }

    // ini method untuk cek equals jika harus dicoding manual
//    public boolean equals(Object o){
//        if (o == this){
//            return true;
//        }
//
//        if (!(o instanceof Product)){
//            return false;
//        }
//
//        Product product = (Product) o;
//
//        if (this.price != product.price){
//            return false;
//        }
//
//        if (this.name != null){
//            return this.name.equals(product.name);
//        } else {
//            return product.name == null;
//        }
//    }
}
