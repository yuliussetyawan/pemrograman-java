public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorner());

        var rectable = new Rectangle();
        // memanggil super keyword dari parent
        System.out.println(rectable.getParentCorner());
    }

}
