import java.util.Arrays;


public class LambdaAndStream {
    // This is note "Note Program"
    /*
    Here is my training with lambda and streams, to make it more fun i created very simple cipher, where i could i try
    to use lambda expression and stream. It would be a lot easier if i make Cipher class, that hold all part of key, and
    have method for decryption and encryption, so while using i would just call method of class. This cipher use same key
    to encrypt and decrypt, it isn't something hard to break, even if i use bigger numbers, however it was fun to create
    such simple cipher. I will most likely put it in my other project as easter egg.
     */
    public static void main(String[] args){
    testForLambdaAndStream lambda = (a, b) -> ((a * 3) + (b * 4))-6;
    //lambda test, two argument
    System.out.println("Here is mysterious number " + lambda.method(34, 4));

    // small Cipher keys, simple times minus and reverse of equation, plus shift for changing from char to int and int to char
    int minusCipher = 61; // part of cipher
    int timesCipher = 13; // part of cipher
    int shift = 3; // shift to make it bit harder, for no reason
    smallCipherEncrypt encrypt = (ch) -> (ch * timesCipher) - minusCipher; // lambdas of SAM interfaces used for encryption
    smallCipherDecrypt decrypt = (i) -> ((i + minusCipher)/ timesCipher); // lambdas of SAM interfaces used for decryption

    //test int
    int testint;
    int otherint;

    //testing if encryption and decryption work
     int testIntForCipher = 41;
    testint = encrypt.encrypt(testIntForCipher);
    otherint = decrypt.decrypt(testint);
    System.out.println("This is test of encrypting and decrypting, test number is " + testIntForCipher);
    System.out.println("After encryption my testint is: " + testint + " so when i decrypt it i have: " + otherint);

    // test phrase
    String testString = "This is simple test string used for encrypting and decrypting this small cipher";

    // first step of encryption, changing from string to char array and shifting all values minus int shift value
    int[] enc = testString.chars()
            .map(ch -> ch - shift)
            .toArray();

    // this print shifted values
        System.out.print("This is text changed and shifted to int from char: ");
    for (int i: enc) {
        System.out.print(i + " ");
    }

        System.out.print('\n');
    // second step of encryption, using lambda encrypt to encrypt
        int[] enc1 = Arrays.stream(enc)
                .map(i -> encrypt.encrypt(i))
                .toArray();

     // this print encrypted message
        System.out.print("This is encrypted text: ");
        for (int i: enc1) {
           char dec = (char)(i);
            System.out.print(dec);
        }

        // here decryption(both steps) and printing in one Array stream, could make same for encryption
        System.out.print("\nAfter decryption text is: ");
        Arrays.stream(enc1)
                .map(i -> decrypt.decrypt(i))
                .map(i -> i + shift)
                .forEach(i -> System.out.print((char)i));

        // one stream to encrypt would be like this
        System.out.print("\nEncrypting in one stream would show this encrypted numbers : ");
        int[] encryptedText = testString.chars()
                .map(ch -> ch - shift)
                .map(ch -> encrypt.encrypt(ch))
                .toArray();

        //print encryption
        for (int i: encryptedText){
            System.out.print(i + " ");
        }

        //print encryption as chars
        System.out.print("\nOr those characters: ");
        for (int i: encryptedText){
            System.out.print((char)(i));
        }

        //here repetition of decryption
        System.out.print("\nAnd if i decrypt it again it show: ");
        Arrays.stream(encryptedText)
                .map(i -> decrypt.decrypt(i))
                .map(i -> i + shift)
                .forEach(i -> System.out.print((char)i));







}
}

@FunctionalInterface
interface testForLambdaAndStream{
    int method(int a, int b);
}


@FunctionalInterface
interface smallCipherEncrypt{
    int encrypt(int ch);
        }

@FunctionalInterface
interface smallCipherDecrypt{
    int decrypt(int i);
    }