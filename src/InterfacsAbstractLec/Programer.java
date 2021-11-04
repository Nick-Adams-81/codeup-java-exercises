package InterfacsAbstractLec;

public class Programer extends Employee{


    public Programer(String name, String department) {
        super(name, department);
    }


    public String work() {
        return "Programming new app!";
    }
}
