package Groceries;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> categories = new ArrayList<>();
        categories.add("Fruits");
        categories.add("Vegetables");
        categories.add("Meats");
        categories.add("other");

        //System.out.println(categories);

        Grocery rando = new Grocery();
        rando.addGrocery("Cereal", 4);


        boolean response;

        System.out.println("Do you want to make a grocery list?[y/n]");
        String res1 = sc.nextLine();

        do {

            if (res1.equalsIgnoreCase("y")) {
                System.out.println("Enter groceries to ad to your list");
                String responses = sc.nextLine();
                System.out.println("How many " + responses + " Would you like?");
                int response2 = sc.nextInt();

                rando.addGrocery(responses, response2);
                System.out.println("This is your list so far: " + rando.getGroceries());

            } else {
                System.out.println("Maybe next time!");
                break;
            }

            System.out.println("Do you want to add another item?[y/n]");
            sc.nextLine();
            String res = sc.nextLine();
            response = res.equalsIgnoreCase("y");

        } while (response);

        System.out.println("This is your final grocery list: " + rando.getGroceries());
        System.out.println("Thanks for shopping!");

    }


}
