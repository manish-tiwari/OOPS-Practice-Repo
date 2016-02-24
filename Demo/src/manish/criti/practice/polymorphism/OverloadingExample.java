package manish.criti.practice.polymorphism;

public class OverloadingExample {

	public static void main(String[] args) {

		doSomething(null);
//		System.out.print(Thread.currentThread().getStackTrace()[1].getClassName()+".");
//		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
//		long lnum1=3,lnum2=89;
//		Long Lnum1=1l,Lnum2=87l;
//		long lnum1L_l=1L,lnum2L_l=87L;
//		add(5L, 8L);
		//add(Lnum1, lnum1);
		
	}
	
	
	public static  void add(Long num1, Long num2) {
		System.out.print(Thread.currentThread().getStackTrace()[1].getClassName()+".");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
	}
	
	public static  void add(int num1,int num2) {
		System.out.print(Thread.currentThread().getStackTrace()[1].getClassName()+".");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	
	public static  void add(long num1, long num2) {
		System.out.print(Thread.currentThread().getStackTrace()[1].getClassName()+".");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
	}
	
	
	public static void add(Integer num1,Integer num2) {
		System.out.print(Thread.currentThread().getStackTrace()[1].getClassName()+".");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	
	private static void doSomething(Object input)
	{
		System.out.println("This is object type");
	}
	
	
	
	private static void doSomething(String input)
	{
		System.out.println("This is string type");
	}
	
}
