public class pract21{
    // метод с int 
    void print(int... nums) {
        System.out.println("int version");
        for (int n : nums) {
            System.out.println(n);
        }
    }
    // перегруженный метод с String 
    void print(String... texts) {
        System.out.println("String version");
        for (String t : texts) {
            System.out.println(t);
        }
    }
}

class Main {
    public static void main(String[] args) {
        pract21 t = new pract21();

        t.print(1, 2, 3);       // int
        t.print("A", "B");      // String
    }
}
