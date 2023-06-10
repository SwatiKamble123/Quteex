/*A school has following rules for grading system:
	a. Below 25 - F
	b. 25 to 45 - E
	c. 45 to 50 - D
	d. 50 to 60 - C
	e. 60 to 80 - B
	f. Above 80 - A
	Ask user to enter marks and print the corresponding grade.*/

package java1;

import java.util.Scanner;

public class SchoolMark {
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter your Marks:");
		x = sc.nextInt();

		if (x < 25) { 
			System.out.println("Fail");
		}

		else if ((x >= 25) && (x <= 45)) {
			System.out.println("Grade E");

		} else if ((x >= 45) && (x <= 50)) {
			System.out.println("Grade D");
		} else if ((x >= 50) && (x <= 60)) {
			System.out.println("Grade C");

		} else if ((x >= 60) && (x <= 80)) {
			System.out.println("Grade B");
		} else if (x > 80) {
			System.out.println("Grade A");
		} else {
			System.out.println("Enter Correct Marks");

		}

	}

}
