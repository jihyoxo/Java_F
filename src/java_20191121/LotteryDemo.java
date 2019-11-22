package java_20191121;

public class LotteryDemo {
	public static void main(String[] args) {
		//로또 복권을 생성할 배열 6개 선언
		int[] lotto = new int[6];
		//ver1)		
//		for (int i = 0; i < lotto.length; i++) {
//			double random = Math.random();		
//			int temp = (int)(random * 45) + 1;
//			lotto[i] = temp;
//		}
//		for (int i : lotto) {								//모든 배열 출력
//			System.out.print("["+ i + "]" + "\t");
//		}
		//ver2)		
		for (int i = 0; i < lotto.length; i++) {
			//Math.random() => 0 보다 크거나 같고 1보다 작은 임의의 double 값을 변환
			double random = Math.random(); 	
			int temp = (int)(random * 45) + 1;	//1부터 45까지 임의 값을 temp에 저장
			boolean isExisted = false;	//중복 체크를 위한 변수
			for (int j = 0; j < i; j++) {		// i 인덱스 이전까지 배열의 값을 체크
				if(lotto[j] == temp) {		//temp 변수와 j 인덱스에 있는 배열 값이 같을 경우 isExisted를 true로 변경하고 break.
					isExisted = true;
					//i--;
					break;
				}
			}
			//새로 생성된 temp와 i이전 인덱스에 있는 배열값 중에 같은 값이 있는 경우 i를 증가시키지 않고 현재 위치에 있게 설정하고
			//똑같은 값이 없는 경우에는 i인덱스에 temp변수를 입력.
			if(isExisted){
				i--;
			}else{
				lotto[i] = temp;
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
