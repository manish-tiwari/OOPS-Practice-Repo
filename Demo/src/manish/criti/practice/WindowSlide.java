package manish.criti.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WindowSlide {

	// private List<Integer> window=new
	// ArrayList<Integer>(Arrays.asList(7,9,3,2,6,5));
	private static int[] window = { 7, 9, 3, 2, 6, 5,8,6,45,98,70,89,58 };
	private static int windowSize = window.length;
	private static int startIndex = 0;
	private static List<Integer> resultSet;

	public static void main(String[] args) {
		checkGreatestOfEachWindowSlide();
		for(Integer output:resultSet)
		{
			System.out.println(output);
		}
	}

	private static void checkGreatestOfEachWindowSlide() {
		resultSet = new ArrayList<Integer>();
		int iteration = 0;
		for (int i = startIndex; i < (windowSize - 1); i++) {
			if ((windowSize - startIndex) < 4) {
				break;
			} else if (iteration < 2) {
				startIndex++;
				iteration++;
				if (window[i] < window[i + 1]) {

					resultSet.add(window[i + 1]);

				}else
				{
					resultSet.add(window[i]);
				}
			} else {
				iteration = 0;
				startIndex--;
			}
		}
	}
}
