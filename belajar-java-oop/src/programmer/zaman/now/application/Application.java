package programmer.zaman.now.application;

// harus public class yang dapat diimpor ke package lain
import programmer.zaman.now.data.Data;
import programmer.zaman.now.data.Product;
// import semuanya
import programmer.zaman.now.data.*;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("MacbookPro", 30000000);
        //tidak bisa diakses karena sifat dari Product attributenya adalah protected (tidak bisa diakses lewat package lain)
        //System.out.println(product.name);

        Data data = new Data();
    }
}
