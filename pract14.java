public class pract14{
    enum Day { MON, TUE }
    public static void main(String[] args) {
        // int
        int i = 1;
        switch (i) {
            case 1: System.out.println("int 1"); break;
            default: System.out.println("int other"); break;
        }

        // byte
        byte b = 1;
        switch (b) {
            case 1: System.out.println("byte 1"); break;
            default: System.out.println("byte other"); break;
        }

        // short
        short s = 2;
        switch (s) {
            case 2: System.out.println("short 2"); break;
            default: System.out.println("short other"); break;
        }

        // char
        char c = 'A';
        switch (c) {
            case 'A': System.out.println("char A"); break;
            case 'B': System.out.println("char B"); break;
        }

        // Integer
        Integer in = 1;
        switch (in) {
            case 1: System.out.println("Integer 1"); break;
            default: System.out.println("Integer other"); break;
        }

        // String
        String str = "dog";
        switch (str) {
            case "dog": System.out.println("Dog!"); break;
            case "Cat": System.out.println("Cat!"); break;
        }

        // enum
        Day day = Day.MON;
        switch (day) {
            case MON: System.out.println("Monday"); break;
            case TUE: System.out.println("Tuesday"); break;
        }
    }
}