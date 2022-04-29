package syllabus;

public class Recrusion {
	static int count =0;
	static void a() {
		count++;
		if (count<=5) {
			System.out.println("hi"+count);
			a();
		}
	}
public static void main(String[] args) {
	a();
}
}
