import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Implement the classes and methods detailed in the diagram
 *
 * The locked code reads a single string denoting the name of a subclass of State (i.e., WestBengal, Karnataka, or AndhraPradesh),
 * then tests the methods associated with that subclass. You are not responsible for reading any input from stdin.
 *
 * Output is handled for you by the locked code, which creates the object corresponding to the input string's class name
 * and then prints the name returned by that class' national flower's whatsYourName method. You are not responsible for printing anything to stdout. - HackerRank
 *
 * OUTPUT for test case is:
 * Lily
 */

    // Flower class
    class Flower {
        String whatsYourName(){ // method of class
            return "I have many names and types."; //output of method
        }
    }

    class Jasmine extends Flower{ // first class that inherent from flower class
        @Override
        String whatsYourName(){ //override this method to say "Jasmine"
            return "Jasmine";
        }
    }

    class Lily extends Flower{ // second class that inherent from flower class
        @Override
        String whatsYourName(){ // override this method to say "Lily"
            return "Lily";
        }
    }
    //region class
    class Region {
        Flower yourNationalFlower(){
            return new Flower();
        }
    }

    class WestBengal extends Region{ //same as with flower, first class that inherent from region
        @Override
        Jasmine yourNationalFlower(){ // override method, return instance of flower subclass, Jasmine
            return new Jasmine();
        }
    }

    class AndhraPradesh extends Region { // second class that inherent from region
        @Override
        Lily yourNationalFlower(){ // override method, return instance of flower subclass, Lily
            return new Lily();}
    }


    public class CovariantReturnTypes {
        public static void main(String[] args) throws IOException { //premade
            String testCaseString = "AndhraPradesh"; //changed
            BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(testCaseString.getBytes()))); /// Changed to ByteArray from System.in for sake of easy default testing)
            String s = reader.readLine().trim(); //premade
            Region region = null; //premade
            switch (s) { //premade
                case "WestBengal": //premade
                    region = new WestBengal(); //premade
                    break; //premade
                case "AndhraPradesh": //premade
                    region = new AndhraPradesh(); //premade
                    break; //premade
            }
            Flower flower = region.yourNationalFlower(); //premade
            System.out.println(flower.whatsYourName()); //premade
        }
    }
