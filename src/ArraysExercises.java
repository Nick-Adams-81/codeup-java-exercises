import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        String[] Person = new String[3];
        Person[0] = "Nick";
        Person[1] = "Chris";
        Person[2] = "John";

        for (String name : Person) {
            System.out.println(name);
        }




    }
}
