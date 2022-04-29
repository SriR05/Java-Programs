package syllabus;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter String: ");
String a = sc.next();
String c= "";

//for(int i=k-1;i>=0;i--) {
//	c=c+a.charAt(i);}
//System.out.println(c);
char b[] = a.toCharArray();
int k=b.length;
for(int i=k-1;i>=0;i--) {c=c+b[i];}
System.out.println(c);}
}