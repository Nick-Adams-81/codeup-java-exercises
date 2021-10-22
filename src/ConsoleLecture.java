import java.util.Scanner;

public class ConsoleLecture {

    public static void main(String[] args) {
        String name = "Nick";
        System.out.printf("Hello there, %s. Nice to see you.\n", name);

        String greeting = "Wassup";
        String name2 = "Quasar";
        int number = 40;
        System.out.printf("%s, %s, %s!", greeting, name2, number);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");


    }
}
