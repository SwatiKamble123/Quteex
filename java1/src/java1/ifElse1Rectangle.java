//Take values of length and breadth of a rectangle from user and check if it is square or not.
package java1;

import java.util.Scanner;

public class ifElse1Rectangle 
{
	public static void main(String Args[])
	{
		Scanner s= new Scanner(System.in);
		 System.out.println("Enter the length:");
		 int x=s.nextInt();
		 System.out.println("Enter the Breadth:");
		 int y=s.nextInt();
		 
		 if(x==y)
		 {
			  System.out.println("Square");
		 }
		 else
		 {
			 System.out.println("Not Square");
		 }
		 
		  
		
	}

}
