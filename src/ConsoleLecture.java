import java.util.Scanner;

public class ConsoleLecture {

    public static void main(String[] args) {
        String name = "Nick";
        System.out.printf("Hello there, %s. Nice to see you.\n", name);

        // printf
        String greeting = "Wassup";
        String name2 = "Quasar";
        int number = 40;
//        System.out.printf("%s, %s, %s!", greeting, name2, number);

        // scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.printf("You entered: %s", userInput);

    }
}
