public class JavaSubstringComparisons {
    public static void main( String[] args ){
        // taken from scanner, which was already in hackerrank challenge i won't copy it
        int k = 3;
        String s = "welcometojava";
        // end of scanner part, those variables are input of test case 0
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        String current;
        // smallest and largest won't work as empty string for some reason, durning use of compareTo() they wouldn't give value that pass if statements
        for (int i=0; i <s.length(); i++){
            if(i+k<= s.length() ){
                current = s.substring(i,i+k);
                if(current.compareTo(smallest)<0){
                    smallest = current;
                }
                if(current.compareTo(largest)>0){
                    largest = current;

                }
            }

        }
        String solution = smallest + "\n" + largest;
        System.out.println(solution);


    }
}
