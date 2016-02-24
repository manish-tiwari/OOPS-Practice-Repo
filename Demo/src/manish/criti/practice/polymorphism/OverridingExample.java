package manish.criti.practice.polymorphism;

public class OverridingExample {

	public static void main(String[] args) {
		System.out.print(Thread.currentThread().getStackTrace()[1].getClassName()+".");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
//		System.out.println("*****************************\nA a1=new A()");
//		A a1 =new A();
//		System.out.println("*****************************\nA a2=new B()");
//		A a2=new B();
//		System.out.println("*****************************\nA a3=new C()");
//		A a3=new C();
//		System.out.println("*****************************\nB b2=new B()");
//		
//		
//	//	B b1=new A();
//		B b2=new B();
//		System.out.println("*****************************\nB b3=new C()");
//		B b3=new C();
//		
//	//	C c1=new A();
//	//	C c2=new B();
//		System.out.println("*****************************\nC c3=new C()");
//		C c3=new C();
		
		A a=new C();
		int num1=5,num2=9;
		a.add(num1,num2);
		
	}
}
