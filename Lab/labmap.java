import java.util.HashMap;
import java.util.Map;
public class labmap {


    public static void main(String[] args) {
        // Create a HashMap with some key-value pairs
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Jeevan", 1);
        myMap.put("Alatf", 2);
        myMap.put("Raj", 3);
        myMap.put("Vinit", 4);

        // Get the size of the map using the size() method
        int size = myMap.size();

        // Print the size of the map
        System.out.println("The size of the map is: " + size);
    }
}

    

