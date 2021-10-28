public class Student {


    public String name;
    public String cohort;

    // adding a constructor
    public Student(String studentName) {
        name = studentName;
        cohort = "Unnasigned";
    }

    public Student(String studentName, String StudentCohort) {
        name = studentName;
        cohort = StudentCohort;
    }


    public static void main(String[] args) {
        // before constructors:
//        Student nick = new Student();
//        nick.name = "Nick";
//        nick.cohort = "quasar";
//
//        System.out.println(nick.name + " " + nick.cohort);

        Student nick = new Student("Nick Adams");
        System.out.println(nick.name + ", " + nick.cohort);

        Student ken = new Student("ken", "deimos");
        System.out.println(ken.name + " " + ken.cohort);
    }
}
