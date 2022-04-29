package syllabus;

import java.util.Scanner;

public class CheckGivenPrimeorNot {
public static void main(String[] args) {
	System.out.println("Enter no:");
	Scanner sc = new Scanner(System.in);
	int nextInt = sc.nextInt();
	 int count=0;
	if (nextInt>1) {
for (int i = 1; i <=nextInt; i++) {
	if (nextInt%i==0) count++;}
}else {
	System.out.println("np");
}if (count==2) {
	System.out.println("p");
}else {
	System.out.println("np");
}
}
}
