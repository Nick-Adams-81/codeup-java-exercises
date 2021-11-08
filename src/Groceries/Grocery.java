package Groceries;
import java.util.HashMap;


public class Grocery {

    private HashMap<String, Integer> groceries;

    public Grocery() {
        this.groceries = new HashMap<>();
    }

    public HashMap<String, Integer> getgroceries() {
        return this.groceries;
    }

    public void addGrocery(String name, int total) {
        this.groceries.put(name, total);
    }




}
