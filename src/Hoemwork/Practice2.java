package Hoemwork;

public class Practice2 {
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	
	private int getCount(int year, int month, int day){
		//preYear => 2018년도
		int preYear = year - 1;
		//preMonth => 2019년 11월 
		int preMonth = month - 1;
		int totalCount = 0;
		return totalCount;	//
	}
	
	public static void main(String[] args) {
		System.out.println("일 \t 월 \t 화 \t 수 \t 목 \t 금 \t 토");
		
		String space = "";
		for (int i = 1; i < 1 ; i++) {
			space += "\t";
			System.out.print(space);
		}
		
		for (int i = 1; i <= 31	; i++) {
			System.out.print(i+" \t ");
			if (i%7 == 0){
				System.out.println();
			}
		}
	}
}
