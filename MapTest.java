package Ch11;
import java.util.*;
import java.io.*;


public class MapTest {

	public static void main(String[] args) {
		
		// create the map
		Map<String, Double> salaryMap = new HashMap<String, Double>(); 
		
		// add key / value pairs to it
		salaryMap.put("Stuart Reges", 10000.00);
		salaryMap.put("Marty Stepp", 90000.00);
		salaryMap.put("Mickey Mouse", 85000.00);
		
		System.out.println(salaryMap + "\n");
		
		
		//look up a value
		double mickeySalary = salaryMap.get("Mickey Mouse");
		System.out.printf("Mickey's Salary is: $%.2f\n", mickeySalary);
		
		/*
		 * **********************************************************
		 * **********************************************************
		 * **********************************************************
		 */
		
		//create SSN(keys) and names(values) map
		Map<Integer, String> ssnMap = new TreeMap<Integer, String>();
		
		ssnMap.put(111111111, "Stuart Reges");
		ssnMap.put(222222222, "Marty Stepp");
		ssnMap.put(333333333, "Mickey Mouse");
		
		System.out.println();
		
		// loop over and print every person's ssn
		Set<Integer> ssnSet = ssnMap.keySet();
		for(int ssn : ssnSet) {
			System.out.println("SSN: " + ssn);
		}
		
		System.out.println();
		
		/*
		 * **********************************************************
		 * **********************************************************
		 * **********************************************************
		 */
		
		// loop over each person's name
		Collection<String> names = ssnMap.values();
		for(String name : names) {
			System.out.println("Name: " + name);
		}
		
		System.out.println();
		
		/*
		 * **********************************************************
		 * **********************************************************
		 * **********************************************************
		 */
		
		// combine the name with the ssn
		for (int ssn : ssnMap.keySet()) {
			
			//pass the key to get the corresponding value
			String name = ssnMap.get(ssn);
			System.out.println(name + "'s SSN: " + ssn);
		}
		
		System.out.println();
		
		/*
		 * **********************************************************
		 * **********************************************************
		 * **********************************************************
		 */
		
		// use a TreeMap to produce same result ---- will run slower
		Map<Integer, String> ssnMap1 = new TreeMap<Integer, String>();
		ssnMap1.put(111111111, "Stuart Reges");
		ssnMap1.put(222222222, "Marty Stepp");
		ssnMap1.put(333333333, "Mickey Mouse");
		
		System.out.println(ssnMap1);
		
	}

}
