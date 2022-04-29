package syllabus;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int a[]= {10,20,1,9,22,38};
	Arrays.toString(a);
	int k = a.length;
	for (int i = 0; i < k-1; i++) {
		for (int j = 0; j < k-1; j++) {
			if (a[j]>a[j+1]) {
				
				int temp  = a[j];
				a[j]= a[j+1];
				a[j+1]=temp;
				
			}
		}
	}System.out.println(Arrays.toString(a));
}
}
