import java.util.Arrays;

public class ArrayLecture {


    public static void main(String[] args) {

        // declaring an array with a type
        // dataType   var name   setting array length
//            double[] prices = new double[4];
//
//
//        final int numberOfSides = 6;
//        int[] diceSides = new int[numberOfSides];
//        diceSides[0] = 1;
//
//        System.out.println(diceSides.length);
//        System.out.println(prices.length);
//        System.out.println(diceSides[0]);

        // directly adding items to an array
        String[] myBag = {"Snickers", "Reese's", "Brussel sprouts"};
//        System.out.println(myBag.length);
        //System.out.println(myBag[1]);

        // old for loop
//        for(int i = 0; i < myBag.length; i++) {
//            System.out.println(myBag[i]);
//        }

        //enhanced for loop
//        for(String candy : myBag) {
//            System.out.println(candy);
//        }

        // arrays class
        String[] anotherBag = new String[12];
//        System.out.println(anotherBag[0]);
//        System.out.println(anotherBag[5]);

        // auto fill the array
        //Arrays.fill(anotherBag, "snickers");

//        for(String candy: anotherBag) {
//           System.out.println(candy);
//        }

        // finding if two arrays are equal
        System.out.println(Arrays.equals(anotherBag, anotherBag));

        // increasing the length of an array
        String[] mybagplustwo = Arrays.copyOf(myBag, myBag.length + 1);
        mybagplustwo[mybagplustwo.length - 1] = "crunch bar";


        // printing the original array
        System.out.println(Arrays.toString(mybagplustwo));
        // array sort method
        Arrays.sort(mybagplustwo);
        for(String candy : mybagplustwo) {
            System.out.println(candy);
        }

        //array to string method
        System.out.println((Arrays.toString(mybagplustwo)));

        // two-dimensional array (matrix)

        int [][] matrix = {
                {1, 2, 3}, // arr1
                {4, 5, 6}, // arr2
                {7, 8, 9}  // arr3

        };

        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println(matrix[1][1]);

        for(int[] row : matrix) {
            System.out.println("+---+---+---+");
            System.out.print("| ");
            for(int n : row) {
                System.out.print(n + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");


    }

}
