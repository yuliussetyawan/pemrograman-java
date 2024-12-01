package programmer.zaman.now.application;

/*
Throwable memiliki method yang bernama getStackTrace(), dimana menghasilkan Array dari StackTraceElement object
StackTraceElement berisikan informasi tentang, class, file bahkan baris lokasi terjadinya error
Class StackTraceElement ini sangat penting untuk menelusuri lokasi kejadian error yang terjadi
Panggil method printStackTrace() class Throwable, untuk memprint ke console detail error StackTraceElement nya

*/

public class StackTraceApp {
    public static void main(String[] args) {

        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Eko", "Kurniawan", "Khannedy"
            };

            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}