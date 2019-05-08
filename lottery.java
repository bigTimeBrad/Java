package Ch11;
import java.util.*;

public class Lottery {
	
	static final int NUMBERS = 6;
	static final int MAX_NUMBER = 40;
	
	public static void main(String[] args) {
		
		//get winning numbers and ticket numbers
		Set<Integer> winningNumbers = createWinningNumbers();
		Set<Integer> ticket = getTicket();
		System.out.println();
		
		//keep only the winning numbers
		Set<Integer> intersection = new TreeSet<Integer>(ticket);
		intersection.retainAll(winningNumbers);
		
		//print results
		System.out.println("Your ticket numbers: " + ticket);
		System.out.println("Winning numbers: " + winningNumbers);
		System.out.println("You had: " + intersection.size() + " numbers.");
		System.out.println("Matching numbers: " + intersection);
		
		
		//calculate prize
		double prize = 0.0;
		if(intersection.size() > 0) {
			prize = 100 * Math.pow(2, intersection.size());
		}
		
		System.out.println("Your prize is $" + prize);
	}

	public static Set<Integer> createWinningNumbers() {
		// TODO Auto-generated method stub
		Set<Integer> winningNumbers = new TreeSet<Integer>();
		Random r = new Random();
		
		while(winningNumbers.size() < NUMBERS) {
			int number = r.nextInt(MAX_NUMBER) + 1;
			winningNumbers.add(number);
		}
		return winningNumbers;
	}

	public static Set<Integer> getTicket() {
		// TODO Auto-generated method stub
		
		Set<Integer> ticket = new TreeSet<Integer>();
		Scanner console = new Scanner(System.in);
		System.out.println("Type your " + NUMBERS + " unique lotto numbers!");
		while(ticket.size() < NUMBERS) {
			int number = console.nextInt();
			ticket.add(number);
			}
		console.close();
		return ticket;
	}
	
	
}
