package section3;

public class operator_precedence040 {
    public static void main(String[] args) {
        double myFirstVariable = 20.00d;
        double mySecondVariable = 80.00d;
        double myValuesTotal = (myFirstVariable + mySecondVariable) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got some remainder"); // will not be printed
        }

//        MyValuesTotal = 10000.0
//        theRemainder = 0.0
//        isNoRemainder = true

    }
}
