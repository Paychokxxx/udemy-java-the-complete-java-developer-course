package section8;

public class Arrays099 {
    public static void main(String[] args) {
        int[] myIntArray = new int[30]; // {1,2,3,4,5,6,7,8,9}
//        myIntArray[0] = 45;
//        myIntArray[1] = 445;
//        myIntArray[4] = 444445;
        for(int i = 0; i < myIntArray.length; i++){ // for(int i = 0; i < 10; i++){
            myIntArray[i] = i*10;
        }
        printArray(myIntArray);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
