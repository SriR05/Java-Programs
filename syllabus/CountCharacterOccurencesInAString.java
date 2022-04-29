package syllabus;

public class CountCharacterOccurencesInAString {
public static void main(String[] args) {
	String a = "your name is Srilakshmi and my name is Meena";
	int totalLength = a.length();
	int totalDuplicates = a.replace("i", "").length();
	int count = totalLength-totalDuplicates;
	System.out.println(count);
	
}
}
