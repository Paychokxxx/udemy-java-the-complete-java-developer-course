package section3;

public class logical_or_operator037 {
    public static void main(String[] args) {

        int topScore = 80;
        int secondTopScore = 60;

        // improving readability
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score snd less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }
    }
}
