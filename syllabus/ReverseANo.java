package syllabus;

import java.util.Scanner;

public class ReverseANo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter No:");
		int a = sc.nextInt();
//		int b=0;
//		while (a!=0) {
//			b=b*10+a%10;
//			a=a/10;
//		}
// StringBuffer sb = new StringBuffer(String.valueOf(a));
// StringBuffer c;
// c = sb.reverse();System.out.println(c);
		StringBuilder sb = new StringBuilder(String.valueOf(a));
		StringBuilder d;
		d=sb.reverse();System.out.println(d);
		
	}

}
