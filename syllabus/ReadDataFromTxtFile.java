package syllabus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTxtFile {
public static void main(String[] args) throws IOException {
	//Using File reader and Buffer reader
/*	FileReader fr = new FileReader("/Users/srilakshmi/Desktop/Java/textData.txt");
	BufferedReader br = new BufferedReader(fr);
	String a;
	while ((a=br.readLine())!=null) {
		System.out.println(a);}*/	
	//Using Scanner Class and File
	/*File f  = new File("/Users/srilakshmi/Desktop/Java/textData.txt");
	Scanner sc = new Scanner(f);

	while (sc.hasNext()) {
		System.out.println(sc.next());
		
	}*/
	//Without loop
	File f  = new File("/Users/srilakshmi/Desktop/Java/textData.txt");
	Scanner sc = new Scanner(f);
	sc.useDelimiter("\\Z");
	System.out.print(sc.nextLine());
	
}
}
