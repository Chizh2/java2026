class MyFirstException extends Exception {
    public MyFirstException() {
        super();
    }

    public MyFirstException(String message) {
        super(message);
    }

    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class pract43 {
    public static void main(String[] args) {

        try {
            throw new MyFirstException("Моё собственное исключение");
        } catch (MyFirstException e) {
            System.out.println("Поймано: " + e.getMessage());
        }
    }
}
