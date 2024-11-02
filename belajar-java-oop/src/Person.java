class Person {
    String name;
    String address;
    // final berarti tidak bisa mengubah data fieldnya
    final String country = "Indonesia";

    // constructor adalah method yang dipanggil ketika pertama kali objek dibuat
    // bisa digunakan untuk memaksa set data di object untuk pertama kalinya
    Person(String name, String address){
        // this digunakan untuk mengakses object saat ini (merujuk ke field/property di dalam class)
        this.name = name;
        this.address = address;

        // ini adalah variable shadowing, gunakan "this" untuk menghindarinya
        // name = name;
        // address = address;
    }

    // constructor overloading
    // Ketika menggunakan constructor ke2 seakan-akan kita memanggil constructor
    // Person yang pertama
    Person(String paramName){
        this(paramName, null);
    }

    // Ini juga seperti memanggil constructor Person yang ke2
    Person(){
        this(null);
    }

    // method itu sama seperti function di js
    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}
