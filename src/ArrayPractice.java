import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;

        // enhanced for
        for (int n : numbers) {
            System.out.println(n);
        }

        String[] names = new String[4];
        names[0] = "Nick";
        names[1] = "chris";
        names[2] = "matt";
        names[3] = "ryan";

        System.out.println(Arrays.toString(names));

        // regular for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


        // two-dimensional array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // access the first element in the second row
        System.out.println(matrix[1][0]); // 4
        // the last element in the first row
        System.out.println(matrix[0][2]); // 3
        // the first element in the last row
        System.out.println(matrix[2][0]); // 7


        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix2) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");
    }

}
