public class pract23 {
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        SATURDAY,
        SUNDAY;

        // дополнительный метод
        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }

        // ещё один простой метод
        public void printDay() {
            System.out.println("Today is " + this);
        }

    }

    public static void main(String[] args) {
        Day d = Day.MONDAY;

        d.printDay();
        System.out.println(d.isWeekend());

        Day d2 = Day.SATURDAY;
        System.out.println(d2.isWeekend());
    }
}
