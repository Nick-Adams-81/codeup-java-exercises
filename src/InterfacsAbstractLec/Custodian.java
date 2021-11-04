package InterfacsAbstractLec;

public class Custodian extends Employee {


    public Custodian(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "Cleaning up messes!";
    }

    public String morningMeetings() {
        return " I dont have any meetings ever";
    }

    public String lunchTime() {
        return "12 noon til 1pm";
    }

    public int dailyPay() {
        return 50;
    }

}
