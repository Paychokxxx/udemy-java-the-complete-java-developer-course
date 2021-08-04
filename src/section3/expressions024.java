package section3;

public class expressions024 {
    public static void main(String[] args) {
        System.out.println("Test");

        int myFirstNumber = (10+2) + (2*10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber*2;

        System.out.println(myFirstNumber);
        System.out.println(mySecondNumber);
        System.out.println(myThirdNumber);

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

//        Test
//        32
//        12
//        64
//        108
//        892
    }
}
