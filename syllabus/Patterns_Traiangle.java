package syllabus;

public class Patterns_Traiangle {
public static void main(String[] args) {
	//for left triangle or increasing triangle
	 int n=5;
	for (int i = 1,p=1; i <n; i++,p++) {//for decrementing
		for (int j = i; j<=n; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j<i; j++) {
			System.out.print(p+" ");
		}
		for (int j = 1; j<=i; j++) {
			System.out.print(p+" ");
		}
		System.out.println();
	}
	
//for decreasing triangle
	for (int i = 1,p=5; i <n; i++,p--) {//for decrementing
		for (int j =1; j<=i; j++) {
			System.out.print(" ");
		}
		for (int j = i; j<n; j++) {
			System.out.print(p+" ");
		}
		for (int j = i; j<=n; j++) {
			System.out.print(p+" ");
		}
		System.out.println();
	}
	
	
}
}
