public class MethodsLecture {


    public static int returnThree() {
        return 3;
    }
    public static int timesThree(int a) {
        return  a * 3;
    }

    public static String name() {
        return "Nick";
    }

    public static int add(int num1, int num2) {
        return  num1 + num2;
    }

    public static void main(String[] args) {

        System.out.println(returnThree());
        System.out.println(timesThree(5));
        System.out.println(timesThree(4));
        System.out.println(add(5, 9));
        System.out.println(name());

    }
}
