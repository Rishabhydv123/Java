import java.time.LocalDate;
import java.time.LocalTime;
public class String{
    public static void main(String[] args) {
        LocalDate Date=LocalDate.now();
        System.out.println("Today date is :" +Date);

        LocalTime lt=LocalTime.now();
        System.out.println("Today Timing is :" +lt);
    }
}
