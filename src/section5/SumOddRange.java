package section5;

public class SumOddRange {
    public static boolean isOdd(int number){
        if (number>0) {
            return number%2 != 0;
        }
        return false;
    }

    public static int sumOdd(int startOfRange, int endOfRange){
        if ((endOfRange<startOfRange) || (startOfRange <= 0) || (endOfRange <= 0)){
            return -1;
        }
        int sum = 0;
        for(int i = startOfRange; i<=endOfRange; i++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
    }


}
