package syllabus;

public class EvenAndOddNoInArray {
public static void main(String[] args) {
	int a [] = {1,2,3,4,5,6,7,8};
for (int i = 0; i < a.length; i++) {
	if (a[i]%2==0) {
		System.out.println(a[i]);
	}
}for (int k = 0; k < a.length; k++) {
	if (a[k]%2!=0) {
		System.out.println(a[k]);
	}
}
System.out.println("Enhanced for loop.....................");
for (int s : a) {
	if (s%2==0) {
		System.out.print(s);
	}
}for (int z : a) {
	if (z%2!=0) {
		System.out.print(z);
	}
}}
}
