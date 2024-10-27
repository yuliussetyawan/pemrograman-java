public class KonversiNumber {
    public static void main(String[] args) {
//        Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

//        Narrowing Casting (Manual) : double -> float -> long -> int -> char ->  short -> byte
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;
    }
}
