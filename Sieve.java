package Ch11;

import java.util.*;

public class Sieve {

	public static void main(String[] args) {
		
		//greeting
		System.out.println("This program will tell you all prime");
		System.out.println("numbers up to a max number");
		
		Scanner console = new Scanner(System.in);
		System.out.println("Max Number? ");
		int max = console.nextInt();
		
		LinkedList<Integer> primes = sieve(max);
		
		System.out.println(primes);
	}
	
	//returns a list of primes
	public static LinkedList<Integer> sieve(int max) {
		
		LinkedList<Integer> primes = new LinkedList<Integer>();
		
		//add all numbers from 2 to max to a list
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		for(int i = 2; i <= max; i++) {
			numbers.add(i);
		}
		
		while(!numbers.isEmpty()) {
			int front = numbers.remove(0);
			primes.add(front);
			
			//remove all multiples of this prime number
			Iterator<Integer> itr = numbers.iterator();
			while(itr.hasNext()) {
				int current = itr.next();
				
				//front is not prime
				if(current % front == 0) { 
					itr.remove();
				}
			}
		}
		return primes;
	}

}
