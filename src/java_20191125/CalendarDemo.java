package java_20191125;

public class CalendarDemo {
	private int year;
	private int month;
	private int day;
	private int totalCount;
	int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public void set(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public int getTotalCount() { // void가 아니면 return 필요
		// preYear => 2018년도
		int preYear = year - 1;
		// preMonth => 2019년 11월
		int preMonth = month - 1;
		//int totalCount = 0; 위에서 totalCount를 선언했기때문에 선언x

		// 2018년도까지 총일 수 구하기
		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);
		boolean isLeafYear = year % 4 == 9 && year % 100 != 0 || year % 400 == 0;
		if (isLeafYear) {
			monthArray[1] = 29;
		}
		// 2019년도 11월까지 함 구하기
		for (int i = 0; i < preMonth; i++) {
			totalCount += monthArray[i];
		}
		// 2019년 11월까지 합을 구했으면 날짜를 더하여 총 일수를 구한다
		totalCount += day;

		return totalCount;
	}

	public void print() {
		String message = null;
		int dayOfWeek = totalCount % 7;
		if (dayOfWeek == 1) {
			message = "월요일";
		} else if (dayOfWeek == 2) {
			message = "화요일";
		} else if (dayOfWeek == 3) {
			message = "수요일";
		} else if (dayOfWeek == 4) {
			message = "목요일";
		} else if (dayOfWeek == 5) {
			message = "금요일";
		} else if (dayOfWeek == 6) {
			message = "토요일";
		} else if (dayOfWeek == 0) {
			message = "일요일";
		}
		System.out.printf("%d년 %d월 %d일 %s 입니다.", year, month, day, message);
	}

	public static void main(String[] args) {
		CalendarDemo c = new CalendarDemo();
		c.set(2019, 12, 25);
		c.getTotalCount();
		c.print();
	}

}
