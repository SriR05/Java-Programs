package syllabus;

import java.util.Scanner;

public class SwappingNo {

	public static void main(String[] args) {
Scanner sc  = new Scanner(System.in);
System.out.println("Enter 1st No:");
int a = sc.nextInt();System.out.println("Enter Second No:");int b = sc.nextInt();
//int c=a;a=b;b=c;System.out.println(a+" "+b);
//a =a+b;b=a-b;a=a-b;System.out.println(a+" "+b);
a =a*b;b=a/b;a=a/b;System.out.println(a+" "+b);
	}

}
