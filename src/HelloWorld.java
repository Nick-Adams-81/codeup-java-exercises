
public class HelloWorld {

    public static int fib(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i ++) {
            int x = a;
            a = b;
            b = a + x;
        }
        return a;
    }



    public static void main(String[] args) {
//        System.out.print("Hello, ");
//        System.out.print("World!");

       for (int i = 0; i < 10; i++) {
           System.out.println(fib(i));
       }

//        int myFavoriteNumber = 40;
//        System.out.println(myFavoriteNumber);
//        String myString = "this is my string!";
//        System.out.println(myString);
//
//        long myNumber = 123L;
//        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int X = 5;
//        System.out.println(++X);
//        System.out.println(X);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";

//        int x = 4;
//        //x = x + 5;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        //y = y * x;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        x = x / y;
//        y = y - x;

//        System.out.println(x);
//        System.out.println(y);

    }
}


