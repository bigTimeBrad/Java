package ch10;

import java.io.*;
import java.util.*;


public class countUnique {
	//THIS PROGRAM WILL FIND THE UNIQUE WORDS IN A GIVEN TEXT
	
	public static final int UNIQUE = 2000;
	static String book = "Moby Dick";
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("This program will calculate the amount of unique words in an excerpt of a book.");
		System.out.println("The chosen book is: " + book + ".");
		
		Scanner in = new Scanner(new File("mobydick.txt"));
		Map<String, Integer> wordCountMap = getCountMap(in);
		
		for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            if (count > UNIQUE) {
                System.out.println(word + " occurs " + 
                                   count + " times.");
            }
        }
    }
    
    // Reads book text and returns a map from words to counts
    public static Map<String, Integer> getCountMap(Scanner in) {
        Map<String, Integer> wordCountMap = 
                new TreeMap<String, Integer>();

        while (in.hasNext()) {
            String word = in.next().toLowerCase();
            if (!wordCountMap.containsKey(word)) {
                // never seen this word before
                wordCountMap.put(word, 1);
            } else {
                // seen this word before; increment count
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            }
        }
        
        return wordCountMap;
    }
}
