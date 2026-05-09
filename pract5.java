public class pract5 {
    public static void main(String[] args) {
        byte a = 10;
        int b = 20;
        long c = 30L;
        float d = 2.5f;
        double e = 5.5;

        // byte + int → int
        int r1 = a + b;

        // int + long → long
        long r2 = b + c;

        // long + float → float
        float r3 = c + d;

        // float + double → double
        double r4 = d + e;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
//В арифметических выражениях Java автоматически выполняет расширяющие преобразования типов. Операнды приводятся к типу с более высоким приоритетом, и результат выражения имеет этот тип
