public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Eko");
        manager.sayHello("Budi");
        System.out.println(manager.name);

        var vp = new VicePresident("Eko");
        vp.sayHello("Budi");
    }
}
