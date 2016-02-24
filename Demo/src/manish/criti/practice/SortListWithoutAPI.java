package manish.criti.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.omg.SendingContext.RunTime;

public class SortListWithoutAPI {

	static List<Integer> inputList;
	static List<Integer> finalOutputList;
	

	public static void main(String[] args) {
		System.out.print("\nSTART-->"+Thread.currentThread().getStackTrace()[1].getClassName()+".");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		// TODO Auto-generated method stub;
		inputList = new ArrayList<Integer>(Arrays.asList(7, 9, 3, 2, 6, 5,
				8, 6, 45, 98, 70, 89, 58));
		System.out.print("Input List :");
		for (Integer num : inputList) {
			System.out.print(num+" ");
		}
		List<Integer> tempList=new ArrayList<Integer>(inputList);
		Collections.sort(tempList);
		System.out.print("\n Sorted using sort method : ");
		for (Integer num : tempList) {
			System.out.print(num+" ");
		}
		
		sortWithoutAPI();
		
		System.out.print("\nEND-->"+Thread.currentThread().getStackTrace()[1].getClassName()+".");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	static private void sortWithoutAPI() {
		System.out.print("\nSTART-->"+Thread.currentThread().getStackTrace()[1].getClassName()+".");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		finalOutputList = new ArrayList<Integer>();
		int inputCount=inputList.size();
		
		while (inputCount-->0) {
			Integer smallestNumber = 9999999;
			
			for (int i = 0; i < inputList.size(); i++) {
				if (inputList.get(i) < smallestNumber) {
					smallestNumber = inputList.get(i);
				}
			}
			finalOutputList.add(smallestNumber);
			inputList.remove(smallestNumber);
		}
		
		System.out.print("\nOutput List :");
		for (Integer num : finalOutputList) {
			System.out.print(num+" ");
		}
		System.out.print("\nEND-->"+Thread.currentThread().getStackTrace()[1].getClassName()+".");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());	
	}

}
