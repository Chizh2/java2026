public class pract22 {
    enum Day {
        MONDAY("Start"),
        FRIDAY("Weekend");

        String text;

        Day(String text) {
            this.text = text;
        }
    }

    public static void main(String[] args) {

        Day d = Day.MONDAY;

        System.out.println(d);
        System.out.println(d.text);
    }
}