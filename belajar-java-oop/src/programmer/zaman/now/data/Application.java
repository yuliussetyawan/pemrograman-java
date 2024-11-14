package programmer.zaman.now.data;

public class Application {

    public static final int PROCESSORS;

    // static akan dipanggil sekali sebelum mengakses classnya
    static {
        System.out.println("Mengakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }

}