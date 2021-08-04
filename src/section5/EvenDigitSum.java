package section5;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }

        int sum = 0;
        for(int i = 1; number>0;i++){
            if((number%10)%2==0){
                sum+=number%10;
            }
            number/=10;
        }
        return sum;
    }
}
