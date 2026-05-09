import java.util.*;

public class pract20{

    // extends только читаем
    public static void printNumbers(List<? extends Number> list) {
        System.out.println("EXTENDS (read only):");
        for (Number n : list) {
            System.out.println(n);
        }
    }

    // super только пишем
    public static void addIntegers(List<? super Integer> list) {
        System.out.println("SUPER (write):");

        list.add(10);
        list.add(20);

         System.out.println("added values");
    }

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        // ? extends Number
        printNumbers(ints);

        // ? super Integer
        addIntegers(numbers);
        addIntegers(objects);
    }
}




