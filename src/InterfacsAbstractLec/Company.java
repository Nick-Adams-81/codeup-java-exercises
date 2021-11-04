package InterfacsAbstractLec;

public class Company {

    public static void main(String[] args) {

        Accountant bot = new Accountant("Accountant bot", "accounting");
        Custodian custodian = new Custodian("jack", "custodian");

        System.out.println(bot.work());
        System.out.println(bot.getName());
        System.out.println(bot.getDepartment());

        System.out.println(custodian.work());
        System.out.println(custodian.getName());
        System.out.println(custodian.getDepartment());


    }

}
