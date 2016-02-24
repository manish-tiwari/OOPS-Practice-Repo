package manish.criti.practice;

public class PracticeExceptionHandling {

	public static void main(String[] args) {
		
		
//		try {
//			System.out.println(1);
//			int i=1/0;
//			System.exit(0);
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println(2);
//		}
//		finally{
//			System.out.println(4);
//		}
		System.out.println(print());
	}

	private static int print() {
		// TODO Auto-generated method stub
		try {
			
			int i=1/0;
			return 0;
			
		} catch (Exception e) {
			// TODO: handle exception
			
			//Runtime.getRuntime().exit(0);
			return 1;
		}
		finally{
			//Runtime.getRuntime().exit(0);
			
			System.out.println(9);
		}
	}
}
