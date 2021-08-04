package section4.exercise056057task5;

import java.text.DecimalFormat;

public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(2.19, 3.111);
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {
//        DecimalFormat df = new DecimalFormat("#.000"); - if DecimalFormat is used == will return false for 0.000=0.0000
//        return df.format(firstValue) == df.format(secondValue);
//        System.out.println((int) (firstValue * 1000));
        return (int) (firstValue * 1000) == (int) (secondValue * 1000);
    }
}
