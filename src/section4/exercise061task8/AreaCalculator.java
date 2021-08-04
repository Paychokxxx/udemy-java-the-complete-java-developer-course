package section4.exercise061task8;

public class AreaCalculator {
    public static double area(double radius){
        if(radius<0) {
            return -1;
        }
        return radius*radius*Math.PI;
    }

    public static double area(double firstSide, double secondSide){
        if(firstSide<0 || secondSide<0) {
            return -1;
        }
        return firstSide*secondSide;
    }

}
