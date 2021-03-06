public class ControlAndLoopsPractice {

    public static void main(String[] args) {

        // conditional statement
//        boolean someCondition = false;
//        boolean someOtherCondition = true;

//        if (someCondition) {
//            // executes if someCondition is true
//        } else if (someOtherCondition) {
//            // executes if someOtherCondition is true *and* all of the previous ifs in
//            // this block were false
//        } else {
//            // executes if none of the conditions checked in this block were true
//        }

         //switch case
        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                // Fall through!
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }

        // while loop
//        int i = 1;
//        while (i <= 10) {
//            System.out.println("i is " + i);
//            i++;
//        }



//        boolean isSunny = false;
//        boolean hasUmbrella = false;

//        if(isSunny) {
//            System.out.println("Enjoy the sunshine!");
//        } else if(!isSunny && hasUmbrella) {
//            System.out.println("You're ready for the rain!");
//        } else {
//            System.out.println("Check the weather!");
//        }

        // do loop
//        do {
//            System.out.println("You will see this despite the condition!");
//        } while (false);

        // for loop
        for(int j = 0; j < 10; j += 1) {
            System.out.println("i is " + j);
        }

        // break statement
        // print the numbers 1 through 5

        for(int n = 1; n < 100; n++) {
            System.out.println(n);
            if (n == 5) {
                break; // --------------+
            } //                        |
        } //                            |

        // continue statement
        for(int k = 1; k <= 10; k++) { // <--+
            if(k % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println(k);
        }

    }
}
