class Ex1 extends Exception {
    public Ex1(String msg) {
        super(msg);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String msg) {
        super(msg);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String msg) {
        super(msg);
    }
}

public class pract42 {
    public static void main(String[] args) {
        //Несколько исключений обрабатываются одинаково
        try {
            int a = 10 / 0;                 // ArithmeticException
            String s = null;
            s.length();                    // NullPointerException
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Одинаковая обработка: " + e);
        }

        //Иерархия исключений Ex1 < Ex2 < Ex3
        try {
            throw new Ex3("Ошибка Ex3");
        } catch (Ex3 e) {
            System.out.println("Пойман Ex3: " + e.getMessage());
        } catch (Ex2 e) {
            System.out.println("Пойман Ex2: " + e.getMessage());
        } catch (Ex1 e) {
            System.out.println("Пойман Ex1: " + e.getMessage());
        }
    }
}
