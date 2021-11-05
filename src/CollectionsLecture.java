import java.util.ArrayList;

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

        System.out.println(nums);

    }
}
