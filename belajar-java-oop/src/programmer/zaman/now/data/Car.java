package programmer.zaman.now.data;

//Interface mirip seperti abstract class, yang membedakan adalah di Interface,
// semua method otomatis abstract, tidak memiliki block
// Jika melakukan contract idealnya menggunakan interface, bukan abstract class

// Bahkan interface pun bisa implement interface lain, bisa lebih dari 1. Namun jika interface
// ingin mewarisi interface lain, kita menggunakan kata kunci extends, bukan implements
// interface => interface = extends, class => object = implements
public interface Car extends Hasbrand, IsMaintenace {
    void drive();
    int getTire();

//    Ketika kita menambah satu method di interface, secara otomatis semua class yang implement akan rusak karena harus meng-override method tersebut
//    Dengan menggunakan default method, kita bisa menambahkan konkrit method di interface.
    default boolean isBig(){
        return false;
    }


}
