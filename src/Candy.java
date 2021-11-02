import java.util.Arrays;

public class Candy {

    public String name;
    public String size;
    public String[] description;

    public void talkAboutCandy() {
        System.out.printf("Ahh, a %s! I see you got the %s size, and it could be described as %s, Looks good \n", name, size, description);
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

//        String[] myBag = new String[5];
//        myBag[0] = "Candy-coated";
//        myBag[1] = "Chocolate";
//        myBag[2] = "bite-sized";
//        myBag[3] = "crunchy";
//        myBag[4] = "tang";



       Candy unknownCandy = new Candy("fun candy");
       Candy newUnknownCandy = new Candy("funner candy", "Big");
       Candy goodCandy = new Candy("Mr goodbar", "large", new String[] {"Crunchy, Chocolate, Wafer"});

        System.out.println(Arrays.toString(goodCandy.description));
        Candy[] myBag = {unknownCandy, newUnknownCandy, goodCandy};

        for(Candy a : myBag) {
            String description = Arrays.toString(goodCandy.description);
            description = description.substring(1, description.length() - 1);
            System.out.printf(" Here is a %s with size: %s, it is described as having the following traits: %s \n", a.name, a.size, description);
        }



//        System.out.println(unknownCandy.name);
//        System.out.println(unknownCandy.size);
//        System.out.println(newUnknownCandy.name);
//        System.out.println(newUnknownCandy.size);
//        System.out.println("I see you got the " + goodCandy.name + ", that's a " + goodCandy.size + " size, and could be described as " + Arrays.toString(goodCandy.description));


        unknownCandy.talkAboutCandy();
        newUnknownCandy.talkAboutCandy();
//        goodCandy.talkAboutCandy();

    }
}
