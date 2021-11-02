public class Employee extends Person {


   public Employee(String employeeName) {
       super(employeeName);
   }

   public void sayHello() {
       System.out.println("Welcome to Skynet, how can we help you?");
   }

   public void doWork() {
       System.out.println("work, work, work....");
   }

    public static void main(String[] args) {

        Person unemployed = new Person("Nikki");
        Employee nick = new Employee("Nick");

        unemployed.sayHello();
        nick.sayHello();
        System.out.println("name = " + nick.getName());

        nick.doWork();


    }

}
