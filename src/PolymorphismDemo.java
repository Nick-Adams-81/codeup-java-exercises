public class PolymorphismDemo {


    public String name;
    public static void doWork(Worker w) {
        System.out.println(w.work());
    }


    public static void main(String[] args) {
        Worker one = new Worker();
        Worker two = new Manager();

        doWork(one);
        doWork(two);


    }


}
