public class SyntaxLecture {

    public static void main(String[] args) {
        System.out.println("And \\ or \\ for \\ \n nor \\ but \\ yet \\ so");
        // constant variable
        final int SIDES_OF_A_DICE = 6;
        System.out.println("how many sides on my dice? " + SIDES_OF_A_DICE);

        // Basic operators
        int a = 6;
        // unary
        a++;
        // binary
        a = a + 4;
        System.out.println(a);

        // casting
        int myInteger = 900;
        long morePrecise = myInteger;

        System.out.println("This is a long: " + (morePrecise + 1000000000L));

        // explicit casting
        double pi = 3.14159;
        int almostPi = (int) pi;
        System.out.println("This is pi: " + pi);
        System.out.println("This is almost pi: " + almostPi);


    }
}
