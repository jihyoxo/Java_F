package Java_20191119;

public class SsnDemo {
	public static void main(String[] args){
		int a1 = 1;
		int a2 = 1;
		int a3 = 1;
		int a4 = 1;
		int a5 = 1;
		int a6 = 1;
		
		int b1 = 1;
		int b2 = 1;
		int b3 = 1;
		int b4 = 1;
		int b5 = 1;
		int b6 = 1;
		int b7 = 8;
		
		//1. 각 자리수를 2부터 9까지 곱하고 다시 2-5까지 곱해서 합을 구함
		//Method 1)
		int sum1 = 0;
		int sum2 = 0;
		int sum = 0;
		for(int i=2; i<=9; i++){
			sum1 += i; //sum = sum + i;
		}
		for(int i=2; i<=5; i++){
			sum2 += i; 
		}
		sum = sum1 + sum2;		
		//Method 2)
/*		int sum = 0;
		sum = (a1*2)+(a2*3)+(a3*4)+(a4*5)+(a5*6)+(a6*7)+(b1*8)+(b2*9)+(b3*2)+(b4*3)+(b5*4)+(b6*5);
*/		
		System.out.println(sum); //58
		
		//2. 총합을 11로 나눈 나머지를 구한다.		
		//3. 11에서 나머지를 뺀다.		
		//4. 3의 결과를 다시 10으로 나눈 나머지를 구한다.
		int result = (11-(sum % 11))%10;
		System.out.println(result);
		
		//5. 4의 결과와 맨 마지막 숫자가 같으면 정상적인 주민번호.
		//	  그렇지 않으면 비 정상적인 주민번호 멘세지를 출력한다.
		
		if(result == b7){
			System.out.println("당신의 주민등록번호는 정상 입니다.");
		}else{
			System.out.println("당신의 주민등록번호는 비정상 입니다.");
		}

//		int[] first = {1,1,1,1,1,1};
//		int[] second = {1,1,1,1,1,1,8};
//		
//		String ssn = "111111-1111118";
		
	}
}
