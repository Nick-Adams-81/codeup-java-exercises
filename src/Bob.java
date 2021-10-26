
import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        // initializing a scanner
        Scanner scanner = new Scanner(System.in);

        // initializing a boolean
        boolean confirm;
        do {

            // asking the user for some input
            System.out.println("Hey, i'm bob...");
            String input = scanner.nextLine();
            System.out.printf("You said %s \n", input);

            // checking the user input and sending a response based on the user input
            if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input.endsWith("?")) {
                System.out.println("Sure.");
            } else if (input.equals("")) {
                System.out.println("Fine, Be that way!");
            } else {
                System.out.println("Whatever");
            }

            // asking the user if they want to continue or end the program
            System.out.println("Keep talkin' to Bob? [y/n]");
            String response = scanner.nextLine();
            confirm = response.equalsIgnoreCase("y");

        } while(confirm);

    }
}
