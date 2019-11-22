package java_20191121;

public class LotteryDemo2 {
	public static void main(String[] args) {
		//로또 복권을 생성할 배열 6개 선언
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			//Math.random() => 0 보다 크거나 같고 1보다 작은 임의의 double 값을 변환
			double random = Math.random();		//random은 항성 double사용 	
			int temp = (int)(random * 45) + 1;		//1부터 45까지 임의 값을 temp에 저장
			lotto[i] = temp;								//temp 값을 현재 위치에 무조건 집어 넣는다. 
			for (int j = 0; j < i; j++) {					// i 인덱스 이전까지 배열의 값을 체크
				if(lotto[j] == temp) {				
					i--;										//i를 증가시키지 않고 현재 위치에 있도록 설정
					break;									//break를 추가하여 더이상 연산을 안하도록 처리
				}	
			}

		}
		// 밑에 공식은 위에 수를 순서대로 - bubble sort
		for (int i = 0; i < lotto.length-1; i++) {
			for (int j = 0; j < lotto.length - (i + 1); j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}
		}
		//전체 출력
		for (int i : lotto) {								
		System.out.print("["+ i + "]" + "\t");
		}
	}
}
