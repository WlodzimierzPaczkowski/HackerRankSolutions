import java.util.HashMap;
import java.util.Map;


public class JavaAnagrams {
    // "Print "Anagrams" if and are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead."- HackerRank
    // "The comparison should NOT be case sensitive. " - HackerRank
    // unfortunately hackerrank don't allow me to use hashmap for this one, without ability to import util.HashMap and util.Map
    static boolean isAnagram(String a, String b){
        // Best idea is to use hashmaps, it will allow to easily check frequency of key, incrementing value with each time enchanted loop find key, also we loop string only once
        //but first, check if length is correct, after all there are no anagrams that have different amount of letter
        boolean returnValue;
        if(a.length() != b.length())
        {returnValue = false;
        }
        else{

        Map<Character, Integer> frequencyA = new HashMap<Character, Integer>();
        Map<Character, Integer> frequencyB = new HashMap<Character, Integer>();


        // Here i use method to add keys and values to hashmap, could be refactored, with equals method to single inner method
        stringFrequency(a, frequencyA);
        stringFrequency(b, frequencyB);

        // equals check if frequency and keys are same,
        returnValue = frequencyA.equals(frequencyB);
        }
        return returnValue;

    }
    // this method loop using enchanted loop, string is being changed to lower case and char array so it it possible, if key exist in hashmap it is put into count variable
    // so it can be incremented, if it dose not exist it gets value 0 and is added to hashmap after adding 1 to it
    private static void stringFrequency(String a, Map<Character, Integer> frequency) {

        for (char ch:a.toLowerCase().toCharArray()) {
            int count = frequency.containsKey(ch) ? frequency.get(ch) : 0;
            frequency.put(ch, count + 1);
        }
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

