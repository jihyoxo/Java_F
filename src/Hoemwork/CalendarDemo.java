package Hoemwork;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		달력 만들기
		1. 1년 1월 1일은 월요일
		2. 1년 365일, 윤년은 366일 - 2월 29일
		3. 윤년은 4년마다 발생하고 그중에서 100배수는 제외하고 400배수는 포함한다.
		4. 2019년 12월 25일 무슨 요일 일까요?
		 */ 
		
		int year = 2019;
		int month = 12;
		int day = 25;
		String message = null;
		int[]	monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int mdays = 0;
		
		//윤년계산 
		if(year % 4 == 0 && year % 100 != 0 | year % 400 == 0) {
			monthArray[1] = 29;
		}		
		for (int i = 0; i < month -1; i++) {
			mdays += monthArray[i];
		}
		System.out.println(mdays);
		
		int year2 = year-1;
		int leapYear = (year/4)-(year/100)+(year/400);
		System.out.println("윤년인 수 " + leapYear);
//		int totalMonths = year2 - leapYear;
//		System.out.println("윤년이 아닌 수 " +totalMonths);
		int totalDays = (year2*365) + (leapYear) + mdays + day ;
		System.out.println(totalDays);
		
		
		switch(totalDays % 7) {
		case 0 : 
			message = "일요일"; break;
		case 1 : 
			message = "월요일"; break;
		case 2 : 
			message = "화요일"; break;
		case 3 : 
			message = "수요일"; break;
		case 4 : 
			message = "목요일"; break;
		case 5 : 
			message = "금요일"; break;
		case 6 : 
			message = "토요일"; break;
		
		}
		
		
		
		
		System.out.printf("%d년 %d월 %d일 %s 입니다.", year, month, day, message);
		
	
	}
}
