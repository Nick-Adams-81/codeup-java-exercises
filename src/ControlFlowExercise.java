import java.util.Scanner;

public class ControlFlowExercise {

    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i: " + i);
//            i++;
//        }

//        int j = 0;
//        do {
//            System.out.println("The count is: " + (j));
//            j += 2;
//        } while(j <= 100);


//        int k = 100;
//        do {
//            System.out.println("K:" + k);
//            k -= 5;
//        } while(k >= 0);


//        long l = 2;
//        do {
//            System.out.println("Count: " + l);
//            l *= l;
//        } while(l < 10000000);


//        for (int y = 1; y <= 100; y++) {
//            if(y % 15 == 0) {
//                System.out.println("Fizz Buzz");
//            } else if (y % 3 == 0) {
//                System.out.println("Fizz");
//            } else if(y % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(y);
//            }
//        }

//
        Scanner scanner = new Scanner(System.in);


        boolean userConfirm;
        do {
            System.out.print("Enter a number please: ");
            int userNum = scanner.nextInt();
            System.out.println(" Here is your table!");
            System.out.println("");
            System.out.println("Number  |  Squared  |  Cubed ");
            System.out.println("------  |  -------  |  ----- ");
            for (int z = 1; z <= userNum; z++) {
                System.out.printf("%-8d| %-10d| %-10d\n", z, z * z, z * z * z);
            }
            System.out.println("Continue? [y/n]");
            String response3 = scanner.next();
            userConfirm = response3.equals("y");

        } while(userConfirm);

//

        boolean confirm;

        do {
            System.out.print("Enter a numerical grade from 0 to 100 please: ");
            int input = scanner.nextInt();
            if (input >= 88) {
                System.out.println("Your grade is an 'A'. \n");
            } else if (input >= 80) {
                System.out.println("Your grade is a 'B'. \n");
            } else if (input >= 67) {
                System.out.print("Your grade is a 'C'. \n");
            } else if (input >= 60) {
                System.out.println("Your grade is a 'D'. \n");
            } else {
                System.out.println("Your grade is an 'F'. \n");
            }

            System.out.println("Continue? [y/n]");
            String response2 = scanner.next();
            confirm = response2.equals("y");

        } while (confirm);


    }
}
