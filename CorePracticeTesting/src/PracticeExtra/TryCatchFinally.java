package PracticeExtra;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			  int a=10/0;
			}
		catch (Exception e) { 
			  System.out.println("catch_statements");
			}
		finally {
				  System.out.println("finally_statements");
				}
		

	}

}
