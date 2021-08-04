package section5;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }

    public static boolean isPalindrome(int number){

        int originalNumber = number;
        int reverseNumber = 0;

        while(number!=0){
            int lastNumber = number%10;
            reverseNumber *=10;
            reverseNumber +=lastNumber;
            number /= 10;
        }

        return originalNumber == reverseNumber;

    }

}
