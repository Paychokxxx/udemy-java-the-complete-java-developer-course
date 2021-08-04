package section3;

public class ternary_operator039 {
    public static void main(String[] args) {
        boolean isCar = true;

        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
        // improving readability
        boolean isEighteenOrOverImproved = (ageOfClient == 20) ? true : false;
    }
}
