public class pract4 {

    public static void main(String[] args) {

        String name = "Илья";
        int age = 20;
        double height = 1.93;
        boolean isStudent = true;

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Студент: " + isStudent);

        // пример склейки разных типов в одной строке
        System.out.println("Студент " + name + " имеет возраст " + age + " лет и рост " + height);
    }
}