import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("abc","","bc","efg","abcd","","jkl");
        List<String> empty = names.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
        System.out.println(empty);
    }
}
