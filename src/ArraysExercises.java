import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {


    public static String[] addPerson(String[] Person) {

        String[] newPerson = new String[Person.length + 1];
        for(int i = 0; i < Person.length; i++) {
            newPerson[i] = Person[i];
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("input a new name");
        newPerson[newPerson.length - 1] = scanner.nextLine();
        System.out.println("New person array: " + Arrays.toString(newPerson));


        return newPerson;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        String[] Person = new String[3];
        Person[0] = "Nick";
        Person[1] = "Chris";
        Person[2] = "John";

        System.out.println("old person array: " + Arrays.toString(Person));
        Person = addPerson(Person);

        for (String name : Person) {
            System.out.println(name);
        }




    }
}
