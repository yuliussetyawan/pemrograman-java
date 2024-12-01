package programmer.zaman.now.application;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Deklarasi kelas utama untuk membaca file
public class ReadApp {
    // Metode main sebagai entry point program
    public static void main(String[] args) {
        // Menggunakan try-with-resources untuk membaca file
        // BufferedReader akan otomatis ditutup setelah selesai digunakan
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {

            // Membaca file baris per baris
            while (true) {
                // Membaca satu baris dari file
                String line = reader.readLine();

                // Jika tidak ada baris lagi (null), keluar dari loop
                if (line == null) {
                    break;
                }

                // Mencetak setiap baris yang dibaca
                System.out.println(line);
            }

            // Menangkap segala jenis error yang mungkin terjadi saat membaca file
        } catch (Throwable throwable) {
            // Mencetak pesan error jika terjadi masalah
            System.out.println("Error membaca file " + throwable.getMessage());
        }
    }
}