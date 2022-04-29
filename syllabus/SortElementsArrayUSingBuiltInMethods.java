package syllabus;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsArrayUSingBuiltInMethods {
public static void main(String[] args) {
	//Using Parallel Sort
	int a[]= {1,2,5,9,7,10};
	System.out.println(Arrays.toString(a));
	Arrays.parallelSort(a);
	System.out.println(Arrays.toString(a));
	
	//Using Arrays.Sort
	int a1[]= {10,30,50,89,2};
	Arrays.sort(a1);System.out.println(Arrays.toString(a1));
	
	//Descending Order
	
	Integer a2[] = {1,2,3,4,5,6,9,10,12};
	Arrays.sort(a2,Collections.reverseOrder());
	System.out.println(Arrays.toString(a2));
	
	//Ascending Order
	
	Integer a3[]= {12, 10, 9, 6, 5, 4, 3, 2, 1};
	Arrays.sort(a3);System.out.println(Arrays.toString(a3));
	
}
}
