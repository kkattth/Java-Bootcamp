package module10;
import java.util.HashMap;


public class ElectronicItemDetails {

// making the method of getting the price of an item
    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {

        return itemHashMap.get(name);
    }
    public static void main(String[] args) {
        ElectronicItemDetails items = new ElectronicItemDetails();
        HashMap<String, Double> itemHashMap = new HashMap<String, Double>(); //creating the actual hashmaop itself
        itemHashMap.put("TV", 1300.0);
        itemHashMap.put("Refrigerator", 2000.0);
        itemHashMap.put("Washing Machine", 500.0);
        itemHashMap.put("Laptop", 1700.0);

        System.out.println("Price of TV is " + items.returnPriceOfItem(itemHashMap, "TV")); // so i call the method returnPriceOfItem and pass the parameters i look for in this example TV and get the value of it

    }

    }
