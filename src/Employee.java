public class Employee extends Person {


   public Employee(String employeeName, int age) {
       super(employeeName, age);
   }

   public int getAge() {
       return this.age;
   }

   public void sayHello() {
       System.out.println("Welcome to Skynet, how can we help you " + this.name + " ?");
   }

   public void doWork() {
       System.out.println("work, work, work....");
   }

    public static void main(String[] args) {

        Person unemployed = new Person("Nikki", 40);
        Employee nick = new Employee("Nick", 40);

        unemployed.sayHello();
        nick.sayHello();
        System.out.println("name = " + nick.getName());
        System.out.println(nick.getName() + ", " + nick.getAge());
        nick.doWork();
    }

}
