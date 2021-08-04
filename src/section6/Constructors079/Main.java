package section6.Constructors079;

import jdk.nashorn.api.scripting.AbstractJSObject;

public class Main {
    public static void main(String[] args) {

        Account bobsAccount = new Account("12345", 0.0, "Bob Brown",
                "myemail@address.com", "(080) 0034 1321");

        System.out.println(bobsAccount.getNumber());

//        // all these can be used with constructor
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmailAddress("myemail@address.com");
//        bobsAccount.setCustomerPhoneNumber("(080) 0034 1321");
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50);
        bobsAccount.withdrawal(100);

        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100);

        Account alexeysAccount = new Account();
        System.out.println(alexeysAccount.getNumber());
    }
}
