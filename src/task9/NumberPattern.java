package task9;

import java.util.Scanner;

public class NumberPattern {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int n, number = 1;
		
	Scanner in = new Scanner(System.in);
		
	System.out.println("Enter a Value: ");
	n = in.nextInt();
		
        for(int i = 1; i <= n; i++) 
        {
        	
        for (int j = 1; j <= i; j++) 
        {
        System.out.print(number + " ");
         number++;
        }
        System.out.println();
	}
    }
}
------------------------------------------------------------------------------------------------------------
OUTPUT:

Enter a Value: 
4
1 
2 3 
4 5 6 
7 8 9 10 
