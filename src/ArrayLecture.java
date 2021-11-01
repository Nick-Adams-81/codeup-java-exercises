public class ArrayLecture {


    public static void main(String[] args) {

        // declaring an array with a type
        // dataType   var name   setting array length
            double[] prices = new double[4];


        final int numberOfSides = 6;
        int[] diceSides = new int[numberOfSides];
        diceSides[0] = 1;

        System.out.println(diceSides.length);
        System.out.println(prices.length);
        System.out.println(diceSides[0]);

        String[] myBag = {"Snickers", "Reese's", "Brussel sprouts"};
        System.out.println(myBag.length);
        //System.out.println(myBag[1]);

        // old for loop
//        for(int i = 0; i < myBag.length; i++) {
//            System.out.println(myBag[i]);
//        }

        //enhanced for loop

        for(String n : myBag) {
            System.out.println(n);
        }


    }
}
