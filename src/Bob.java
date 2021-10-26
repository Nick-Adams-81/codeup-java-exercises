
import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



            System.out.println("Say something...");
            String input = scanner.nextLine();
            System.out.printf("You said %s \n", input);

            if(input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if(input.endsWith("?")) {
                System.out.println("Sure.");
            } else if(input.equals("")) {
                System.out.println("Fine, Be that way!");
            } else {
                System.out.println("Whatever");
            }


    }
}
