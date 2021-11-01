import java.util.Scanner;
public class Candy {



    public static String candyName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the candy name: ");
        return scanner.nextLine();
    }

    public static String candySize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the candy size: ");
        return scanner.nextLine();
    }


    public static void main(String[] args) {
        System.out.println("Ahhh, a " + candyName() + "! I see that you got the " + candySize() + " size of it. Sounds good!!!");
    }
}
