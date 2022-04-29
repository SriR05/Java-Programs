package syllabus;

import java.util.HashSet;

public class DuplicateElementsInArray {
	public static void main(String[] args) {
		
		//char b []= a.toCharArray();
		
/*		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if (b[i]==b[j]) {
					System.out.print(b[i]);
					flag=true;
				}  
				}
			}
		if (flag==false) {
			System.out.println("no duplicates");
		}
			*/
		String a []= { "your","name","is"," srilakshmi", "my","	name","is"," meena"};
		HashSet<String> b = new HashSet<String>();
		boolean flag = false;
		for(String m : a) {
			if (b.add(m)==false) {
				System.out.println("dup");
				flag=true;
			}
			}
		if (flag==false) {
			System.out.println("noDup");
			
		}
	}
	
}