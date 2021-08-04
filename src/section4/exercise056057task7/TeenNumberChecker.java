package section4.exercise056057task7;

public class TeenNumberChecker {

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        return isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber);
    }

    public static boolean isTeen(int age) {
        return age>=13 && age<=19 ;
    }

}
