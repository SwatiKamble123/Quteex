// Take two int values from user and print greatest among them
package java1;

import java.util.Scanner;

public class GreaterNum {
	public static void main(String Args[])
	{
		int x;
		int y;
		Scanner s= new Scanner(System.in);
		System.out.println("Take Two Number:");
		x=s.nextInt();
		y=s.nextInt();
		
		if(x<y)
		{
			System.out.println("Number is Greater:"+y);
			
		}
		else
		{
			System.out.println("Number is  Greater:"+x);
		}
		
	}

}
