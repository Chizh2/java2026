public class pract37 {
    public static void main(String[] args) {
        // Практика 1
        StringBuilder sb = new StringBuilder("Hello");

        // append() — добавление в конец строки
        sb.append(" World");

        // insert() — вставка по индексу
        sb.insert(5, ",");

        // delete() — удаление диапазона
        sb.delete(5, 6);

        // replace() — замена части строки
        sb.replace(0, 5, "Hi");

        // reverse() — переворот строки
        sb.reverse();

        // length() — длина строки
        System.out.println("Length: " + sb.length());

        // capacity() — текущая ёмкость
        System.out.println("Capacity: " + sb.capacity());

        // charAt() — символ по индексу
        System.out.println("Char: " + sb.charAt(0));

        // setCharAt() — замена символа
        sb.setCharAt(0, 'Y');

        // toString() — преобразование в String
        String strFromBuilder = sb.toString();


        StringBuffer sbuf = new StringBuffer("Java");

        sbuf.append(" Language");   // добавление
        sbuf.insert(4, "-");        // вставка
        sbuf.delete(4, 5);          // удаление
        sbuf.reverse();             // переворот
        sbuf.replace(0, 4, "Code"); // замена

        System.out.println(sbuf.length());   // длина
        System.out.println(sbuf.capacity());  // ёмкость
        System.out.println(sbuf.charAt(1));   // символ
        sbuf.setCharAt(1, 'X');              // изменение символа

        String strFromBuffer = sbuf.toString();

        // Практика 2

        String s = "Hello";
        StringBuilder sb2 = new StringBuilder(s);
        StringBuffer sbuf2 = new StringBuffer(s);

        // StringBuilder -> String
        String s1 = sb2.toString();

        // StringBuffer -> String
        String s2 = sbuf2.toString();

        // StringBuilder -> StringBuffer
        StringBuffer sbuf3 = new StringBuffer(sb2.toString());

        // StringBuffer -> StringBuilder
        StringBuilder sb3 = new StringBuilder(sbuf2.toString());
    }
}
