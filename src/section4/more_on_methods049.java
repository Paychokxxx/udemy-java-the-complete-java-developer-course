package section4;

public class more_on_methods049 {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final highscore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final highscore is " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tim", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {

        if(gameOver){
            int finalScore = score + (levelComplete * bonus);
            finalScore +=2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition( String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (500 <= playerScore &&  playerScore < 1000){ // "playerScore < 1000" can be removed as it is always true
            return 2;
        } else if (100 <= playerScore &&  playerScore < 500){  // "playerScore < 500" can be removed as it is always true
            return 3;
        } else {
            return 4; // can be used without else and moved under complete condition block
            // code also can be refactored not to use multiple return statements. check file for 050 class.
        }
    }
}
