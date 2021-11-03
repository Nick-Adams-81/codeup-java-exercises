package CardGames;
import java.util.Scanner;
import java.util.Arrays;

public class GameOfWar {


    public static int randomInt(int Min, int Max) {
        return (int) (Math.random() * (Max - Min)) + Min;
    }

    public static int playerHand() {
        return  randomInt(2, 13);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Card[] deck = CardsArray.getAllCards();

        for(Card card : deck) {
            System.out.println(card.value);
        }


        System.out.println(playerHand());

        System.out.println("Input players name");
        String name = sc.nextLine();
        System.out.println(name + ", good luck");




    }




}
