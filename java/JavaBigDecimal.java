import java.math.BigDecimal;
import java.util.*;
class JavaBigDecimal{
/*
*Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!
* Given an array s of n real number strings, sort them in descending order — but wait, there's more!
*  Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1 and 0.1 is printed as 0.1 If two numbers represent numerically equivalent values
*  they must be listed in the same order as they were received as input).
* Complete the code in the unlocked section of the editor below. You must rearrange array
* s's elements according to the instructions above. -HackerRank
* Output:
            90
            56.6
            50
            02.34
            0.12
            .12
            0
            000.000
            -100
 */
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner("9\n" + /// edited for default test case test case
                                        "-100\n" +
                                        "50\n" +
                                        "0\n" +
                                        "56.6\n" +
                                        "90\n" +
                                        "0.12\n" +
                                        ".12\n" +
                                        "02.34\n" +
                                        "000.000");
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

////////////////////////////////////////////// Only this part was editable {
        Arrays.sort(s, (s1, s2) ->{ // here i use lambda expression to override Comparator, instead of using anonymous class
                    if (s1 == null || s2 == null) { // check for equal, then return 0
                        return 0;}
                    else{
                        BigDecimal bd1 = new BigDecimal(s1); // first argument to big decimal
                        BigDecimal bd2 = new BigDecimal(s2); // second argument to big decimal
                        return bd2.compareTo(bd1);} // compareTo, reversed order of comparing to reverse sorting (from highest to lowest)
            // Comparator method of sort, while arrays.sort it take as argument array we
            // want to sort, and Comparator, here i use lambda function to type logic of
            // comparing two string object based on exercise objective, comparing it value as big decimals
                }
        );
//////////////////////////////////////////////// end of editable part }


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}