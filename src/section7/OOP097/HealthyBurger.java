package section7.OOP097;

public class HealthyBurger extends Hamburger{
    private String healthExtra1Name;
    private double healthExtra1Price;

    private String healthExtra2Name;
    private double healthExtra2Price;

    public HealthyBurger(String meatType, double price) {
        super("Healthy", meatType, price, "Brown rye");
    }

    public void addHealthAddition1(String name, double price){
        this.healthExtra1Name = name;
        this.healthExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price){
        this.healthExtra2Name = name;
        this.healthExtra2Price = price;
    }

    @Override
    public double itemizedHamburger() {
        double hamburgerPrice = super.itemizedHamburger();
        if(this.healthExtra1Name != null){
            hamburgerPrice += this.healthExtra1Price;
            System.out.println("Added " + this.healthExtra1Name + " for an extra " + this.healthExtra1Price);
        }
        if(this.healthExtra2Name != null){
            hamburgerPrice += this.healthExtra2Price;
            System.out.println("Added " + this.healthExtra2Name + " for an extra " + this.healthExtra2Price);
        }
        return hamburgerPrice;
    }
}
