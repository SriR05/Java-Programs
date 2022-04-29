package syllabus;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre Word;");
	String a = sc.next();
	String org = a;
		String pali = "";int k = a.length();
		for (int i = k-1; i >=0; i--) {
			pali=pali+a.charAt(i);
		}
	if (org.equals(pali)) {
		System.out.println("p "+ org);
	} else {
		System.out.println("np");
	}}

}
