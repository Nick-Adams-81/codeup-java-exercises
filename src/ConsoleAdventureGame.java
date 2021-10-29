import java.util.Scanner;

public class ConsoleAdventureGame {


    // function generating a random number in a given range
    public static int randomInt(int Min, int Max) {
        return (int) (Math.random() * (Max - Min)) + Min;
    }

    // level one method
    public static void levelOne(String name, int heroHealth, int enemyHealth) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your health points are: " + heroHealth + ", the enemy has: " + enemyHealth + " health points, do you wish to attack?[y/n]");

        // if the user says yes to attack run this code
        String action = scanner.nextLine();
        if (action.equalsIgnoreCase("y")) {

            // initializing a boolean to run our do while loop
            boolean attack;

            // initial potions
            int potions = 2;

            // running the game code in a do while loop
            do {

                // using randomInt function to generate random hit points for hero and enemy when the user attacks
                int heroAttack = randomInt(5, 50);
                int enemyAttack = randomInt(15, 40);

                // adjusting the health points of hero and enemy after the attack happens
                heroHealth -= enemyAttack;
                enemyHealth -= heroAttack;
                System.out.println(name + ", Your attack dealt " + heroAttack + " damage, your enemys health is " + (enemyHealth + " however your enemy dealt " + enemyAttack + " damage to you, leaving you with " + (heroHealth)));

                // setting up the end of the gaem(when the enemy dies)
                if (enemyHealth <= 0) {
                    System.out.println(name + ", You killed the enemy! You win!");
                    break;
                    // setting up the end of the game(when the hero dies)
                } else if (heroHealth <= 0) {
                    System.out.println(name + " You died! Game over!");
                    break;
                }

                // asking the user if they want to attack, take a potion, or run after each attack
                System.out.println(name + ", Do you wish to continue the attack, take a potion then attack, or run away?? [attack/potion/run]");
                String response = scanner.nextLine();

                // run this code if the user inputs potion
                if (response.equalsIgnoreCase("potion")) {
                    if (potions > 0) {
                        heroHealth += 10;
                        potions -= 1;
                        System.out.println("You took the potion, your health is now " + (heroHealth) + ", you have " + potions + " potions left");
                    } else if (potions == 0) {
                        System.out.println("You have no more potions left! No health will be added!");
                    }

                    // run this code when the user inputs run after the attack
                } else if (response.equalsIgnoreCase("run")) {
                    System.out.println(name + ", You are a huge coward!!!!");
                }

                // run this code if the user inputs attack OR potion
                attack = response.equalsIgnoreCase("attack") || response.equalsIgnoreCase("potion");

            } while (attack);

            // run this if the user says n to attacking the enemy
        } else {
            System.out.println(name + ", You are a coward!!!!");
        }

    }


    // level 2 method
    public static void levelTwo(String name, int heroHealth, int enemyHealth) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", You made it past level 1, in your last fight you gained valuable experience and your health and attack have increased by 25%, \n you travel through a deep dark forest and encounter a tougher enemy! Your enemy challenges you to fight! Do you accept the challenge?[y/n]");

        boolean confirm;
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("y")) {
            int newHeroHealth = 125;
            int newEnemyHealth = 115;
            int potions = 3;
            System.out.println(name + ", Your health is now: " + newHeroHealth + ", and you now have " + potions + " potions, however your new enemy is much tougher, there health is: " + newEnemyHealth + ".");
            do {
                // using randomInt function to generate random hit points for hero and enemy when the user attacks
                int heroAttack = randomInt(7, 60);
                int enemyAttack = randomInt(20, 50);
                // re setting hero and enemy health

                System.out.println("");
                newHeroHealth -= enemyAttack;
                newEnemyHealth -= heroAttack;
                System.out.println("you attack! your attack dealt " + heroAttack + " damage to your enemy leaving him with " + newEnemyHealth + ", but his counter attack dealt " + enemyAttack + ", left you with " + newHeroHealth);
                if (newEnemyHealth <= 0) {
                    System.out.println("You defeated your enemy!");
                    break;
                } else if (newHeroHealth <= 0) {
                    System.out.println("You died, game over");
                    break;
                }
                System.out.println("Do you want to continue the attack, take a potion then attack, or run like a coward?[attack/potion/run]");
                String res = scanner.nextLine();
                if (res.equalsIgnoreCase("potion")) {
                    if(potions > 0) {
                        newHeroHealth += 20;
                        potions -= 1;
                        System.out.println("You took a potion, your health is now " + newHeroHealth + ", you have " + potions + " potions left");
                    } else if(potions == 0) {
                        System.out.println("You have no potions left! No health will be added!");
                    }

                } else if (res.equalsIgnoreCase("run")) {
                    System.out.println(name + ", Run away you coward!!!");
                }
                confirm = res.equalsIgnoreCase("attack") || res.equalsIgnoreCase("potion");

            }while (confirm);

        }
    }


    public static void bossFight() {
        System.out.println("just a test of the boss function");
    }

    public static void main(String[] args) {

        // initializing a scanner to capture user input
        Scanner scanner = new Scanner(System.in);

        // asking the user if they are ready to start the game
        System.out.println("Are you ready to start the game?[y/n]");
        String res = scanner.nextLine();
        if (res.equalsIgnoreCase("y")) {

            // setting up the hero and enemy health
            int heroHealth = 100;
            int enemyHealth = 80;

            // level 2 hero and enemy health
            int newHeroHealth = 125;
            int newEnemyHealth = 100;
            // asking the user for their name
            System.out.println("Tell me your name");
            String name = scanner.nextLine();
            System.out.println("Hello " + name + ", nice to meet you!");

            // calling the void level methods
            levelOne(name, heroHealth, enemyHealth);
            levelTwo(name, newHeroHealth, newEnemyHealth);
            bossFight();
            // run this code if the user says no to playing the game
        } else {
            System.out.println("ok, maybe next time!");
        }

    }
}
