import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Question1 {
    public static void main(String[] args) {
       Stream<String> names = Stream.of("aBc", "d", "ef");
       List<String> Uppercase = names.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(Uppercase);

    }
}