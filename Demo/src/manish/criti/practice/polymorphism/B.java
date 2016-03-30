package manish.criti.practice.polymorphism;

public class B extends A {
	public B() {
		// TODO Auto-generated constructor stub
		System.out.println("inside B constructor");
	}

	
	/*  
	 *******************************************************************************
	 *                                                                             *
	 * you can widen the visibility of the method but not reduce the visibility    *
	 *                                                                             *
	 *******************************************************************************/
	public Integer  add(Integer num1, Integer num2) {
		System.out.print(Thread.currentThread().getStackTrace()[1].getClassName()+".");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		return num1+num2;
	}
	
}
