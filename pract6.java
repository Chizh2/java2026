public class pract6 {
    public static void main(String[] args) {

        int i = 130;
        byte b = (byte) i;   // сужение int → byte

        long l = 1000L;
        int i2 = (int) l;    // long → int

        double d = 9.99;
        float f = (float) d; // double → float

        int i3 = (int) d;    // double → int (дробная часть теряется)

        System.out.println(b);
        System.out.println(i2);
        System.out.println(f);
        System.out.println(i3);
    }
}