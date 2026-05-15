import java.io.*;

public class pract44 {
    public static void main(String[] args) {

        // ПРАКТИКА #1 — InputStream + read()
        try (FileInputStream fis = new FileInputStream("input.txt")) {

            System.out.println("InputStream read()");

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

            System.out.println();

        } catch (IOException e) {
            System.out.println("Input error: " + e.getMessage());
        }

        // ПРАКТИКА #2  OutputStream + write(int)
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {

            System.out.println("OutputStream write(int)");

            String text = "Hello Java";

            for (int i = 0; i < text.length(); i++) {
                fos.write(text.charAt(i));
            }

            fos.flush(); 

        } catch (IOException e) {
            System.out.println("Output error: " + e.getMessage());
        }

        // ПРАКТИКА #4 — AutoCloseable
        try (MyResource res = new MyResource()) {

            System.out.println("AutoCloseable");
            res.doSomething();

        } catch (Exception e) {
            System.out.println("Resource error: " + e.getMessage());
        }
    }
}

// AutoCloseable пример
class MyResource implements AutoCloseable {

    public void doSomething() {
        System.out.println("Working with resource...");
    }

   @Override
    public void close() {
        System.out.println("Resource closed automatically!");
    }
}
