package java_20191120;

public class BreakDemo {
	public static void main(String[] args) {

//1)	
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
			if (i==5) break; //i가 5가 되면 멈추고 뻐져나온다.
		}
		System.out.println(sum);
//2)
//		outter :
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				if(i == 3 && j == 6) break outter;
//				System.out.printf("%d * %d = %d %n", i, j, i*j);
//			}			
//		}
		
		outter :
			for (int i = 2; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					if(i == 3) break;				//i가 3되면 3만 중단
					if(j == 6) break outter;		// j가 6되면 전체 중단
					System.out.printf("%d * %d = %d %n", i, j, i*j);
				}			
			}
	}
}
