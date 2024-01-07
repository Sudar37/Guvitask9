package task9;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original, rev = "";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse: ");
	    original = in.nextLine(); // calculates length of String

	    int length = original.length();

	    for (int i = length - 1 ; i >= 0 ; i--)
	      rev = rev + original.charAt(i);

	    System.out.println("Reverse of the string: " + rev);
	    	   
	       }
	}
---------------------------------------------------------------------------------------------------------------
OUTPUT:
Enter a string to reverse: 
guvi
Reverse of the string: ivug


