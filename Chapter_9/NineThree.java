import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 9-3
 * @date Oct. 24, 2018
 * @summary (Use the Date class) Write a program that creates a Date object,
 *          sets its elapsed time to 10000, 100000, 1000000, 10000000,
 *          100000000, 1000000000, 10000000000, and 100000000000, and displays
 *          the date and time using the toString() method, respectively.
 **/
class NineThree {
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			System.out.println("Elapsed Time: " + inputter(i).toString());
		}
	}

	class Date {
		int elapsedTime = 0;
	}

	public static int elapsedTimeGetter() {
		int elapsedTime = 0;
		return elapsedTime;
	}

	public static void printer() {
		System.out.println(elapsedTimeGetter());
	}

	public static void data() {

	}

	public static String inputter(int i) {
		String input = "10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, 100000000000";
		List<String> inputList = new ArrayList<>();
		String[] values = input.split(", ");
		inputList.addAll(Arrays.asList(values));
		String inputString = inputList.get(i);
		return inputString;
	}
}