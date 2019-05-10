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
	}

}
