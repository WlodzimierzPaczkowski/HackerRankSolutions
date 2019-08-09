import java.io.*;
import java.util.*;

public class JavaStringTokens {
// "On the first line, print an integer n, denoting the number of tokens in string s(they do not need to be unique).
// Next, print each of the tokens on a new line in the same order as they appear in input string s" - HackerRank
    public static void main(String[] args) {
        // scanner input
        String s = "He is a very very good boy, isn't he?";
        // end of scanner input

        // int for counting integer n
        int count = 0;

        // here I split string s with regex according to exercise constrains
        String[] solution = s.split("[ !,?._'@]");

        // first enchanted loop count number of tokens, and then print integer n, because integer n need to be
        // printed first, there are two loops
        for(String stringFromArray:solution){
            //because sometimes split gives empty string, first i use not null and not isEmpty() to find out if "token" is valid
            if(stringFromArray != null && !stringFromArray.isEmpty()){
                count = count + 1; // incrementing of count, could use count+=1;
            }
        }
        // print number of valid tokens
        System.out.println(count);

        // second enchanted loops that print tokens from solution array
        for(String stringFromArray:solution){
            // check if tokens are valid, same as in first loop
            if(stringFromArray != null && !stringFromArray.isEmpty()){
                System.out.println(stringFromArray);
            }
        }


    }
}