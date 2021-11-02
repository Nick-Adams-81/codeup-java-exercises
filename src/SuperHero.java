public class SuperHero extends Person{
    private String alterEgo;


    public SuperHero(String secretIdentity, String alterEgo) {
        super(secretIdentity);
        this.alterEgo = alterEgo;
    }

    public String getName() {
        return alterEgo;
    }

    public String getSecretIdentity() {
        return super.getName();
    }

    public static void main(String[] args) {
        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");


        System.out.println("the man of steel, " + theManOfSteel.getName() + ", his secret identity is: " + theManOfSteel.getSecretIdentity());
    }
}
