package syllabus;

import java.util.Scanner;

public class LargestofNumbers {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st Number");
int a = sc.nextInt();
System.out.println("Enter 2nd Number");
int b = sc.nextInt();
System.out.println("Enter 3rd Number");
int c = sc.nextInt();
//if (a>b&&a>c) {
//	System.out.println(a);
//}else if (b>a&&b>c) {
//	System.out.println(b);
//}else {
//	System.out.println(c);
//}
int largest = c>(a>b?a:b)?c:(a>b?a:b);
System.out.println(largest);
}
}



