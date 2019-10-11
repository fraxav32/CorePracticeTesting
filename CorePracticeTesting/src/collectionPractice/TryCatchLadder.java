package collectionPractice;

public class TryCatchLadder {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Case 1");
		try {
			System.out.println("try");
			throw new ArithmeticException();
		}catch(Exception e) {
			System.out.println("catch");
		}
		finally {
			System.out.println("finally");
		}
		
		System.out.println("Case 2");
		try {
			System.out.println("try1");
			try {
				System.out.println("Inner try");
				throw new ArithmeticException();
			}catch(Exception e) {
				System.out.println("Inner catch");
			}
		}catch(Exception e) {
			System.out.println("catch");
		}
		finally {
			System.out.println("finally");
		}
		
		System.out.println("Case 3");
		try {
			System.out.println("try1");
			try {
				System.out.println("Inner try");
				throw new ArithmeticException();
			}finally {
				System.out.println("Inner Finally");
			}
		}catch(Exception e) {
			System.out.println("catch");
		}
		finally {
			System.out.println("finally");
		}
	}

}
