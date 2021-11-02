
public class Candy {

    public String name;
    public String size;
    public String[] description;

    public void talkAboutCandy() {
        System.out.printf("Ahh, a %s! I see you got the %s size! Looks good \n", name, size);
    }

    public Candy(String name) {
        this.name = name;
        this.size = "undefined";
    }

    public Candy(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public Candy(String name, String size, String[] description) {
        this.name = name;
        this.size = size;
        this.description = description;
    }



    public static void main(String[] args) {

        String[] myBag = new String[5];
        myBag[0] = "Candy-coated";
        myBag[1] = "Chocolate";
        myBag[2] = "bite-sized";
        myBag[3] = "crunchy";
        myBag[4] = "tang";

        Candy newCandy = new Candy("crunch", "large");
        for (String s : myBag) {
            System.out.println("I have a peice of " + newCandy.name + " that is " + newCandy.size + " and could be described as " + s);
        }

       Candy unknownCandy = new Candy("fun candy");
       Candy newUnknownCandy = new Candy("funner candy", "Big!!!");


//        System.out.println(unknownCandy.name);
//        System.out.println(unknownCandy.size);
//        System.out.println(newUnknownCandy.name);
//        System.out.println(newUnknownCandy.size);

        unknownCandy.talkAboutCandy();
        newUnknownCandy.talkAboutCandy();

    }
}
