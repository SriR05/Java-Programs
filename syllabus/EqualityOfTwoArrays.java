package syllabus;

import java.util.Arrays;
import java.util.Iterator;

public class EqualityOfTwoArrays {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int a1[]= {1,2,3,4,5};	
	Boolean b =Arrays.equals(a, a1);
	/*if (b==true) {System.out.println("Equal");}
	if (b==false) {System.out.println("InEqual");}*/
if (a1.length==a.length) {
	for (int i = 0; i < a1.length; i++) {
	if (a1[i]!=a[i]) {
		b=false;
	}
	}
}else {
	b=false;
}	
if (b==true) {
	System.out.println("Equal");
}else {
	System.out.println("Inequal");
}
}
}
