package Java_20191119;

public class OperatorDemo {
	public static void main(String[] args){
		int a = 7, b = 20; //붙여도 되고 따로해도 됨
		int c = 0;
		double d = 0;
		c = a + b;
		System.out.println(c);	//27
		
		c = a - b;
		System.out.println(c);	//-13
		
		c = a * b;
		System.out.println(c);	//140
		
		d = b / a;
		System.out.println(d);	//2.0
		d = (double)b / (double)a; // d= (double)b/a 해도 자동 casting이 되기때문에 가능
		System.out.println(d);	//2.8574...
		
		c = b % a;
		System.out.println(c);	//6
		 
		a += b; // a = a+b
		
		int sum = 0;
		for(int i=1; i<=100; i++){
			sum += i; //sum = sum + i;
		}
		System.out.println(sum); //5050
		
		a++;	 // //대입 후 증가 => a=a+1 뜻
		++a;	 // 증가 후 대입
		a = 20;
		c = ++a;
		System.out.println(c); //20
		
		c = a++; 
		System.out.println(c);
		
		a = 10;
		b = 20;
		
		boolean isSuccess = false;
		isSuccess = a>b;
		System.out.println(isSuccess);	//false
		
		isSuccess = a<b;
		System.out.println(isSuccess);	//true
		
		isSuccess = a>=b;
		System.out.println(isSuccess);	//false

		isSuccess = a==b;
		System.out.println(isSuccess);	//false
		
		isSuccess = a!=b;
		System.out.println(isSuccess);	//true
		
		// a && b => a가 false 이면 b연산을 하지 않음 (short circuit)
		// a || b => a가 true 이면 b연산을 하지 않음 (short circuit)
		isSuccess = (a==b) && (++a == ++b);
		System.out.println(isSuccess);	//false
		isSuccess = (a==b) || (++a == ++b);
		System.out.println(isSuccess);	//false
		System.out.println(a);	//10
		System.out.println(b);	//20
		
		//연산자 우선 순위로 인한 결과값
		System.out.println(1+2+3+4+5);		//15
		System.out.println(1+2+3+4+"5");	//(10)+5 =>105
		System.out.println("1"+2+3+4+5);	//1+2+3+4+5 => 12345
		System.out.println("1"+(2+3+4)+5);//1+(9)+5 => 195
		System.out.println(1+2+"3"+4+5);	//(3)+3+4+5 =>3345	
		
	}
}
