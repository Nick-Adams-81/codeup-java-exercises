package InterfacsAbstractLec;

public class Custodian extends Employee{


    public Custodian(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "Cleaning up messes!";
    }
}
