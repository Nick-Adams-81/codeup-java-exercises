package InterfacsAbstractLec;

public class Company {

    public static void main(String[] args) {

        Employee bot = new Accountant("Accountant bot", "accounting");
        Employee custodian = new Custodian("jack", "custodian");
        Employee nick = new Programer("Nick", "Developer");

        System.out.println(bot.work());
        System.out.println(bot.getName());
        System.out.println(bot.getDepartment());

        System.out.println(custodian.work());
        System.out.println(custodian.getName());
        System.out.println(custodian.getDepartment());

        System.out.println(nick.work());
        System.out.println(nick.getName());
        System.out.println(nick.getDepartment());


    }

}
