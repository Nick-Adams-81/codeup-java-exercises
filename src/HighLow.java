import java.util.Scanner;

public class HighLow {



    public static int randomInt(int Min, int Max) {
        return (int) (Math.random()*(Max-Min))+Min;
    }


    public static void game() {

        boolean confirm = false;
        int randomNumber = randomInt(1, 100);
        while (!confirm) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Pick a number from 1 to 100");
            int userInput = sc.nextInt();

            if(userInput < randomNumber) {
                System.out.println("Higher!");
            } else if(userInput > randomNumber) {
                System.out.println("Lower!");
            } else {
                System.out.println("Good guess!");
                confirm = true;
            }
        }
    }

    public static void main(String[] args) {
        game();
    }
}
