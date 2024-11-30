package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabaseError;

/*
Error adalah sebuah class di Java, yang tidak direkomendasikan untuk di try-catch
Biasanya error terjadi ketika ada masalah serius, dan sangat tidak direkomendasikan untuk di try catch
Artinya, direkomendasikan untuk mematikan aplikasi
Contoh, misal jika diawal aplikasi kita tidak bisa terkoneksi ke database,
direkomendasikan untuk membuat exception jenis Error, dan menghentikan aplikasi
*/

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("eko", "eko");
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}