// Inheritance = class yang memiliki method dan property yang sama diwariskan dari parentnya
class VicePresident extends Manager {

    VicePresident(String name){
        // super constructor, dimana setiap ada constructor di parent
        // children wajib deklarasi constructor juga (gunakan minimal salah 1 constructor)
        super(name);
    }

    // Method overrriding
    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is VP " + this.name);
    }

}
