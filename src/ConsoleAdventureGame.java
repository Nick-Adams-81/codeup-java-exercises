import java.util.Scanner;

public class ConsoleAdventureGame {



    public static int randomInt(int Min, int Max) {
        return (int) (Math.random()*(Max-Min))+Min;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you ready to start the game?[y/n]");
        String res = scanner.nextLine();
        if(res.equalsIgnoreCase("y")) {
            boolean confirm;
            int heroHealth = 100;
            int enemyHealth = 75;
            System.out.println("Tell me your name");
            String name = scanner.nextLine();
            System.out.println("Hello " + name + ", nice to meet you!");
            int heroAttack = randomInt(5,  50);
            int enemyAttack = randomInt(15, 30);
            System.out.println("Your health is " + heroHealth + ", the enemy has " + enemyHealth + " health left, do you wish to attack?[y/n]");
            do{
                String action = scanner.nextLine();
                if (action.equalsIgnoreCase("y")) {
                    System.out.println("Your attack dealt " + heroAttack + " damage, your enemys health is " + (enemyHealth - heroAttack + " however your enemy dealt " + enemyAttack + " damage to you, leaving you with " + (heroHealth - enemyAttack)));
                }
                System.out.println("Do you wish to continue the attack or run away?? [attack/run]");
                String response = scanner.nextLine();
                confirm = response.equalsIgnoreCase("attack");

            }while(confirm);


        } else {
            System.out.println("ok, maybe next time!");
        }




    }
}
