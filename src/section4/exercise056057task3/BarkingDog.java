package section4.exercise056057task3;

public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (!barking) {
            return false;
        } else if (barking && ( hourOfDay >= 0 && hourOfDay < 8 || hourOfDay > 22 && hourOfDay <= 23)){
            return true;
        } else {
            return false;
        }
    }
}
