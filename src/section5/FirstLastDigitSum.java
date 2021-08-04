package section5;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }

        int sum = 0;
        int firstNumber = 0;
        int lastNumber = number%10;

        if(number>0 && number<10){
            firstNumber = lastNumber = number;
        }


        for(int i = 0; number>0; i++){
            if((number/10)==0){
                firstNumber = number;
                break;
            }
            number/=10;
        }



        sum = firstNumber + lastNumber;
        return sum;
    }

}
