public class JavaStringReverse {
    // "Given a string , print Yes if it is a palindrome, print No otherwise. " -HackerRank JavaStringReverse, 2019
    public static void main( String[] args ){
        // scanner input
        String A="madam";
        // end of scanner input

        StringBuilder sb = new StringBuilder(); //string builder for working with strings that are changed by program
        String reversed = "";
        for(int i = A.length(); i > 0; i--){ // yes it can be done with StringBuilder instead of reverse for loop, but i wanted to write more code for this one
            char letter = A.charAt(i-1);
            reversed = sb.append(letter).toString();
        }
        if(reversed.equals(A)){ //check for
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
    }

