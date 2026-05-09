class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class pract19{
    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>(10);
        Box<String> b2 = new Box<>("hello");

        System.out.println(b1 instanceof Box); // true
        System.out.println(b2 instanceof Box); // true

        // проверка конкретного типа внутри 
        if (b1.getValue() instanceof Integer) {
            System.out.println("b1 contains Integer");
        }

        if (b2.getValue() instanceof String) {
            System.out.println("b2 contains String");
        }
    }
}