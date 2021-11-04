package InterfacsAbstractLec;

public class Accountant extends Employee {


    public Accountant(String name, String department) {
        super(name, department);
    }

    public String work() {
       return "TPS reports have been drafted!";
   }

   public String morningMeetings() {
        return "morning meeting starts at 9 am and ends at 945";
   }

   public String lunchTime() {
        return "We take lunch whenever we want";
   }

   public int dailyPay() {
       return 250;
   }

}
