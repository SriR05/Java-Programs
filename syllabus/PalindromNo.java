package syllabus;

import java.util.Scanner;

public class PalindromNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
		int org = a; int c=0;
		while (a!=0) {
			c=c*10+a%10;
			a=a/10;
		}
		if (org==c) {
			System.out.println("p"+org);
		} else {
System.out.println("np"+org);
		}
	}

}
