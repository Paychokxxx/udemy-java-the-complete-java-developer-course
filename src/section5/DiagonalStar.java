package section5;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        } else {
            //int numberOfColumns = number;
            int numberOfRows = number;

            for(int rowIterator = 1; rowIterator<=number; rowIterator++){
                for(int columnIterator = 1; columnIterator<=number; columnIterator++){
                    if(rowIterator == 1 || rowIterator == number || columnIterator == 1 || columnIterator == number ||
                            rowIterator==columnIterator || columnIterator==numberOfRows-rowIterator+1
                    ){
                        System.out.print('*');
                    } else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
