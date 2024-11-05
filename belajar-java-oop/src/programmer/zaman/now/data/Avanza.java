package programmer.zaman.now.data;


// Di interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant (field yang tidak bisa diubah)
// Untuk mewariskan interface, kita tidak menggunakan kata kunci extends, melainkan implements
public class Avanza implements Car {
    public void drive(){
        System.out.println("Drive Avanza");
    }
    public int getTire(){
        return 4;
    }

    public String getBrand(){
        return "Toyota";
    }

    public boolean isMaintenace(){
        return false;
    }

}
