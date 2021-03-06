import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLecture {

    public static void main(String[] args) {

        //normal array, harder to work with
        String[] nameOfVar = {"thing1", "thing2", "thing3"};


        // arrayList method
        ArrayList<String> nameOfVar2 = new ArrayList<>();

        nameOfVar2.add("Nick");
        nameOfVar2.add("Steve");
        nameOfVar2.add("john");

        System.out.println(nameOfVar2);
        System.out.println(nameOfVar2.get(2));


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(22);
        nums.add(120);
        nums.add(0, 7);
        nums.add(3, 14);
        nums.add(1, 14);

        System.out.println(nums);
        System.out.println(nums.contains(22));
        System.out.println(nums.isEmpty());
        System.out.println(nums.lastIndexOf(7));
        nameOfVar2.remove("Steve");

        // remove a number based on the object Integer
        nums.remove((Integer) 14);

        System.out.println(nums);

        // removing numbers based on index
        nums.remove(3);

        System.out.println(nameOfVar2);
        System.out.println(nums);

        // advanced for loop to iterate over an array list
        for(int number : nums) {
            System.out.println(number);
        }

        // Hash Maps
        System.out.println(" ====== Hash Maps ====== ");

        HashMap<String, String> nameVar = new HashMap<>();

        nameVar.put("Nick", "Nick Adams");
        nameVar.put("John", "John doe");
        nameVar.put("Ben", "Ben Sisko");

        System.out.println(nameVar);
        System.out.println(nameVar.get("Nick"));
        System.out.println(nameVar.getOrDefault("Alex", "No user found"));
        System.out.println(nameVar.containsKey("Ben"));
        System.out.println(nameVar.containsValue("John doe"));

        nameVar.putIfAbsent("Alex", "Alex Jones");
        System.out.println(nameVar);
        nameVar.remove("Alex");
        System.out.println(nameVar);
        nameVar.replace("John", "Jake");
        System.out.println(nameVar);
        nameVar.clear();
        System.out.println(nameVar);
        System.out.println(nameVar.isEmpty());

    }
}
