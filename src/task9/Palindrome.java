package task9;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, rev = "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string:");
	      str = in.nextLine();
	 
	      int length = str.length();
	 
	      for( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
		
	}

}
