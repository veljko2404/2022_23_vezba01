package reinvent_the_wheel;

import java.util.Arrays;

public class DaysInfo
{
	private static final String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

	public static void main(String[] args)
	{
		System.out.println(dayAfter("Monday", 1));
		System.out.println(dayAfter("Monday", 2));
		//		System.out.println(dayAfter("Monday", 7));
		//		System.out.println(dayAfter("Sunday", 2));
	}

	private static String dayAfter(String today, int days)
	{
		int day = Arrays.asList(daysOfWeek).indexOf(today);
		int n = days % 7;

		int index;

		if ((day + n) > 6)
		{
			 index = (day + n) % 6;
		}
		else
		{
			index = day + n;
		}

		return daysOfWeek[index];
	}
}
