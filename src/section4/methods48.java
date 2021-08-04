package section4;

public class methods48 {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        calculateScore(gameOver, score, levelCompleted, bonus);

    }

    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {

        if(gameOver){
            int finalScore = score + (levelComplete * bonus);
            finalScore +=2000;
            System.out.println("Your final score " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
