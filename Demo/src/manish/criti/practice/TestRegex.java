package manish.criti.practice;

import java.util.Scanner;

public class TestRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int key = 1;
		boolean iterate = true;

		// Please enter the regex pattern to test in double codes
		String regexPattern = "[\\W\\_]*";//"([1-9][0-9](\\.[0-9][0-9]?{1,2})?)|([1][0-9][0-9](\\.[0-9][0-9]?{1,2})?)|[2][0]{2}(\\.[0-9][0-9]?{1,2})?";

		while (iterate) {

			System.out
					.println("Please Enter the input to check against regexPattern");
			String input = sc.next();//"ÑñÁÉÍÓÚáéíóúÀÈÌÒÙàèìòùÄËÏÖÜäëïöü";//sc.next();
			if (input.matches(regexPattern)) {
				System.out.println(input
						+ "  --->matches with the current regexPattern -->"+regexPattern);
			} else {
				System.out.println(input
						+ " --->doesn't matches with the current regexPattern -->"+regexPattern);
			}
			System.out
					.println("---->press Y for continue..;or press any other key to exit...!");
			iterate = sc.next().equalsIgnoreCase("Y");
			if (iterate) {
				System.out
						.println("do you want to change the regexPattern ???");
				System.out
						.println("---->press Y for yes..;or press any other key to continue...!");
				boolean switchRegex = sc.next().equalsIgnoreCase("Y");
				if (switchRegex) {
					System.out.println("Please enter the new regex pattern...");
					regexPattern = sc.next();
				}
			}
		}
		System.out.println("bye bye... c you soon !!!");

	}

}
