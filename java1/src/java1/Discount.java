/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/

package java1;

import java.util.Scanner;

public class Discount
{
	public static void main(String Args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter quantity:");
		int x= s.nextInt();
		if((x*100)<1000)
		{
		 System.out.println("You get a discount of "+(.1*x*100)+" and your total cost is "+(x*100-(.1*x*100)));
    }
    else
    {
      System.out.println("No discount");
	}

}
}

