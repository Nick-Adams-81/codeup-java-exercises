public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Person(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Person nick = new Person("nick");
        nick.name = "Nick";

        nick.setName("Adam");
        System.out.println(nick.getName());
        nick.sayHello();

        Person person1 = new Person("john");
        person1.name = "John";
        Person person2 = new Person("chris");
        person2.name = "John";
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

    }
}
