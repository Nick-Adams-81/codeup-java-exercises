package util;

import java.util.Scanner;

public class Input {


    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter input please...");
        String userInput = scanner.nextLine();
        System.out.println(userInput);
        return userInput;
    }

    public boolean yesNo() {
        System.out.println("Enter y or n");
        String userRes = scanner.nextLine();
        System.out.println(userRes);
        return userRes.equalsIgnoreCase("y") || userRes.equalsIgnoreCase("yes");
    }

    public int getInt() {

        try {
            String userNum = getString();
            return Integer.valueOf(userNum);
        } catch(NumberFormatException e) {
            System.out.println("please enter a number");
            e.printStackTrace();
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number between 1 and 10");
        int userNumber = scanner.nextInt();
        if (userNumber <= max && userNumber >= min) {
            return userNumber;
        } else {
            return getInt(min, max);
        }
    }


    public double getDouble() {

        try {
            String userNum = getString();
            return Double.valueOf(userNum);
        } catch(NumberFormatException e) {
            System.out.println("please enter a number");
            e.printStackTrace();
            return getDouble();
        }

    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a number between 1 and 100");
        double userNumber = scanner.nextDouble();
        if (userNumber <= max && userNumber >= min) {
            return userNumber;
        } else {
            return getDouble(min, max);
        }

    }


}
