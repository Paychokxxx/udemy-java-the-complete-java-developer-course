package section5;

import java.util.Scanner;

public class ReadingUserInputChallenge074a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfInputs = 0;

        for(int i = 1; i<=10;i++){
            System.out.println("Enter number #" + i + ":");
            int input = scanner.nextInt();
            sumOfInputs += input;
        }
        System.out.println(sumOfInputs);
        scanner.close();
    }
}
