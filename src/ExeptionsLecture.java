import java.util.Locale;

public class ExeptionsLecture {

    public static void main(String[] args) {

//        try {
//            throw new Exception("Something bad happened");
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//        }


        // basic try catch
//        try {
//            System.out.println("Can i divide by 0?");
//            int res = 1 / 0;
//            System.out.println("I di it! Math is mine!!!");
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }

        // deeper try catch

//        try {
//
//            //throw new Exception("exception thrown")
////            throw new RuntimeException("Something went wrong!");
//            String nullStr = null;
//            System.out.println(nullStr.toLowerCase());
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//            e.getMessage();
//        } catch (RuntimeException e) {
//            System.out.println("Runtime exception fired");
//            e.printStackTrace();
//            e.getMessage();
//        } catch (Exception e) {
//            System.out.println("generic error message");
//            e.printStackTrace();
//            e.getMessage();
//        } finally {
//            System.out.println("This will always run");
//        }

        // one more example trigger an array out of bounds

        try {

            String[] days = {"Monday", "Tuesday"};
            System.out.println(days[1]);

        } catch(ArrayIndexOutOfBoundsException e) {

            e.printStackTrace();
            e.getMessage();

        }

    }

}


