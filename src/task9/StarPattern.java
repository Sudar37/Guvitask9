package task9;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int h;

        System.out.println("Enter the value: ");
        h = sc.nextInt();

        for (int i = 1; i < h + 1; i++) {
            
        	for (int j = 1; j < h + 1; j++) {
                
        		if (i == j || i + j == h + 1) {
                    
        			System.out.print("*");
               
        		} else {
                    
        			System.out.print(" ");
                }
            }
           System.out.println();
        }
	}

}
