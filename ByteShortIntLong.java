public class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 1000;
        // int data types 
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Interger Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        // byte data types 
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Min byte value is "+myMinByteValue);
        System.out.println("Max byte value is "+myMaxByteValue);

         // short data type 
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Min Short value is "+myMinShortValue);
        System.out.println("Max Short value is "+myMaxShortValue);

        long myLongValue = 100L;
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Min Long value is "+myMinLongValue);
        System.out.println("Max Long value is "+myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte mynewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println(+myLongValue + mynewByteValue + myTotal - myValue + myNewShortValue + bigShortLiteralValue);
    }
}
