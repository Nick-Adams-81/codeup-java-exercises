package Groceries;
import java.util.Scanner;

public class Grocery {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to create a grocery list?[y/n]");
        String res = sc.nextLine();

       if(res.equalsIgnoreCase("y")) {
           System.out.println("What category of groceries do you want?[fruit/vegetables/junk]");
           String responseA = sc.nextLine();
           if(responseA.equalsIgnoreCase("fruit")) {

               boolean confirm;
               do {
                   System.out.println("What fruit do you want to buy?");
                   String response = sc.nextLine();
                   System.out.println("How many of " + response + " do you want?");
                   int amount = sc.nextInt();
                   System.out.println("You have " + amount + " total " + response +", do you want to keep shopping or are you all done?[add/done]");
                   sc.nextLine();
                   String resConfirm = sc.nextLine();
                   confirm = resConfirm.equalsIgnoreCase("add");

               } while(confirm);

           } else if(responseA.equalsIgnoreCase("vegetables")) {

               boolean confirm2;
               do {

                   System.out.println("What fruit do you want to buy?");
                   String response = sc.nextLine();
                   System.out.println("How many of " + response + " do you want?");
                   int amount = sc.nextInt();
                   System.out.println("You have " + amount + " total " + response +", do you want to keep shopping or are you all done?[add/done]");

                   String resConfirm = sc.nextLine();
                   confirm2 = resConfirm.equalsIgnoreCase("add");

               } while(confirm2);

           }



       } else {
           System.out.println("Thanks for shopping!");
       }

    }


}
