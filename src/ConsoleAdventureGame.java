import java.util.Scanner;

public class ConsoleAdventureGame {




    // function generating a random number in a given range
    public static int randomInt(int Min, int Max) {
        return (int) (Math.random()*(Max-Min))+Min;
    }


    public static void main(String[] args) {

        // initializing a scanner to capture user input
        Scanner scanner = new Scanner(System.in);

        // asking the user if they are ready to start the game
        System.out.println("Are you ready to start the game?[y/n]");
        String res = scanner.nextLine();
        if(res.equalsIgnoreCase("y")) {

            // setting up the hero and enemy health
            int heroHealth = 100;
            int enemyHealth = 85;

            // asking the user for their name
            System.out.println("Tell me your name");
            String name = scanner.nextLine();
            System.out.println("Hello " + name + ", nice to meet you!");

            // letting the user know how many health points they and their enemy have
            System.out.println("Your health points are: " + heroHealth + ", the enemy has: " + enemyHealth + " health points, do you wish to attack?[y/n]");

                // if the user says yes to attack run this code
                String action = scanner.nextLine();
                if (action.equalsIgnoreCase("y")) {

                    // initializing a boolean to run our do while loop
                    boolean attack;

                    // initial potions
                    int potions = 2;

                    // running the game code in a do while loop
                    do{

                        // using randomInt function to generate random hit points for hero and enemy when the user attacks
                        int heroAttack = randomInt(5,  50);
                        int enemyAttack = randomInt(15, 40);

                        // adjusting the health points of hero and enemy after the attack happens
                        heroHealth -= enemyAttack;
                        enemyHealth -= heroAttack;
                        System.out.println(name + ", Your attack dealt " + heroAttack + " damage, your enemys health is " + (enemyHealth   + " however your enemy dealt " + enemyAttack + " damage to you, leaving you with " + (heroHealth)));

                        // setting up the end of the gaem(when the enemy dies)
                        if(enemyHealth <= 0) {
                            System.out.println(name + ", You killed the enemy! You win!");
                            break;
                        // setting up the end of the game(when the hero dies)
                        } else if(heroHealth <= 0) {
                            System.out.println(name + "You died! Game over!");
                            break;
                        }

                        // asking the user if they want to attack, take a potion, or run after each attack
                        System.out.println(name + ", Do you wish to continue the attack, take a potion then attack, or run away?? [attack/potion/run]");
                        String response = scanner.nextLine();

                        // run this code if the user inputs potion
                        if(response.equalsIgnoreCase("potion")) {
                            if(potions > 0 ) {
                                heroHealth += 10;
                                potions -= 1;
                                System.out.println("You took the potion, your health is now " + (heroHealth) + ", you have " + potions + " potions left");
                            } else if(potions == 0) {
                                System.out.println("You have no more potions left! No health will be added!");
                            }

                            // run this code when the user inputs run after the attack
                        } else if(response.equalsIgnoreCase("run")) {
                            System.out.println(name + ", You are a huge coward!!!!");
                        }

                        // run this code if the user inputs attack OR potion
                        attack = response.equalsIgnoreCase("attack") || response.equalsIgnoreCase("potion");

                    } while(attack);

                    // run this if the user says n to attacking the enemy
                } else {
                    System.out.println(name + ", You are a coward!!!!");
                }

                // run this code if the user says no to playing the game
        } else {
            System.out.println("ok, maybe next time!");
        }

    }
}
