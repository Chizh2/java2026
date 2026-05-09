public class pract10 {
    public static void main(String[] args) {
        Integer a = Integer.decode("12");// 12 (десятичная)
        Integer b = Integer.decode("012");// 10 (восьмеричная!)
        Integer c = Integer.decode("0x12");// 18 (шестнадцатеричная)

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}