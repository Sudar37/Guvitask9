package task9;

import java.util.Scanner;

public class LargestNumber {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a, b, c;
	Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter the First number:");  
	a = sc.nextInt(); 
	
	System.out.println("Enter the Second number:");  
	b = sc.nextInt();
	
	System.out.println("Enter the Third number:");  
	c = sc.nextInt();  
		
	if(a>=b && a>=c) 
	{ 
	 	System.out.println(a+" is the largest Number");  
	}else if (b>=a && b>=c)  
	{
		System.out.println(b+" is the largest Number");  
	}else  
		{
		System.out.println(c+" is the largest number");  
		}  
	}
}
--------------------------------------------------------------------------------------------------------------
OUTPUT:

Enter the First number:
20
Enter the Second number:
45
Enter the Third number:
32
45 is the largest Number
