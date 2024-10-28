public class MethodReturnValue {
    public static void main(String[] args) {
        var result1 = sum(100, 100);
        System.out.println(result1);

        System.out.println(sum(200, 200));
        System.out.println(hitung(100, "+" , 100));
        System.out.println(hitung(200, "-", 100));
    }

    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operator, int value2){
        switch (operator){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
