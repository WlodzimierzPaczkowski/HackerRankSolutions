import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
    /**
     * Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.
     *
     * In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.
     *
     * Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method. - HackerRank
     */


        public static void main(String[] args){ // this part is pre made in exercise
            Scanner in = new Scanner(System.in); // this part is pre made in exercise
            int testCases = Integer.parseInt(in.nextLine()); // this part is pre made in exercise

            while(testCases>0){ // this part is pre made in exercise
                // subtracts number of case tests, so there wont be any exception thrown
                testCases -= 1;
                String pattern = in.nextLine();

                // try catch block that use pattern.compile, because
                // "In this problem, a regex is only valid if you can compile it using the Pattern.compile method"
                // if it work without exception, it is valid regex, so then i print "Valid"
                try{
                    Pattern p = Pattern.compile(pattern); // p is unused, for this exercise i only need it to compile and wait if it there was error or not
                    System.out.println("Valid");
                // if there is PatternSyntaxException, i can't compile it using pattern.compile so i print "invalid"
                }catch(PatternSyntaxException e){
                    System.out.println("Invalid");
                }
            }



        }



}
