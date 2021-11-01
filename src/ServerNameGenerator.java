public class ServerNameGenerator {


    public static int randomInt(int Min, int Max) {
        return (int) (Math.random() * (Max - Min)) + Min;
    }


    public static void main(String[] args) {

        String[] adjectives = new String[10];
        adjectives[0] = "Charming";
        adjectives[1] = "Cruel";
        adjectives[2] = "Fantastic";
        adjectives[3] = "Gentle";
        adjectives[4] = "Huge";
        adjectives[5] = "Perfect";
        adjectives[6] = "Rough";
        adjectives[7] = "Sharp";
        adjectives[8] = "Tasty";
        adjectives[9] = "Zealous";


        String[] nouns = new String[10];
        nouns[0] = "Account";
        nouns[1] = "Canvas";
        nouns[2] = "Design";
        nouns[3] = "Fire";
        nouns[4] = "Glass";
        nouns[5] = "Food";
        nouns[6] = "Invention";
        nouns[7] = "Jelly";
        nouns[8] = "Kick";
        nouns[9] = "Land";

        System.out.println(" Your server name is: ");
        System.out.println(adjectives[randomInt(0, 9)] + "-" + nouns[randomInt(0, 9)]);


    }

}
