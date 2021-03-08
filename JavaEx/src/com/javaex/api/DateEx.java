package com.javaex.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// dateClassEx();
		calendarEx();
	}
	
	// Day Time
	private static void dateClassEx() {
		Date now = new Date();
		System.out.println("Now : " + now);
		
		// Changing output format
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL : " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG : " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM : " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("SHORT : " + df.format(now));
		
		// Custom => SimpleDateFormat
		// 20201년 00월 00일 00시 00분
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println("SDF : " + sdf.format(now));
	}
	
	// Calendar Object
	private static void calendarEx() {
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		
		System.out.printf("Now : %d년 %d월 %d일%n", now.get(Calendar.YEAR), now.get(Calendar.MONTH)+1, now.get(Calendar.DATE));
		
		custom.set(2012, 8, 24); 	// year, month-1, date
		System.out.printf("Custom : %d년 %d월 %d일%n", custom.get(Calendar.YEAR), custom.get(Calendar.MONTH)+1, custom.get(Calendar.DATE));
		
		Calendar future = Calendar.getInstance();
		// after 100days
		future.add(Calendar.DATE, 100);
		System.out.printf("Future : %d년 %d월 %d일%n", future.get(Calendar.YEAR), future.get(Calendar.MONTH)+1, future.get(Calendar.DATE));
		
		// Day
		// Calendar.DAY_OF_WEEK : 1(SUN) ~ 7(SAT)
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day : " + dow);
		
		String dowStr = "";
		switch (dow) {
		case Calendar.SUNDAY:
			dowStr = "Sunday"; break;
		case Calendar.MONDAY:
			dowStr = "Monday"; break;
		case Calendar.TUESDAY:
			dowStr = "Tuesday"; break;
		case Calendar.WEDNESDAY:
			dowStr = "Wendesday"; break;
		case Calendar.THURSDAY:
			dowStr = "Thursday"; break;
		case Calendar.FRIDAY:
			dowStr = "Friday"; break;
		case Calendar.SATURDAY:
			dowStr = "Saturday"; break;
		default:
		}
		System.out.println(dowStr);
	}
}
