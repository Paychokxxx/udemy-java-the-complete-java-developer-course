package section5;

import sun.lwawt.macosx.CInputMethod;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int sumOfInputs = 0;
        long averageOfInputs = 0;
        int counterOfInputs = 0;

        while(true){
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int input = scanner.nextInt();
                sumOfInputs += input;
                counterOfInputs++;
                averageOfInputs = Math.round((double)sumOfInputs / (double)counterOfInputs);
            } else {
                System.out.println("SUM = " + sumOfInputs + " AVG = " + averageOfInputs);
                break;
            }
        }
    }
}
