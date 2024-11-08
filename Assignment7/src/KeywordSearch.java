import java.util.ArrayList;

public class KeywordSearch {

    public static void main(String[] args) {
        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("Java");
        keywords.add("Python");
        keywords.add("C++");
        keywords.add("JavaScript");
        boolean containsPython = keywords.contains("Python");
        System.out.println("Contains 'Python': " + containsPython);
    }
}