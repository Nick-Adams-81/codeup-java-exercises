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
            int enemyHealth = 85;
            System.out.println("Tell me your name");
            String name = scanner.nextLine();
            System.out.println("Hello " + name + ", nice to meet you!");

            System.out.println("Your health is " + heroHealth + ", the enemy has " + enemyHealth + " health left, do you wish to attack?[y/n]");

                String action = scanner.nextLine();
                if (action.equalsIgnoreCase("y")) {
                    boolean attack;
                    int potions = 2;
                    do{
                        int heroAttack = randomInt(5,  50);
                        int enemyAttack = randomInt(15, 30);

                        heroHealth -= enemyAttack;
                        enemyHealth -= heroAttack;
                        System.out.println(name + ", Your attack dealt " + heroAttack + " damage, your enemys health is " + (enemyHealth   + " however your enemy dealt " + enemyAttack + " damage to you, leaving you with " + (heroHealth)));
                        if(enemyHealth <= 0) {
                            System.out.println(name + ", You killed the enemy!");
                            break;
                        } else if(heroHealth <= 0) {
                            System.out.println(name + "You died! Game over!");
                            break;
                        }

                        System.out.println(name + ", Do you wish to continue the attack, take a potion, or run away?? [attack/potion/run]");
                        String response = scanner.nextLine();
                        if(response.equalsIgnoreCase("potion")) {
                            heroHealth += 10;
                            potions -= 1;
                            System.out.println("You took the potion, your health is now " + (heroHealth) + ", you have " + potions + " potions left");
                        }

                        attack = response.equalsIgnoreCase("attack") || response.equalsIgnoreCase("potion");

                    } while(attack);


                }




        } else {
            System.out.println("ok, maybe next time!");
        }




    }
}
