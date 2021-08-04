package section5;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(10, 10, 10));
    }
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if(isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)){
            if(firstNumber%10 == secondNumber%10
                    || firstNumber%10 == thirdNumber%10
                    || secondNumber%10 == thirdNumber%10){
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number){
        return number>=10 && number<=1000;
    }
}
