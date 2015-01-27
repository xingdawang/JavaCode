package test;

import java.io.*;

public class Solution {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			String date = in.readLine();
			String[] items = new String[3];
			items = date.split(" ");
			// change day format
			String day = items[0].substring(0, items[0].length() - 2);
			int dayInt = Integer.parseInt(day);
			if (dayInt < 10)
				day = ("0" + day);
			// change month format
			String month = monthFormat(items[1]);
			// do not need to change year format
			System.out.println(items[2] + "-" + month + "-" + day);

		}
	}

	public static String monthFormat(String month) {
		if (month.equals("Jan"))
			return "01";
		else if (month.equals("Feb"))
			return "02";
		else if (month.equals("Mar"))
			return "03";
		else if (month.equals("Apr"))
			return "04";
		else if (month.equals("May"))
			return "05";
		else if (month.equals("Jun"))
			return "06";
		else if (month.equals("Jul"))
			return "07";
		else if (month.equals("Aug"))
			return "08";
		else if (month.equals("Sep"))
			return "09";
		else if (month.equals("Oct"))
			return "10";
		else if (month.equals("Nov"))
			return "11";
		else if (month.equals("Dec"))
			return "12";
		return null;
	}
}
