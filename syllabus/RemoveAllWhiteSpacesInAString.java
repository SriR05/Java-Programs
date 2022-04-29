package syllabus;

public class RemoveAllWhiteSpacesInAString {
public static void main(String[] args) {
	String a = "Manual  and  Automation  Testing";
	
	String replaceAll = a.replaceAll(" ", "");
	System.out.println(replaceAll);
}
}
