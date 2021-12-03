package StuffAndThings;


import java.util.Arrays;

public class Algorithyms {




    public static void main(String[] args) {

        // printing the next to last word of a string
        String str = "hello to you good sir fuck you!";
        String[] bits = str.split(" ");
        System.out.println(Arrays.toString(bits));
        String lastWord = bits[bits.length - 2];
        System.out.println(lastWord);
    }


}
