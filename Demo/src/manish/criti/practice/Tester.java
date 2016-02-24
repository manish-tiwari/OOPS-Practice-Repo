package manish.criti.practice;

import manish.criti.practice.OuterClass.InnerClass;

public class Tester {
	static String  string;
	static String day,month,year;
	static  int hr,minute;
	private static int finalEquivalentTime;
	public Tester() {
	System.out.println("--------->inside constructor<------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester testerObj=new Tester();
		printClassName(Tester.class);
		printClassName(testerObj);
		OuterClass.NestedStaticClass.getMessageFromStaticMethod();
		OuterClass outerclass=new OuterClass();
		OuterClass.InnerClass innerclass=outerclass.new InnerClass();
		innerclass.getMessageFromNonStaticMethod();
		printClassName(innerclass);
		printClassName(outerclass);
		printClassName(String.class);
		//printClassName(string);
		
		//printClassName(null);
		String time="23:15";
		time.split(":");
		int count=0;
		
		for(String str:time.split(":"))
		{
			switch (count) {
			case 0: hr=Integer.parseInt(str);
					minute=hr*60;
					count++;
					break;
					
			case 1:minute=minute+Integer.parseInt(str);
					finalEquivalentTime=minute;
					count++;
					break;
		
			default:
				break;
			}
			System.out.println(str);
			//System.out.println("day-->"+day+";month-->"+month+";year-->"+year);
			
		}
		
		System.out.println("total minutes for "+time+"is ---->"+minute);
		
//		String date="22/12/1991";
//		date.split("/");
//		int count=0;
//		
//		for(String str:date.split("/"))
//		{
//			switch (count) {
//			case 0: day=str;
//					count++;
//					break;
//					
//			case 1:month=str;
//					count++;
//					break;
//					
//			case 2:year=str;
//					count=0;
//					break;
//			default:
//				break;
//			}
//			System.out.println(str);
//			//System.out.println("day-->"+day+";month-->"+month+";year-->"+year);
//			
//		}
//		System.out.println("day-->"+day+";month-->"+month+";year-->"+year);
		
		
		
		
		/* convert time hh:mm:sec.miliseconds to hh:mm */
		/* put this code in the setter of Time i.e., setTime() */
		String Time = "23:42:32.000";// =time variable of entity
		Time = Time.substring(0, 5);
		// assign back to it i.e.,time=Time;
		System.out.println(Time);
		
		
		
		
	}
	
	static{
		System.out.println("this is from static block--->");
	}
	
	{
		System.out.println("this is from anonymous block--->");
	}
	private static  void printClassName(Object obj) {
		
        System.out.println("The class of " + obj +
                           " is " + obj.getClass().getName());
    }

}
