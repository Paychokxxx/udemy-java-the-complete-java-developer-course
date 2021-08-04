package section7.Encapsulation093;

public class Main {
    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player.getHitPoints());
    }
}
