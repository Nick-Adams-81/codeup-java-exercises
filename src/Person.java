

public class Person {

    // instance variables
    public String firstName;
    public String lastName;
    public int age;

    //instance method
    public String joinChat() {
        return lastName + " , " + firstName + " has joined the chat.";
    }


    public static void main(String[] args) {

        Person nick = new Person();
        nick.firstName = "Nick";
        nick.lastName = "Adams";
        nick.age = 40;
        System.out.printf("%s %s is my name \n", nick.firstName, nick.lastName);

        System.out.println(nick.joinChat());
    }
}



