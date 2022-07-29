public class ByteShortChallenge {
    public static void main(String[] args) {
        byte myByteValue = 10;
        System.out.println(myByteValue);
        // short value 
        short myShortValue = 20;
        System.out.println(myShortValue);
        // int value 
        int myIntvalue = 50;
        System.out.println(myIntvalue);
        /* long vaue makeit equal to 50000 plus 10 
        times the sum of the byte plus the short plus the int vales
       */
        long myLongestValue = 50000 + 10L * (myByteValue + myShortValue + myIntvalue);
        System.out.println(myLongestValue); 

        short shortTotal = (short) (1000 + 10 * 
            (myByteValue + myShortValue + myIntvalue));
            System.out.println(shortTotal);
    }
}
