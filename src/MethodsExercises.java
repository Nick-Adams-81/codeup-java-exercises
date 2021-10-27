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
            System.out.println("Thank you");
            return userNumber;
        } else {
            return getInteger(min, max);
        }
    }

    public static long factoral(int n) {
        long num = 1;
        for(int i = 2; i <= n; i++) {
            num = num * i;
        }
        return num;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean confirm;
        do{
            System.out.println(factoral(getInteger(1, 10)));
            System.out.println("Continue? [y/n]");
            String userConfirm = scanner.nextLine();
            confirm = userConfirm.equalsIgnoreCase("y");
        } while(confirm);

//        System.out.println(addition(4, 5));
//        System.out.println(subtraction(9, 5));
//        System.out.println(multiplication(3, 5));
//        System.out.println(division(10, 3));
//        System.out.println(remainder(8, 3));

    }

}
