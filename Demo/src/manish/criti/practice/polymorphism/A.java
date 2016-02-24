package manish.criti.practice.polymorphism;

public class A {
public A() {
	// TODO Auto-generated constructor stub
	System.out.println("inside A constructor");
}
public Number  add(Integer num1, Integer num2) {
	System.out.print(Thread.currentThread().getStackTrace()[1].getClassName()+".");
	System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
	System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
	return num1+num2;
}


	
}
