package java_20191120;

public class ForDemo {
	public static void main(String[] args) {
//1) 0부처 4까지의 
		int sum = 0;
		for(int i=0; i < 5; i++){
			//System.out.println(i);		// 0,1,2,3,4
			sum += i;  //sum = sum+i	//0+1+2+3+4=> 10
		}		
		System.out.println(sum);
//2)	 0부터 4까지의 숫자를 프린트
		int ii = 0;
		for  ( ; ii<5 ; ){				// (초기값)int i=0랑 i++를 밖으로 빼도 되지만 비추천
			//System.out.println(ii);
			ii++;
		}
//3)	 0부터 4까지의 숫자를 프린트
		int iii= 0;
		while  ( iii < 5 ){				// 초기값을 뺄거면 while문 사용
			//System.out.println(iii);
			iii++;
		}		
//4)		
		String str = "hello";
		int a1 = 10;
		int a2 = 20;
		double d1 = 12.4567;
		System.out.printf("%s , %d , %d , %.4f %n", str, a1, a2, d1);		//문자열은 %s, 정수형은 %d, 실수형은 %f
		//%10s <이렇게 쓰면 10칸씩 쓰는것, %.2f <이렇게 쓰면 소수점 2개까지 쓰는 것
		System.out.println(str + " , " + a1 + " , " + a2 + " , " + d1);				
//5)	1~100 합
		int sum2 = 0;
		for (int j = 1; j <= 100; j++) {
			sum2 = sum2 + j;
		}
		System.out.printf("1부터 100까지 합은 %d 입니다. %n", sum2);
		
//6) 1~100 짝수 합
		int sum3 = 0;
		for (int jj = 1 ; jj <= 100 ; jj++){
			if (jj % 2 == 0){
				sum3 += jj;
			}
		}
		System.out.printf("1부터 100까지 짝수 합은 %d 입니다. %n", sum3);
////7) 구구단 
//		for (int f = 2; f <= 9; f++) {
//			for (int s = 1; s <= 9; s++) {
//				System.out.printf("%d * %d = %d %n", f, s, f*s);		
//			}
//		}
////8) 구구단 거꾸로
//		for (int f = 9; f >= 2; f--) {
//			for (int s = 9; s >= 1; s--) {
//				System.out.printf("%d * %d = %d %n", f, s, f*s);		
//			}
//		}
//9) 별 5~1
		for (int sn2 = 5; sn2 > 0 ; sn2--) {
			for (int st2 = 0; st2 <= sn2-1 ; st2++) {
				System.out.print("*");
			}
			System.out.println();
		}
//10)	별 1~5
		for (int sn = 0; sn < 5 ; sn++) {
			for (int st = 0; st <= sn ; st++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//+) 보너스: 시간 계산		
		int sum4 = 0;
		long start = System.currentTimeMillis();
		for (int t = 1 ; t  <= 2000_000_001; t++){
			sum4 = sum4 + t;
		}
		long end = System.currentTimeMillis();
		System.out.println("경과 시간 : " + (end-start));
	}
}
