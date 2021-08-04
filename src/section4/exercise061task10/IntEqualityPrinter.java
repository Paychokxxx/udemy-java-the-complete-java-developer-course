package section4.exercise061task10;

public class IntEqualityPrinter {
    public static void printEqual(int firstNumber, int seconddNumber, int thirdNumber){
        if (firstNumber<0 || seconddNumber< 0 || thirdNumber<0){
            System.out.printf("Invalid Value");
        } else if (firstNumber==seconddNumber && seconddNumber==thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber!=seconddNumber && firstNumber!=thirdNumber && seconddNumber!=thirdNumber ){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
