package syllabus;

public class SumofElementsinArray {
public static void main(String[] args) {
	int a[] = {1,2,3,4,12,13};int sum=0;
for (int i = 0; i < a.length; i++) {
	sum=sum+a[i];
}System.out.println(sum);

System.out.println("Enhanced for loop...............");
int sum1=0;
for (int s : a) {
	sum1=sum1+s;
}System.out.println(sum1);}
}
