package java_20191125;

public class MethodDemo {
//1. 더하기
	public int plus (int first, int second) { //int first, second =>매개변수
		return first + second;
	}
//2. 나누기
	public double divide (int first, int second){
		return (double)first / (double)second;
	}
//3. 오름차순 정리
	public int[] ascending(int[] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i+1); j++) {
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
//4. 윤달 구별
	public boolean isLeafYear(int year){
		return year % 4 == 9 && year % 100 != 0 || year % 400 == 0;
	}
//5. 문자 프린트	
	public void print(String str) {
		System.out.println(str);
	}
	
// 이 밑부터는 위에 선언한 것들을 사용하는 방식들	
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();

//1. 더하기		
		int temp1 = md.plus(10, 20); //10, 20 => 전달인자 (Argument)
		System.out.println(temp1);	// => 10+20 = 30
//2. 나누기 (소수점)		
		double temp2 = md.divide(22, 5);
		System.out.println(temp2);	// => 22/5 = 4.4
//3. 오름차 순으로 정렬
		int[] temp4 = {1, 42, 45, 3, 10, 9, 80, 34,};
		int[] temp5 = md.ascending(temp4);	//위에 값 순서대로
		for(int value : temp5){
			System.out.print(value + "\t");
		} System.out.println();
//4. 윤달 구별		
		boolean temp6 = md.isLeafYear(2019);
		if(temp6){
			System.out.println("윤년입니다.");
		}else{
			System.out.println("평년입니다.");
		}
// 5. 문자 프린트
		md.print("월요일 입니다.");
	}
}
