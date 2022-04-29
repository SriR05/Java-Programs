package syllabus;

public class FibonacciNumbers {

	static int n =0,n1=1,n2=0;
	static void fib(int count) {
	if (count>0) {
		n2=n+n1;n=n1;n1=n2;
		System.out.print(n2);
		fib(count-1);
	}}
	public static void main(String[] args) {
//System.out.println(n+n1);
//for (int i = 2; i < 10; i++) {
//	sum=n+n1;System.out.print(sum);
//	n=n1;n1=sum;
		int count=15;
		System.out.print(n+" "+n1);
		fib(count-2);
}}


