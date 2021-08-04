package section3;

public class logical_and_operator036 {
    public static void main(String[] args) {

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        // logical and operator
        // both side of && should be true for code block to be executed
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score snd less than 100");
        }
    }
}
