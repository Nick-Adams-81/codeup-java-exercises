
import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        // initializing a scanner
        Scanner scanner = new Scanner(System.in);


        boolean confirm;
        do {
            System.out.println("Say something...");
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

            System.out.println("Continue? [y/n]");
            String response = scanner.nextLine();
            confirm = response.equalsIgnoreCase("y");

        } while(confirm);
        // asking the user for some input


    }
}
