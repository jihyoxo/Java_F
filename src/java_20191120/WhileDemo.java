package java_20191120;

public class WhileDemo {
	public static void main(String[] args) {
//1)	1~100까지 합	
		int sum = 0;
		int i = 1;				//while 초기값은 항상 밖에
		while(i <= 100){		//초기값있고 증가값있을 땐 FOR 사용.
			sum += i;
			i++;					//증가값은 여기에
		}
		System.out.printf("1부터 100까지 합은 %d입니다. %n", sum);
//2) 	구구단
		int first = 2 ;
		while(first <= 9){
			int second = 1;
			while(second <= 9){
				System.out.printf("%d * %d = %d %n", first, second, first*second);		
				second++;
			}
			first++;
		}
//3)			
		
		
	}
}
