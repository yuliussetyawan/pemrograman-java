public class DoWhileLoop {
    public static void main(String[] args) {


        var counter = 100;

//      dijalankan di awal (minimal sekali)
        do{
            System.out.println("Perulangan " + counter);
            counter++;
        } while (counter <= 10);

    }
}