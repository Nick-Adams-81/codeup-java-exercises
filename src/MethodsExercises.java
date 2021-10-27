import java.util.Scanner;

public class MethodsExercises {

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static float division(float num1, float num2) {
        return num1 / num2;
    }

    public static int remainder(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10:");
        int userNumber = sc.nextInt();
        if(userNumber <= max && userNumber >= min) {
            return userNumber;
        } else {
            return getInteger(min, max);
        }
    }



    public static long factoral(int n) {
        long num = 1;
        for(int i = 1; i <= n; i++) {
            num = num * i;
            System.out.println(i + "!" + " = " + num);
        }
        return num;
    }

    public static void userInputFactoral() {
        Scanner scanner = new Scanner(System.in);
        boolean confirm;
        do{
            System.out.println(factoral(getInteger(1, 10)));
            System.out.println("Continue? [y/n]");
            String userConfirm = scanner.nextLine();
            confirm = userConfirm.equalsIgnoreCase("y");
        } while(confirm);

    }


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


    public static void diceRoll() {
        Scanner scanner = new Scanner(System.in);
        boolean confirm;
        do{
            System.out.println("How many sided dice do you want to roll?");
            int res = scanner.nextInt();
            if(res == 6) {
                int random = randomInt(2, 12);
                System.out.println("You rolled a " + random);
            } else if(res == 8) {
                int random = randomInt(2, 16);
                System.out.println("You rolled a " + random);
            } else if(res == 10) {
                int random = randomInt(2, 30);
                System.out.println("You rolled a " + random);
            } else {
                System.out.println("I dont have that many sided dice!");
            }
            System.out.println("Roll again? [y/n]");
            String response = scanner.next();
            confirm = response.equalsIgnoreCase("y");
        }while(confirm);
    }

    public static void main(String[] args) {

//        diceRoll();
        game();
//        userInputFactoral();
//        System.out.println(addition(4, 5));
//        System.out.println(subtraction(9, 5));
//        System.out.println(multiplication(3, 5));
//        System.out.println(division(10, 3));
//        System.out.println(remainder(8, 3));

    }

}
