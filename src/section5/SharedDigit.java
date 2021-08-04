package section5;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
    }
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if(firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99){
            return false;
        }

        int realSecondNumber = secondNumber;

        for(int i=1; firstNumber > 0; i++){

            int lastDigitFromFirstNumber = 0;
            int lastDigitFromSecondNumber = 0;

            if((firstNumber%10) != 0){
                lastDigitFromFirstNumber = firstNumber%10;
            } else {
                lastDigitFromFirstNumber = firstNumber;
            }

            for(int j=1; secondNumber > 0; j++){
                if((secondNumber%10) != 0){
                    lastDigitFromSecondNumber = secondNumber%10;
                } else {
                    lastDigitFromSecondNumber = secondNumber;
                }

                if(lastDigitFromFirstNumber==lastDigitFromSecondNumber){
                    return true;
                }
                secondNumber/=10;
            }

            firstNumber/=10;
            secondNumber = realSecondNumber;

        }
        return false;
    }
}
