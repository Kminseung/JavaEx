package com.javaex.basic.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		// enumTest();
		enumTest2();
	}
	
	private static void enumTest() {
		Week today = Week.WENDESDAY;
		
		System.out.printf("Today is %s(%d)%n", today.name(), today.ordinal());
		
		Week other = Week.valueOf("FRIDAY");
		System.out.printf("Other is %s(%d)%n", other.name(), other.ordinal());
		
		System.out.println(other.compareTo(today));
		
		Week[] days = Week.values();
		
		for(int i=0; i<days.length; i++) {
			System.out.printf("%s(%d)%n", days[i].name(), days[i].ordinal());
		}
	}
	
	private static void enumTest2() {
		Week today = Week.WENDESDAY;
		String message = "";
		
		switch(today) {
		case SUNDAY:
			message = "Sunday";
			break;
		case MONDAY:
		case TUESDAY:
		case WENDESDAY:
		case THURSDAY:
			message = "Studying hard";
		case FRIDAY:
			message = "Hot Friday";
			break;
		case SATURDAY:
			message = "Weekend";
			break;
		default:
		}
		
		System.out.printf("%s is %s%n", today.name(), message);
	}
}
