package CardGames;
import java.util.Scanner;
import java.util.Arrays;

public class GameOfWar {


    public static int randomInt(int Min, int Max) {
        return (int) (Math.random() * (Max - Min)) + Min;
    }

    public static void randomSuit() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        for(int i = 0; i < suits.length; i++) {
            System.out.println((suits[i]));
        }

    }

    public static void main(String[] args) {


        randomSuit();

        Scanner sc = new Scanner(System.in);
        Card[] deck = CardsArray.getAllCards();
        System.out.println("Input players name");
        String name = sc.nextLine();
        System.out.println(name + ", good luck");




        int playerHand = randomInt(1, 13);
        int dealerHand = randomInt(1, 13);

        System.out.println(name + ": " + playerHand);
        System.out.println("Dealer hand: " + dealerHand);
        if(playerHand > dealerHand) {
            System.out.println(name + ", You win");
        } else if(dealerHand > playerHand) {
            System.out.println(name + ", you lose!");
        } else if(playerHand == dealerHand) {
            System.out.println("tie!");
        }



    }




}
