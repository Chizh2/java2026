import java.util.Formatter;
public class pract38 {
    public static void main(String[] args) {
        Formatter f = new Formatter();

        // %d — целое число
        f.format("Number: %d%n", 100);

        // %f — число с плавающей точкой
        f.format("Float: %f%n", 10.5);

        // %s — строка
        f.format("String: %s%n", "Hello");

        // %b — логическое значение
        f.format("Boolean: %b%n", true);

        // %c — символ
        f.format("Char: %c%n", 'A');

        System.out.println(f);

        f.close();
    }
}
