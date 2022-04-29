package syllabus;

import java.util.Random;

public class GenerateRandomNNoandStrings {

	public static void main(String[] args) {
		Random r = new Random();
		int nextInt = r.nextInt(199);System.out.println(nextInt);
		double nextDouble = r.nextDouble();System.out.println(nextDouble);//0.0-1.0
		System.out.println("M: "+Math.random());
//		Apache commons lang API
//		RandomStringUtils.randomAlpabetic(2);
	}

}
