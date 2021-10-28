public class Student {

    public String name;
    public String cohort;
    public int gradYear;

    // adding a constructor
    public Student(String studentName) {
//        name = studentName;
//        cohort = "Unassigned";

        // calling constructor inside a constructor
        this(studentName, "unassigned");
    }

    public Student(String studentName, String StudentCohort) {
        this.name = studentName;
        this.cohort = StudentCohort;
    }

    public Student(String studentName, String studentCohort, int graduationYear) {
        name = studentName;
        cohort = studentCohort;
        gradYear = graduationYear;

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

        Student mike = new Student("Mike", "rome", 2022);
        System.out.println(mike.name + " " + mike.cohort + " " + mike.gradYear);
    }
}
