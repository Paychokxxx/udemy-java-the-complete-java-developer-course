package section3;

public class assigment_oprator_vs_equals_to038 {

    public static void main(String[] args) {

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar = true){ // IDE will not show error and codde block will be executed
            // coz after assignment isCar will return true
            // use if(isCar == true) or just if(isCar){} or for false check use !isCar not == false
            System.out.println("This is not supposed to happen!");
        }
    }
}
