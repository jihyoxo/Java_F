package java_20191120;

public class ContinueDemo {
	public static void main(String[] args) {
//1)		
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			if(i == 6) continue; // 6ㅃㅐ고 10까지 더하기
			sum += i;			
		}
		System.out.println(sum);
		
//		if(true) return;
//		 
////2)		
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 3; j++) {
//				if(i % 2 == 0) continue;			// 2의 배수 제외하고 continue
//				System.out.printf("%d * %d = %d %n", i, j, i*j);
//			}
//		}
//3)
		outter :
			for (int i = 2; i <= 5; i++) {
				for (int j = 1; j <= 5; j++) {
					if(i == 3) continue outter;	//3빼고 진행
					System.out.printf("%d * %d = %d %n", i, j, i*j);
				}
				
			}
		
		
	}
}
