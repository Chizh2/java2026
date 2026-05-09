import java.util.Arrays;
public class pract16 {
    public static void main(String[] args) {
        int[] a = {3, 2, 8, 1, 7};
        int[] b = {5, 2, 9, 1, 7};

        // toString
        System.out.println(Arrays.toString(a));

        // sort
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        // binarySearch
        int index = Arrays.binarySearch(a, 7);
        System.out.println(index);

        // equals
        System.out.println(Arrays.equals(a, b));

        // compare (сравнение массивов)
        System.out.println(Arrays.compare(a, b));
    }
}