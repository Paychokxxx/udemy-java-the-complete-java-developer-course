package section5;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }

        int divider = 0;
        int minimalNumber=0;

        if(first<second){
            minimalNumber=first;
        } else{
            minimalNumber=second;
        }

        for(int i = 1; i<=minimalNumber; i++){
            if(first%i==0 && second%i==0){
                divider=i;
            }
        }
        return divider;
    }
}
