public class pract35 {

    public static void main(String[] args) {

        String s = "Hello Java";

        // length() — длина строки
        System.out.println(s.length());

        // charAt() — символ по индексу
        System.out.println(s.charAt(1));

        // substring() — подстрока
        System.out.println(s.substring(0, 5));

        // toUpperCase() — в верхний регистр
        System.out.println(s.toUpperCase());

        // toLowerCase() — в нижний регистр
        System.out.println(s.toLowerCase());

        // contains() — проверка подстроки
        System.out.println(s.contains("Java"));

        // equals() — сравнение строк
        System.out.println(s.equals("Hello Java"));

        // replace() — замена символов/строк
        System.out.println(s.replace("Java", "World"));

        // indexOf() — поиск индекса
        System.out.println(s.indexOf("Java"));

        // trim() — убирает пробелы по краям
        String s2 = "   test   ";
        System.out.println(s2.trim());
    }
}