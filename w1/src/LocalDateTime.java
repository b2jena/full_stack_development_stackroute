import java.time.*;
public class LocalDateTime {
    public static void main(String[] args){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println("Local Date is : " + localDate);
        System.out.println("Local Time is : " + localTime);
    }
}
