package syllabus;

public class EvenandOddinANo {
public static void main(String[] args) {
	int num=1112131415;
	int even = 0; int odd = 0;
	
	while (num>0) {
		int a = num%10;
		if (a%2==0) {
			even++;
		} else {
			odd++;
		}
num=num/10;	}
System.out.println(even);
System.out.println(odd);}
}
