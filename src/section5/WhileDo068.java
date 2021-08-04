package section5;

public class WhileDo068 {
    public static void main(String[] args) {
        int count = 1;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

//        for(count=1; count!=6; count++){ // same functionality as while
//            System.out.println("Count value is " + count);
//        }

        count = 1;
        while(true){
            if(count==6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

//        int number = 4;
//        int finishNumber = 20;
//
//        while (number<finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }

        // challenge count the number of even numbers and break after 5 was found

        int number = 4;
        int finishNumber = 20;
        int quantityOfEvenNumbers = 0; // evenNumbersFound

        while (number<finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            quantityOfEvenNumbers++;
            System.out.println("Even number " + number);
            if(quantityOfEvenNumbers==5){
                break;

            }
        }

    }

    // create isEvenNumber method
    public static boolean isEvenNumber(int number){
        return (number%2) == 0;
    }
}
