package section3;

public class else_if046 {
    public static void main(String[] args) {

        int myNumber = 1000;

        if (myNumber < 2000) {
            System.out.println("myNumber < 2000");
        } else if (myNumber < 5000) { // only statement will be executed, previous one, not this one
            System.out.println("myNumber < 5000");
        } else {
            System.out.println("myNumber = 1000;");
        }
    }
}
