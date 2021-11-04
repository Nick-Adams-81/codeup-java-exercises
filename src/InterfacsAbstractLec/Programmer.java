package InterfacsAbstractLec;

public class Programmer extends Employee {


    public Programmer(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "Programming new app!";
    }

    public String morningMeetings() {
        return "No Morning meeting for us!";
    }

    public String lunchTime() {
        return "whenever";
    }

    public int dailyPay() {
        return 300;
    }

}
