package programmer.zaman.now.data;

public class Cat extends Animal {
    // wajib declare method run() karena bersifat abstact di parent Animal
    public  void run(){
        System.out.println("Cat " + name + " is running");
    }

}
