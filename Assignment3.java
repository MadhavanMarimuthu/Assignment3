package Com;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a big word: ");
	        String word = scanner.nextLine();
		
	        // Count unique characters
	       int[] charCount = new int[200];
		for (int i = 0; i < word.length(); i++) {
	           charCount[word.charAt(i)]++;
		}

		int uniqueCharacters = 0;
		for (int i = 0; i < charCount.length; i++) {
		     if (charCount[i] > 0) {
		        uniqueCharacters++;
			}
		}
		System.out.println("The word has " + uniqueCharacters + " unique characters.");
		// Print number of occurrences of each character
	        int[] occurrences = new int[200];
	        for (int i = 0; i < word.length(); i++) {
	            char c = word.charAt(i);
	            occurrences[c]++;
	        }
	        for (int i = 0; i < occurrences.length; i++) {
	            if (occurrences[i] > 0) {
	                System.out.println("'" + (char) i + "' occurs " + occurrences[i] + " times");
	            }
	        }

	        // Print word in reverse order....
	        System.out.print("Word in reverse order: ");
	        for (int i = word.length() - 1; i >= 0; i--) {
	            System.out.print(word.charAt(i));
	        }
	        System.out.println();

	        // Split word into two half-words
	        int mid = word.length() / 2;
	        String firstHalf = word.substring(0, mid);
	        String secondHalf = word.substring(mid);
	        System.out.println("First half: " + firstHalf);
	        System.out.println("Second half: " + secondHalf);
	    }
	}

