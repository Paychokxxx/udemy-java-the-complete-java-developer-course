package section6.InheritanceChallenge088;

public class Main {
    public static void main(String[] args) {
        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20); // speed should accumulate
        outlander.accelerate(-42);
    }
}
