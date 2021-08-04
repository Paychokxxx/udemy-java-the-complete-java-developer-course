package section3;

import sun.security.krb5.internal.LastReq;

public class types_recap_strings032 {
    public static void main(String[] args) {

        // String is not primitive data type but a Class
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println(myString);
        myString = myString + "\u00a9 2019";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString); // 250.5549.95
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString); // LastString is equal to 1050
    }
}
