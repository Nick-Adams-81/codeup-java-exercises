public class MethodsExercises {



    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int remainder(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        System.out.println(addition(4, 5));
        System.out.println(subtraction(9, 5));
        System.out.println(multiplication(3, 5));
        System.out.println(division(10, 2));
        System.out.println(remainder(8, 3));
    }
}
