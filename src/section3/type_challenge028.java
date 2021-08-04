package section3;

public class type_challenge028 {
    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        // 50800

        short shortTotal = (short) (1000 + 10 *
                (byteValue + shortValue + intValue));
        // result 1800

    }
}
