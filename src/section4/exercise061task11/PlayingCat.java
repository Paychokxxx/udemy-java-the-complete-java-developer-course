package section4.exercise061task11;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){

        boolean catPlaying = false;
        if (summer && temperature >=25 && temperature<=45){
            catPlaying = true;
        } else if (!summer && temperature >=25 && temperature<=35){
            catPlaying = true;
        }
        return catPlaying;
    }
}
