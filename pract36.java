import java.util.StringJoiner;
public class pract36 {
    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(", ");

        sj.add("Cat");
        sj.add("Dog");
        sj.add("Wolf");

        System.out.println(sj.toString());
    }
}