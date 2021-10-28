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

            int heroHealth = 100;
            int enemyHealth = 75;
            System.out.println("Tell me your name");
            String name = scanner.nextLine();
            System.out.println("Hello " + name + ", nice to meet you!");
            int heroAttack = randomInt(5,  50);
            int enemyAttack = randomInt(15, 25);
            System.out.println("Your health is " + heroHealth + ", the enemy has " + enemyHealth + " health left, do you wish to attack?[y/n]");

                String action = scanner.nextLine();
                if (action.equalsIgnoreCase("y")) {
                    boolean attack;
                    do{
                        heroHealth -= enemyAttack;
                        enemyHealth -= heroAttack;
                        System.out.println("Your attack dealt " + heroAttack + " damage, your enemys health is " + (enemyHealth   + " however your enemy dealt " + enemyAttack + " damage to you, leaving you with " + (heroHealth)));
                        if(enemyHealth <= 0) {
                            System.out.println("You killed the enemy!");
                        } else if(heroHealth <= 0) {
                            System.out.println("You died!");
                        }

                        System.out.println("Do you wish to continue the attack or run away?? [attack/run]");
                        String response = scanner.nextLine();
                        attack = response.equalsIgnoreCase("attack");


                    } while(attack);


                }




        } else {
            System.out.println("ok, maybe next time!");
        }




    }
}
