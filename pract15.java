public class pract15 {
    public static void main(String[] args) {
        for (int i = 1; ; i++) { // бесконечный цикл
            if (i % 2 == 0) {
                continue; // пропускаем все чётные числа
            }
            if (i > 10) {
                break; // выходим из цикла
            }
            System.out.println(i);
        }
    }
}