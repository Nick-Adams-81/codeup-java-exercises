public class Student {

    public String name;
    public String cohort;
    private double grade;
    public int gradYear;

    // adding a constructor
    public Student(String studentName) {
//        name = studentName;
//        cohort = "Unassigned";

        // calling constructor inside a constructor
        this(studentName, "unassigned");
    }

    public double shareGrade() {
        return grade;
    }

    public Student(String studentName, String StudentCohort) {
        this.name = studentName;
        this.cohort = StudentCohort;
    }

    public Student(String studentName, String studentCohort, int graduationYear) {
        this.name = studentName;
        this.cohort = studentCohort;
        this.gradYear = graduationYear;
    }

    public Student(String studentName, String studentCohort, int graduationYear, double studentGrade) {
        this.name = studentName;
        this.cohort = studentCohort;
        this.gradYear = graduationYear;
        this.grade = studentGrade;
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

        Student john = new Student("john", "grecce", 2022, 87.5);
        System.out.println(john.name + " " + john.cohort + " " + john.gradYear + " " + john.grade);
    }
}
