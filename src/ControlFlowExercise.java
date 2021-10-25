import java.util.Scanner;

public class ControlFlowExercise {

    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i: " + i);
//            i++;
//        }

//
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


        long l = 2;
        do {
            System.out.println("Count: " + l);
            l *= l;
        } while(l < 10000000);


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


        Scanner scanner = new Scanner(System.in);
//


        boolean userConfirm = true;
        do {
            System.out.print("Enter a number please: ");
            int userNum = scanner.nextInt();
            System.out.println(" Here is your table!");
            System.out.println("");
            System.out.println("number  |  squared  |  cubed ");
            System.out.println("------- |  -------  |  -----");
            for (int z = 1; z <= userNum; z++) {
                System.out.println(z + "       |  " + (z * z) + "        |  "+ (z * z * z));
            }
            System.out.println("Continue? [y/n]");
            String response3 = scanner.next();
            userConfirm = response3.equals("y");

        } while(userConfirm);

//

        boolean confirm = true;

        do {
            System.out.print("Enter a numerical grade from 0 to 100 please: ");
            int input = scanner.nextInt();
            System.out.println(input);
            if (input >= 88) {
                System.out.println("Your grade is an 'A'.");
            } else if (input >= 80) {
                System.out.println("Your grade is a 'B'.");
            } else if (input >= 67) {
                System.out.print("Your grade is a 'C'.");
            } else if (input >= 60) {
                System.out.println("Your grade is a 'D'.");
            } else {
                System.out.println("Your grade is an 'F'.");
            }
            System.out.print("Continue? [y/n]");
            String response2 = scanner.next();
            confirm = response2.equals("y");

        } while (confirm);





    }
}
