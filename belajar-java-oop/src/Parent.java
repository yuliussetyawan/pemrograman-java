class Parent {
    // Ini adalah field name di Parent class
    String name;

    void doIt(){
        System.out.println("Do it in parent");
    }
}

class Child extends Parent{
    // Ini adalah variable hiding - membuat field name baru di Child
    // yang "menyembunyikan" field name dari Parent (di java tidak ada yang namanya attribute overrriding)
    String name;

    void doIt(){
        System.out.println("Do it in child");
        // super.name adalah null karena kita belum pernah mengatur nilai name parent
        System.out.println("Parent name is " + super.name);
    }
}