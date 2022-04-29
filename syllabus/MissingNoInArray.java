package syllabus;

import java.util.Iterator;

public class MissingNoInArray {

	public static void main(String[] args) {
int a[] = {11,12,13,14,15,16,18,19,20};

int sum1=0;

for (int i = 0; i < a.length; i++) {
	sum1=sum1+a[i];
}System.out.println("sum1"+sum1);
int sum2=0;
for (int k = 11; k <=20; k++) {
	sum2=sum2+k;
}

System.out.println("sum2"+sum2); System.out.println("miss: "+(sum2-sum1));}}


