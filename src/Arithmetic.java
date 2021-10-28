public class Arithmetic {

    // static fields
    // a static property:
    public static double pi = 3.14159;

    // static methods
    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        // do not go down this road
//        Arithmetic myMath = new Arithmetic();
//        System.out.print( myMath.pi);
        // still works but incorrect

        System.out.println(Arithmetic.pi);
        System.out.println(Arithmetic.add(4, 6));
        System.out.println(Arithmetic.multiply(3, 4));
        // built in Math object
        System.out.println(Math.PI);
    }

}
