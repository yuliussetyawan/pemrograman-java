public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

//      Tipe data primitif: byte, short, int, long, float, double, char, boolean

        Integer iniInteger = 100;
        Long iniLong = 10000L;

//        default value untuk data bukan primitif = null
//        untuk tipe data primitif default value = 0
        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int iniInt = 100;

        Integer iniObject = iniInt;

//        konversi ke tipe data primitif
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 1000000L;

    }
}