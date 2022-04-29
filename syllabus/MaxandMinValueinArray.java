package syllabus;

public class MaxandMinValueinArray {
public static void main(String[] args) {
	int a [] = {1,4,6,10,3,2,0};
	int max = a[0];
	for (int i = 1; i < a.length; i++) {
		if (a[i]>max) {
			max=a[i];
		}
	}
	System.out.println(max);
	int min = a[0];
for (int k = 0; k < a.length; k++) {
	if (a[k]<min) {
		min=a[k];
	}
}
System.out.println(min);
}
}
