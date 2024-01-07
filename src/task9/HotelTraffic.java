package task9;

import java.util.Scanner;

public class HotelTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Enter a number of month:");
        int n=sc.nextInt();
        
        System.out.printf("Enter a Room rent:");
        float r=sc.nextFloat();
        
        System.out.printf("Enter number of days to stay:");
        int d=sc.nextInt();
        
        if(n==4||n==5||n==6||n==11||n==12)
        {
            System.out.printf("Hotel Tariff: RS.%.2f",((120*r)/100)*d);
        }
        else if(n>12)
        {
         System.out.println("Invalid Input");
        }
        else
        {
             System.out.printf("Hotel Tariff: RS.%.2f",r*d);
            
        }
	}

}
----------------------------------------------------------------------------------------------------------------
OUTPUT A:
Enter a number of month:6
Enter a Room rent:2500
Enter number of days to stay:2
Hotel Tariff: RS.6000.00

OUTPUT B:
Enter a number of month:7
Enter a Room rent:1500
Enter number of days to stay:2
Hotel Tariff: RS.3000.00
