public class pract41 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Поймано исключение: " + e);
        }
        int[] arr = {1, 2, 3};

        // следующая строка вызовет ArrayIndexOutOfBoundsException
        System.out.println(arr[10]);

        System.out.println("Этот код не выполнится");
    }
}


