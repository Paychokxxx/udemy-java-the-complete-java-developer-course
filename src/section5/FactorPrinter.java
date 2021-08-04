package section5;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);
    }
    public static void printFactors(int number){
        if(number<1){
            System.out.print("Invalid Value");
        }
        String finalMessage = "";

        for(int i=1; i<=number; i++){
            if(number%i==0){
                finalMessage = finalMessage + i + " ";
            }
        }
        System.out.println(finalMessage);
    }
}
