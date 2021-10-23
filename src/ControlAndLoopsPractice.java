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

        // switch case
        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                // Fall through!
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }

    }
}
