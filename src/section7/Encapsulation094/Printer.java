package section7.Encapsulation094;

public class Printer {
    private int tonerLevels;
    private int printedPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int printedPages, boolean isDuplex) {
        this.tonerLevels = tonerLevel;
        this.printedPages = printedPages;
        this.isDuplex = isDuplex;
    }

    public void fillInToner(int addedToner){
        if(addedToner + this.tonerLevels > 100) {
            this.tonerLevels = 100;
        } else {
            this.tonerLevels += addedToner;
        }
        System.out.println("Toner is filled in, and level is " + this.tonerLevels);
    }

    public void printPage(){
        this.printedPages += 1;
        System.out.println("Page is printed, number of printed pages is " + this.printedPages);
    }
}
