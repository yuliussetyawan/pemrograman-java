//Employee -> Manager -> Vice President
public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Eko");
        employee.sayHello("Budi");

        // Polymorphism adalah kemampuan sebuah object untuk berubah bentuk
        // menjadi bentuk objec lain (dari Employee ke Manager, Vice President, etc)
        employee = new Manager("EKo");
        employee.sayHello("Budi");

       // Dalam polymorphism, objek hanya dapat mengakses method dan properti yang didefinisikan di kelas induknya (parent class).
        employee = new VicePresident("EKO");
        employee.sayHello("Budi");

        // Polymorphism dapat diset di dalam method
        sayHello(new Employee("Eko"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Budi"));
    }
    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);

    }
}
