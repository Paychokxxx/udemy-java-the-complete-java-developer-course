package section5;

public class theswitch063 {
    public static void main(String[] args) {
//        int value = 3;
//        if(value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was nor 1 or 2");
//        }


        int switchValue = 1;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char letter = 'A';

        switch(letter){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("It was " + letter);
                break;
            default:
                System.out.println("Not Found");
                break;
        }


        // in java 7 usage of strings was added for switch
        String month = "January";
        switch(month){
            
        }

    }
}
