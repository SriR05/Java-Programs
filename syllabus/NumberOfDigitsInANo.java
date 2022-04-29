package syllabus;

public class NumberOfDigitsInANo {
public static void main(String[] args) {
	int num = 1234569871;int count=0;
while (num>0) {
	num=num/10;count++;
}System.out.println(count);}
}
