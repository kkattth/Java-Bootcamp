package sef.module8.activity;

// Needs to be completed
import java.util.HashMap;
import java.util.Map;

public class MapActivity {

    public static void main(String[] args) {
        // 1 - Type code to create a HashMap of key-value pairs
        // where key is id of type String and value is a name
        Map<String, String> map = new HashMap<>();

        map.put("1","Cat");
        map.put("2","Dog");
        map.put("3","Mouse");
        map.put("4","Parrot");

        // 2 - Call print method to print the map passed as its parameter.
        // (Hint: Notice print() is a non-static method, so create an instance of MapActivity)
        MapActivity a = new MapActivity();
        a.print(map);

    }

    void print(Map map) {
        // 3 - Type code to print this map (keys and values)
        System.out.println(map);

    }
}
