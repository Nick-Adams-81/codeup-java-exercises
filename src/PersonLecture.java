

public class PersonLecture {

    // instance variables
    public String firstName;
    public String lastName;
    public int age;


    //instance method
    public String joinChat() {
        return lastName + ", " + firstName + " has joined the chat.";
    }
    // make a static property - reping the world pop
    public static long worldPop = 7_900_000_000L;


    public static void main(String[] args) {

        PersonLecture nick = new PersonLecture();
        PersonLecture ken = new PersonLecture();
        ken.firstName = "Ken";
        ken.lastName = "Howell";
        ken.age = 34;

        nick.firstName = "Nick";
        nick.lastName = "Adams";
        nick.age = 40;

        System.out.printf("%s %s is my name, %s is my age \n", nick.firstName, nick.lastName, nick.age);
        System.out.printf("%s %s is my teachers name, %s is his age \n", ken.firstName, ken.lastName, ken.age);
        System.out.println(nick.joinChat());
        System.out.println(ken.joinChat());
        System.out.println("World pop = " + worldPop);

        PersonLecture doug = new PersonLecture();
        doug.firstName = "Doug";
        doug.lastName = " Hirsh";

        // how to add new person to world count
        PersonLecture.worldPop += 1;
        System.out.println("world pop + " + worldPop);
//        System.out.println(Person.firstName); // compile time error, can't talk to non static property


    }
}



