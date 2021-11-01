import java.util.Arrays;

public class ArraysExercises {


    public static Person[] addPerson(Person[] Person, Person name) {
        Person[] newPerson = Arrays.copyOf(Person, Person.length + 1);
        newPerson[newPerson.length - 1] = name;

        return newPerson;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] Person = new Person[3];
        Person[0] = new Person("Nick");
        Person[1] = new Person("Chris");
        Person[2] = new Person("John");

        Person adam = new Person("adam");
        Person ken = new Person("Ken");

        for(Person n : Person) {
            System.out.println(n.getName());
        }

        Person = addPerson(Person, adam);
        Person = addPerson(Person, ken);

        for(Person n : Person) {
            System.out.println(n.getName());
        }

    }

}
