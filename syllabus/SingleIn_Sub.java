package syllabus;

public class SingleIn_Sub  extends SingleIn{
	public void savingsAccount(String sA) {
		System.out.println(sA);
	}
	public static void main(String[] args) {
		SingleIn_Sub siS = new SingleIn_Sub();
		siS.bankName("HDFC");siS.savingsAccount("10,000,0000");
	}

}
