package StuffAndThings;


import java.util.Arrays;
import java.util.List;

public class Algorithyms {


    // remove vowel from a string
    static String removeVowel(String info) {
        Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        List<Character> al = Arrays.asList(vowels);
        StringBuffer sb = new StringBuffer(info);
        for (int i = 0; i < sb.length(); i++) {
            if (al.contains(sb.charAt(i))) {
                sb.replace(i, i + 1, "");
                i--;
            }
        }
        return sb.toString();
    }

    // reverse a string
    static StringBuilder reverseString(String str) {
        StringBuilder input = new StringBuilder();
        input.append(str);
        return input.reverse();
    }


    public static void main(String[] args) {

        // printing the next to last word of a string
        String str = "hello to you good sir!";

        String[] bits = str.split(" ");
        System.out.println(Arrays.toString(bits));
        String lastWord = bits[bits.length - 2];
        System.out.println(lastWord);


        System.out.println(removeVowel(str));
        System.out.println(reverseString(str));


    }


}
