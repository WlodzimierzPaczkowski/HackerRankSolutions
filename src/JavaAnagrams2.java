public class JavaAnagrams2 {
// "Print "Anagrams" if and are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead."- HackerRank
// "The comparison should NOT be case sensitive. " - HackerRank
// This one is without using Maps or HashMaps
    static boolean isAnagram(String a, String b) {
        // first returnValue equal true
        boolean returnValue = true;
        // then check for length of words, if they arent equal return value is false,
        if (a.length() != b.length()) {
            returnValue = false;
        } else {
            // here array with alphabet to check index of each letter, and two array A and B to hold frequency of letter
            char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            int[] arrA = new int[alphabet.length];
            int[] arrB = new int[alphabet.length];

            // enchanted loop to iterate words changed to char array
            for (char ch : a.toLowerCase().toCharArray()) {
            // here, it iterate alphabet array to find index of letter and put it +1 in frequency array
                for (int i = 0; i < alphabet.length; i++) {
                    if (alphabet[i] == ch) {
                        arrA[i] = arrA[i] + 1;
                    }
                }
            }
            // repetition of same loop for second word, could refactor this part to make it method that take alphabet and string of word and frequency array
            // as argument and change array value
            for (char ch : b.toLowerCase().toCharArray()) {

                for (int i = 0; i < alphabet.length; i++) {
                    if (alphabet[i] == ch) {
                        arrB[i] = arrB[i] + 1;
                    }
                }
            }
            // loop for comparing frequency arrays, to find out. Are those words anagrams?
            for (int i = 0; i < alphabet.length; i++) {
                if (arrA[i] != arrB[i]) {
                    returnValue = false;
                    break;
                }
            }
        }
        return returnValue;
    }
    public static void main( String[] args ){
        /// scanner input
        String a = "Hello";
        String b = "leloH";
        /// end of scanner input


        // use of method
        boolean ret = isAnagram(a, b);
        // this part is from hackerrank exercise
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}