package section3;

public class float_double029 {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);


        //        Float minimum value = 1.4E-45
        //        Float maximum value = 3.4028235E38
        //        Double minimum value = 4.9E-324
        //        Double maximum value = 1.7976931348623157E308

        // floats are not recommended for usage
        // double is used by default by java
        // error -> float myFloatValue = 5.25;
        //        Required type: float
        //        Provided: double
        // not recommended way => float myFloatValue = (float) 5.25;

        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;

    }
}
