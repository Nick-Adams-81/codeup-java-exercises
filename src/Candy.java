
public class Candy {

    public String name;
    public String size;

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



    public static void main(String[] args) {

       Candy unknownCandy = new Candy("fun candy");
       Candy newUnknownCandy = new Candy("funner candy", "Big!!!");

        System.out.println(unknownCandy.name);
        System.out.println(unknownCandy.size);
        System.out.println(newUnknownCandy.name);
        System.out.println(newUnknownCandy.size);

        unknownCandy.talkAboutCandy();
        newUnknownCandy.talkAboutCandy();

    }
}
