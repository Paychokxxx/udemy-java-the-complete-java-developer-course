package section3;

public class casting027 {
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

        // casting part
        short bigShortLiteralValue = 32767;

        // myMinIntValue = -2147483648
        int Total = (myMinIntValue / 2);

        // myMinByteValue = -128
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        // myMinShortValue = -32768
        short myNewShortValue = (short)(myMinShortValue / 2);
    }
}
