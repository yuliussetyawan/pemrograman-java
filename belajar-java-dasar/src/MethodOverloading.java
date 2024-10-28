public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("Eko");
        sayHello("Eko", "Kurniawan");
    }

    /*
    Method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali.
    Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda, enta jumlah atau tipe data parameternya
     */

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}