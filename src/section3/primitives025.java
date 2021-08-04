package section3;

import com.sun.javadoc.SourcePosition;

public class primitives025 {
    public static void main(String[] args) {
        // 32 bits
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum, Value = " + myMinIntValue);
        System.out.println("Integer Maxumum, Value = " + myMaxIntValue);
        System.out.println("Busted Min value = " + (myMinIntValue - 1));
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);

//        Integer Minimum, Value = -2147483648
//        Integer Maxumum, Value = 2147483647
//        Busted Min value = 2147483647
//        Busted Max value = -2147483648
//        2147483647
    }
}
