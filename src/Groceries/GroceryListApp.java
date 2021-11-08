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
        Grocery fruits = new Grocery();
        Grocery vegetables = new Grocery();
        Grocery meats = new Grocery();
        fruits.addGrocery("banana", 6);
        vegetables.addGrocery("broccoli", 8);
        meats.addGrocery("steak", 2);
        rando.addGrocery("Cereal", 4);

        //System.out.println(rando.getGroceries() + " " + fruits.getGroceries() + " " + vegetables.getGroceries() + " " + meats.getGroceries());


        boolean response;

        System.out.println("Do you want to make a grocery list?[y/n]");
        String res1 = sc.nextLine();

        do {

            if (res1.equalsIgnoreCase("y")) {

                System.out.println("please choose a category from the following list...");
                System.out.println(categories);
                String catRes = sc.nextLine();
                if(catRes.equalsIgnoreCase("fruits")) {

                    System.out.println("Enter fruits to ad to your list");
                    String responses = sc.nextLine();
                    System.out.println("How many " + responses + " Would you like?");
                    int response2 = sc.nextInt();

                    fruits.addGrocery(responses, response2);
                    System.out.println("This is your fruits list so far: " + fruits.getGroceries());

                } else if(catRes.equalsIgnoreCase("vegetables")) {

                    System.out.println("Enter vegetables to ad to your list");
                    String responses = sc.nextLine();
                    System.out.println("How many " + responses + " Would you like?");
                    int response2 = sc.nextInt();

                    vegetables.addGrocery(responses, response2);
                    System.out.println("This is your vegetables list so far: " + vegetables.getGroceries());

                } else if(catRes.equalsIgnoreCase("meats")) {

                    System.out.println("Enter meats to ad to your list");
                    String responses = sc.nextLine();
                    System.out.println("How many " + responses + " Would you like?");
                    int response2 = sc.nextInt();

                    meats.addGrocery(responses, response2);
                    System.out.println("This is your meats list so far: " + meats.getGroceries());

                } else if(catRes.equalsIgnoreCase("other")) {

                    System.out.println("Enter random items to your list");
                    String responses = sc.nextLine();
                    System.out.println("How many " + responses + " Would you like?");
                    int response2 = sc.nextInt();

                    rando.addGrocery(responses, response2);
                    System.out.println("This is your random list so far: " + rando.getGroceries());
                }

            } else {
                System.out.println("Maybe next time!");
                break;
            }

            System.out.println("Do you want to add another item, your list looks like this...[y/n]");
            sc.nextLine();
            String res = sc.nextLine();
            response = res.equalsIgnoreCase("y");

        } while (response);

        System.out.println("Would you like to see your list by category?[y/n]");
        String response2 = sc.nextLine();

        boolean confirm;
        do{

            if(response2.equalsIgnoreCase("y")) {
                System.out.println("Which category would you like to see?");
                System.out.println("Fruits, Vegetables, Meats, other");
                String typeRes = sc.nextLine();

                if(typeRes.equalsIgnoreCase("fruits")) {
                    System.out.println("Your fruit list is: " + fruits.getGroceries());
                } else if(typeRes.equalsIgnoreCase("vegetables")) {
                    System.out.println("Your veggie list is: " + vegetables.getGroceries());
                } else if(typeRes.equalsIgnoreCase("meats")) {
                    System.out.println("Your meats list is: " + meats.getGroceries());
                } else if(typeRes.equalsIgnoreCase("other")) {
                    System.out.println("Your random items list is: " + rando.getGroceries());
                }
            }

            System.out.println("Want to see another category?[y/n]");
            String yesOrNo = sc.nextLine();
            confirm =yesOrNo.equalsIgnoreCase("y");

        } while(confirm);


        System.out.println("This is your final grocery list:");
        System.out.println("Fruits: " + fruits.getGroceries());
        System.out.println("Vegetables: " + vegetables.getGroceries());
        System.out.println("Meats: " + meats.getGroceries());
        System.out.println("Random items: " + rando.getGroceries());
        System.out.println();
        System.out.println("Thanks for shopping!");

    }


}
