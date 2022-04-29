package syllabus;

import java.util.Arrays;

public class RemoveJunkorSplCharInString {
public static void main(String[] args) {
	String a ="!@#$%Selenium:::<>><Java$$$$$âââ";
	String word = a.replaceAll("[^a-zA-Z0-9]","");
	word.toLowerCase();
		StringBuilder sb = new StringBuilder(word);
		
	
}
}
