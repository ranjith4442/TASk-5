import java.lang.reflect.Array;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Question3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the no of students : ");
        int count = s.nextInt();
        List<String> names = new ArrayList<>();
        System.out.println("Enter the names : ");
        for (int i = 0 ; i<count;i++)
        {
           names.add(s.next());
        }
        List<String> filter= names.stream().filter(a->a.startsWith("A")||a.startsWith("a")).collect(Collectors.toList());
        System.out.println("The student names starting with A is : " + filter);
    }

}
