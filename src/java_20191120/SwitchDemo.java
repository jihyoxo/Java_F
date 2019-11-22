package java_20191120;

public class SwitchDemo {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]); //Run Configurations에 들어가서 Arguments에 값을 집어넣으면 나옴
		
		String season = null;
//		if(month==12 || month ==1 || month==2){
//			season = "겨울";
//		}else if(month==3 || month==4 || month==5){
//			season = "봄";
//		}else if(month==6 || month==7 || month==8){
//			season = "여름";
//		}else if(month==9 || month==10 || month==11){
//			season = "가을";
//		}else{
//			season = "없는 계절";
//		}
//		System.out.println(month + "월은 " + season + "입니다.");
		
		switch (month) {
			case 12 : 
			case 1:
			case 2: season = "겨울"; break;
			case 3: 
			case 4:
			case 5: season = "봄"; break;
			case 6:
			case 7:
			case 8: season = "여름"; break;
			case 9: 
			case 10: 
			case 11: season = "가을"; break;
			default : season = "없는 계절";
		}
		
		System.out.println(month + "월은 " + season + "입니다.");

		
	}
}
