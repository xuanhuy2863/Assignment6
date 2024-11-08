import java.util.ArrayList;

public class CityNames {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Phoenix");
        System.out.println("City Names:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}