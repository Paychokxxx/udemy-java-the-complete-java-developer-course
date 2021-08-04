package section5;

public class FlourPacker {
    public static void main(String[] args) {

    }

    public static boolean canPack (int bigCount, int smallCount, int goal){
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        } else if(goal <= (smallCount + bigCount*5)){
            for(int i = smallCount; i >=0; i--){
                if(goal == (i + bigCount*5)){
                    return true;
                }
                for(int j = bigCount; j>=0; j--){
                    if(goal == j*5 + i){
                        return true;
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }
}
