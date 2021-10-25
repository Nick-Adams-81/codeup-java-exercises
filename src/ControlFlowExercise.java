public class ControlFlowExercise {

    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i: " + i);
//            i++;
//        }


        int j = 0;
        do {
            System.out.println("The count is: " + (j));
            j += 2;
        } while(j <= 100);


        int k = 100;
        do {
            System.out.println("K:" + k);
            k -= 5;
        } while(k >= 0);


        int l = 2;
        do {
            System.out.println("Count: " + l);
            l *= 2;
        } while(l < 1000000);



        for (int i = 0; i < 100; i++) {
            if(i % 15 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
