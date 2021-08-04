package section3;

public class bye_short_long_width26 {
    public static void main(String[] args) {
        // 8 bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Maximum value = " + myMaxByteValue);

        // 16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);

        // 32 bits
        // integer is assumed by default in java
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum, Value = " + myMinIntValue);
        System.out.println("Integer Maxumum, Value = " + myMaxIntValue);
        System.out.println("Busted Min value = " + (myMinIntValue - 1));
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));

        // 64 bits
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + myMinLongValue);
        System.out.println("Long Maximum value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

//        Byte Minimum value = -128
//        Byte Maximum value = 127
//        Short Minimum value = -32768
//        Short Maximum value = 32767
//        Integer Minimum, Value = -2147483648
//        Integer Maxumum, Value = 2147483647
//        Busted Min value = 2147483647
//        Busted Max value = -2147483648
//        Long Minimum value = -9223372036854775808
//        Long Maximum value = 9223372036854775807
//        2147483647234
    }
}
