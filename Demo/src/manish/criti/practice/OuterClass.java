package manish.criti.practice;
public class OuterClass {

	private static String staticMessage = "Hello static message from outer class";
	private String nonStaticMessage = "Hello non-static message from outer class";


	public static class NestedStaticClass {
		public static void getMessageFromStaticMethod() {

			System.out
					.println("hi this is from NestedStaticClass static method---->"
							+ staticMessage);
			OuterClass outer=new OuterClass();
			System.out.println("hi this is from static class static method--->"+outer.nonStaticMessage);

		}

		public void getMessageFromNonStaticMethod() {
			System.out
					.println("hi this is from NestedStaticClass non-static method--->"
							+ staticMessage);
			//System.out.println("hi this is from static class non-static method--->"+nonStaticMessage);
		}
	}
	
	/* void printClassName(Object obj) {
         System.out.println("The class of " + obj +
                            " is " + obj.getClass().getName());
     }
*/
	
	public class InnerClass{
		public  void getMessageFromNonStaticMethod(){
			System.out.println("hi this is from InnerClass non-static method--->"+nonStaticMessage);
			System.out.println("hi this is from InnerClass non-static method--->"+staticMessage);
		}
	
	}
}
