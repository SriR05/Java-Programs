package syllabus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("/Users/srilakshmi/Desktop/Java/textData.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Im Srilakshmi R, from chennai. I have 4.6years of experience as SoftwareTest Engineer"
				+ "4 years in Automation testing and 6months in Manual testing");
		bw.close();
	}

}
