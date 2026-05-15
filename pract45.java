import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class pract45 {
    public static void main(String[] args) {
        try {
            // Scanner для чтения из файла
            Scanner fileScanner = new Scanner(new File("input.txt"));

            // чтение файла построчно / по словам
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
