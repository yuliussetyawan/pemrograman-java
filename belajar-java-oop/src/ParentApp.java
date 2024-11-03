class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        // Ini mengatur nilai name di Child class, BUKAN di Parent class
        child.name = "Eko";
        child.doIt();
        // Ini mencetak name dari Child class
        System.out.println(child.name);

        Parent parent = new Parent();
        parent.doIt();
        System.out.println(parent.name);
    }
}