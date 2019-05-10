import java.util.*;

public class practice {

	public static void main(String[] args) {
		

		Scanner console = new Scanner(System.in);
		System.out.println("How many lines do you want?");
		int l = console.nextInt();
		
		System.out.println("The user has entered: " + l);
		System.out.println();
		System.out.println("PART 1 - DRAW THE BOX");
		
		for(int i = 0; i < l; i++) {			
			if(l == 0) {
				System.out.println("*");
			} else {
				System.out.println("*****");
			}
		}
		
		System.out.println();
		System.out.println("PART 2 - MAKE IT HOLLOW");
		System.out.println("*****");
		for(int i = 0; i < l-2; i++) {
			System.out.println("*   *");			
		}
		System.out.println("*****");


		// these call my methods, which are below.
		System.out.println("\nPrints solid " + l + " x " + l + " box.");
		printBox(l);
		System.out.println("\nPrints hollow " + l + " x " + l + " box.");
		printHollowBox(l);
		System.out.println("\nPrints triangle.");
		printTriangle(l);
	}

	// PART1
public static void printBox(int size){

    for(int row = 0; row < size; row++){
        for(int col= 0; col < size; col++){
            System.out.print("*");
        }
        System.out.println("");
    }
}

// PART2
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

// Reverse an array using the same array
public static void reverseArrayInPlace(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
    }
}

//     *
//    * *
//   * * *       <-- output when the method is called by using printTriangle(5)
//  * * * *
// * * * * *
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




}
