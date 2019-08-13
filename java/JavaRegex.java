import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaRegex{
/*
Write a class called MyRegex which will contain a string pattern.
You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:
IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
 Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3. - HackerRank

 */
    public static void main(String[] args){   /// this part was pre made for this exercise
        Scanner in = new Scanner("000.12.12.034\n" +
                                        "121.234.12.12\n" +
                                        "23.45.12.56\n" +
                                        "00.12.123.123123.123\n" +
                                        "122.23\n" +
                                        "Hello.IP"); /// this part was edited to have testcase as input
        while(in.hasNext()){ /// this part was pre made for this exercise
            String IP = in.next(); /// this part was pre made for this exercise
            System.out.println(IP.matches(new MyRegex().pattern)); /// this part was pre made for this exercise
        }  /// this part was pre made for this exercise

    }
}
// just this regex, "Leading zeros are allowed" so test cases have examples with it
class MyRegex{
    String pattern = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]|0[0-9][0-9])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]|0[0-9][0-9])$";

}
