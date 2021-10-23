import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately: %s \n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number please: ");
        int userInput = scanner.nextInt();
        System.out.printf("The number you entered was: %s \n",  userInput);

        System.out.print("enter three words: ");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();
        System.out.println("The three words you entered were: " + userInput1 + " " + userInput2 + " " + userInput3);


        System.out.print("enter a sentence: \n");
        scanner.nextLine();
        String userInput4 = scanner.nextLine();
        System.out.printf("Your sentence is: %s \n", userInput4);

        System.out.print("Enter a length and width value: ");
        float input1 = scanner.nextFloat();
        float input2 = scanner.nextFloat();
        System.out.println("The area of the room would be: " + (input1 * input2) + ", The perimeter of this room would be " + ((input1 * input1) + (input2 * input2)));

    }
}
