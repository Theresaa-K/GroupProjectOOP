package CodingQuestions;
import java.util.List;
import java.util.stream.Collectors;
//Done by Saadia

public class StartWithA {
    public static void main(String[] args) {
        List<String> strings = List.of("Alexander", "Brandon", "Ava", "Carrie", "Anaya");
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.startsWith("A") || s.startsWith("a"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(filteredStrings);

    }
}
