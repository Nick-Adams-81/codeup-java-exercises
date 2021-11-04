package InterfacsAbstractLec;

public class Company {

    public static void main(String[] args) {

        Employee bot = new Accountant("Accountant bot", "accounting");
        Employee custodian = new Custodian("jack", "custodian");
        Employee nick = new Programmer("Nick", "Developer");

        System.out.println(bot.work());
        System.out.println("My name is: " + bot.getName());
        System.out.println("I work in the " + bot.getDepartment() + " department");
        System.out.println("Morning meetings: " + bot.morningMeetings());
        System.out.println("Lunch starts at: " + bot.lunchTime());
        System.out.println("My pay daily is: " + bot.dailyPay());
        System.out.println();

        System.out.println(custodian.work());
        System.out.println(custodian.getName());
        System.out.println(custodian.getDepartment());
        System.out.println();

        System.out.println(nick.work());
        System.out.println(nick.getName());
        System.out.println(nick.getDepartment());

    }

}
