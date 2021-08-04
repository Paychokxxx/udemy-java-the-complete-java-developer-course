package section7.OOP097;

import javax.security.auth.kerberos.DelegationPermission;
import java.beans.DefaultPersistenceDelegate;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Start");
//
//        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
//        double price = hamburger.itemizedHamburger();
//        hamburger.addHamburgerAddition1("Tomato", 0.27);
//        hamburger.addHamburgerAddition2("Lettuce", 0.75);
//        hamburger.addHamburgerAddition3("Cheese", 0.75);
//        System.out.println("Total Burger price is " + hamburger.itemizedHamburger());
//
//        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
//        healthyBurger.addHamburgerAddition1("Egg", 5.43);
//        healthyBurger.addHealthAddition1("Lentils", 3.41);
//        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizedHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Burger price is " + deluxeBurger.itemizedHamburger());
    }
}

