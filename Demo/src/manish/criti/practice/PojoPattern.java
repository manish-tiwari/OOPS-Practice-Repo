package manish.criti.practice;

import java.util.Scanner;

public class PojoPattern {

	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no. of rows : ");
		int input = sc.nextInt();
	
			int count=0;
			
			
				for(int i=1;i<=input;i++)
				{
					for(int j=1;j<=i;j++)
					{
						count++;
						System.out.print(count);
					}
					System.out.print("\n");
				}
			
	
		
//		while (true) {
//			int count=0;
//			System.out.println("Please enter the no. of rows : ");
//			int input = sc.nextInt();
//			for (int i = 1; i <= input; i++) {
//				for (int j = 1; j <= input; j++) {
//
//					
//					if (i%2!=0) {
//						System.out.print((i*j)+j);
//						if (i==j) {
//							System.out.print("\n");
//						}else {
//							System.out.print("*");
//						}
//					} else {
//						System.out.println((i*j)-j);
//						if (i==j) {
//							System.out.print("\n");
//						}else {
//							System.out.print("*");
//						}
//					}
//					
//					
//					
//					
//					
//					
//					
////				if (i==1) {
////					System.out.println(j);
////				}
////					if (i > 1 && j<input) {
////						System.out.print(j+1);
////						System.out.print("*");
////					}
////					if (i>1 && j==input) {
////						System.out.print(j+1);
////					}
////					if (i == j) {
////
////						System.out.println("\n");
////					}
//				}
//			}
//		}
	}
	
}
