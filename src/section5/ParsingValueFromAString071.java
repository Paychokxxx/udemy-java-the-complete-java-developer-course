package section5;

public class ParsingValueFromAString071 {
    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString= " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        String doubleNumberAsString = "2018.125";
        double doubleNumber = Double.parseDouble(doubleNumberAsString);
        System.out.println(doubleNumber);
        doubleNumber +=1;
        System.out.println(doubleNumber);

    }
}
