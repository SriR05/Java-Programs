package syllabus;

import java.util.Arrays;

public class ArraRotation {

	public static void main(String[] args) {
int a[]= {1,2,3,4,5,6,7};
int s=a.length;

int n=2;
for(int k=1;k<=n;k++) {
	int last=a[s-1];
for(int i=s-1;i>0;i--) {
	a[i]=a[i-1];
}a[0]=last;
	}
System.out.println(Arrays.toString(a));
}
}
