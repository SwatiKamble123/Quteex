/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.*/

package java1;

import java.util.Scanner;

public class Salary {
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Salary:");
		int x = sc.nextInt();
		System.out.println("Enter Your Service Year:");
		int y = sc.nextInt();

		if (y >= 5) {
			System.out.println(" you get bouns of " + (x * .05) + " And Your Total Salary is " + (x + (x * .05)));
		} else {

			System.out.println("You Are Not Eligible for Bouns");
		}

	}
}
