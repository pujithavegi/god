package javapractice;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 12-hour format time (hh:mm:ss AM/PM): ");
		String s = sc.nextLine();
		int hour = Integer.parseInt(s.substring(0, 2));
		int minute = Integer.parseInt(s.substring(3, 5));
		int second = Integer.parseInt(s.substring(6, 8));
		String period = s.substring(8, 10);

		if (period.equals("PM") && hour != 12) {
			hour += 12;
		} else if (period.equals("AM") && hour == 12) {
			hour = 0;
		}
		String time = String.format("%02d:%02d:%02d", hour, minute, second);
		System.out.println(time);

	}
}
