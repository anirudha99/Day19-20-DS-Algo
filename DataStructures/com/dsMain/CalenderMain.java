package com.dsMain;

import com.datastructures.Calender;

/**
 * @author anirudhasm Takes month and year through command line argument and
 *         prints the calendar
 */
public class CalenderMain {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		Calender.calender(month, year);
	}
}
