public class pract11 {
    public static void main(String[] args) {
        // 1.valueOf(boolean)
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(false);

        // 2.valueOf(String)
        Boolean b3 = Boolean.valueOf("true");
        Boolean b4 = Boolean.valueOf("false");
        Boolean b5 = Boolean.valueOf("abc"); // false

        // 3.parseBoolean
        Boolean b6 = Boolean.parseBoolean("true");

        // 4.неявное создание
        Boolean b7 = true;
        Boolean b8 = false;

        // 5.через конструктор
        Boolean b9 = new Boolean(true);
        Boolean b10 = new Boolean("true");
    }
}