package section5;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(100);
        numberToWords(111);
        numberToWords(19);

    }

    public static void numberToWords(int number){
        if(number<0){
            System.out.printf("Invalid Value");
        }

        int digitsCount = getDigitCount(number);
        int reversedNumber = reverse(number);


        for(int i = 1; reversedNumber>0 || digitsCount>0; i++){
            int lastDigitOfReversedNumber = reversedNumber%10;

            String wordOfNumber="Zero";

            switch (lastDigitOfReversedNumber){
                case 1:
                    wordOfNumber="One";
                    break;
                case 2:
                    wordOfNumber="Two";
                    break;
                case 3:
                    wordOfNumber="Three";
                    break;
                case 4:
                    wordOfNumber="Four";
                    break;
                case 5:
                    wordOfNumber="Five";
                    break;
                case 6:
                    wordOfNumber="Six";
                    break;
                case 7:
                    wordOfNumber="Seven";
                    break;
                case 8:
                    wordOfNumber="Eight";
                    break;
                case 9:
                    wordOfNumber="Nine";
                    break;
            }

            System.out.println(wordOfNumber);
            reversedNumber/=10;
            digitsCount--;


        }
        System.out.println("_________________________");
    }

    public static int reverse(int number){
        int originalNumber = number;
        int reverseNumber = 0;

        while(number!=0){
            int lastNumber = number%10;
            reverseNumber *=10;
            reverseNumber +=lastNumber;
            number /= 10;
        }
        System.out.println("Reversed number for " + originalNumber + " is " + reverseNumber);
        return reverseNumber;
    }

    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int numberOfDigits = 1;
        for(int i=1; number>0; i++){
            if((number/10)>0){
                numberOfDigits++;
            }
            number/=10;
        }
        return numberOfDigits;
    }

}
