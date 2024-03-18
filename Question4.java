import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class Question4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Birthday date in yyyy-MM-dd");
        String date = s.nextLine();
        LocalDate Date1= LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        LocalDate currentdate = LocalDate.now();
        Period age = Period.between(Date1 , currentdate);
        System.out.println("The year is : "+age.getYears() + " The month is  : "+age.getMonths()+" The days are "
        +age.getDays());

}
}
