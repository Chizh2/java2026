import java.util.Date;
import java.util.Formatter;
public class pract39 {
    public static void main(String[] args) {
        Date now = new Date();
        
        Formatter f = new Formatter();

        // %tH — часы (00–23)
        f.format("Hour (24h): %tH%n", now);

        // %tM — минуты
        f.format("Minutes: %tM%n", now);

        // %tS — секунды
        f.format("Seconds: %tS%n", now);

        // %tY — год (4 цифры)
        f.format("Year: %tY%n", now);

        // %tB — название месяца
        f.format("Month: %tB%n", now);

        System.out.println(f);

        f.close();
    }
}
