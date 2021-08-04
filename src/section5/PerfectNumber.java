package section5;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }

        int sumOfDividers = 0;
        int divider = 1;

        while(divider<number){
            if(number%divider == 0){
                sumOfDividers += divider;
            }
            divider++;
        }
        return sumOfDividers == number;

    }
}
