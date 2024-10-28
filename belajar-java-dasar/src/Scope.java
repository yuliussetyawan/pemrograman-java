public class Scope {
    public static void main(String[] args) {
        sayHello("Eko");
        sayHello("");
    }

    static void sayHello(String name){
        String hello = "Hello " + name;

        if(!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
//        ini akan return error karena variable hi di luar scope
//        System.out.println(hi);
    }
}