package syllabus;

public class ReverseEachWordInString {
	public static void main(String[] args) {
		String s ="Iam new to Selenium";
		/*String[] split = s.split(" ");
		String output=" ";
		for (String a : split) {
			String b =" ";
			for (int i=a.length()-1;i>=0;i--) {
				
				b=b+a.charAt(i);
			}
			output = output+b+" ";
		}
		System.out.println(output);*/
	String[] split = s.split(" ");
	String outString = " ";
	for (String a : split) {
		StringBuilder sb = new StringBuilder(a);
		sb.reverse(); 
		outString = outString+sb.toString()+" ";
	}
	System.out.println(outString);
	}
}