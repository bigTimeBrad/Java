import java.util.ArrayList;
import java.util.Scanner;

public class Challenge
{
    public static void main(String[] args)
    {
        System.out.print("Enter a size: ");

        // ask the user a question for the ASCII art
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();


        // run the methods for the ASCII art
		System.out.println("\nPrints solid " + size + " x " + size + " box.");
		printBox(size);
		System.out.println("\nPrints hollow " + size + " x " + size + " box.");
		printHollowBox(size);
		System.out.println("\nPrints triangle.");
        printTriangle(size);
        
        // close the user input
        in.close();

        // Run that loop we talked about
        runTheLoop();
    }

	/**
     * Prints a solid box 
     * 
     *   *****
     *   *****  
     *   *****  5x5
     *   *****
     *   *****
     * 
     * @param size
     */
    public static void printBox(int size){

        for(int row = 0; row < size; row++){
            for(int col= 0; col < size; col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
        
    /**
     * Prints a hollow box 
     * 
     *   *****
     *   *   *
     *   *   *  5x5
     *   *   *
     *   *****
     * 
     * @param size
     */
    public static void printHollowBox(int size){

        for(int row = 0; row < size; row++){
            for(int col= 0; col < size; col++){
                
                if (row == 0  || row == size - 1){
                    System.out.print("*");
                } 
                else if (col == 0 || col == size -1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");}
            }
        System.out.println("");
        }
    }

    /**
     *  This will reverse an array without making a new one.
     * 
     * @param arr
     */
    public static void reverseArrayInPlace(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }


    /**
     * Prints a triangle
     * 
     * 
     *      *
     *     * *
     *    * * *      5x5
     *   * * * *
     *  * * * * *
     * 
     * @param size
     */
    public static void printTriangle(int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("* ");      
            }
            System.out.print("\n");
        }
    }

    public static void runTheLoop(){
        try {
            // create a scanner object for input
            Scanner in = new Scanner(System.in);

            // prompt the user
            System.out.println("\n\nKeep entering numbers and enter \"-99\" to exit: ");
            int number = in.nextInt();

            
            // initize the ArrayList outside the loop so we can call it after the loop
            // in order to print.
            ArrayList<Integer> myList = new ArrayList<>(); 
            while (number != -99){
                myList.add(number);
                number = in.nextInt();
            }

            //print the array
            System.out.print("\n\n [ ");
            for(int i = 0; i < myList.size(); i++){
                System.out.print(myList.get(i) + " ");
            }
            System.out.print("]");
            in.close();
        } catch (Exception ex) {
            System.out.println("NoSuchElementExeception happened.");
        }
        

    }

}