package section7.Encapsulation094;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(0, 0, false);
        printer.fillInToner(80);
        printer.fillInToner(101);
        printer.printPage();
        printer.printPage();
    }
}
