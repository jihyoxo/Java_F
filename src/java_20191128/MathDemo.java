package java_20191128;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.1);	//소수점 올림
		System.out.println("ceil: "+d1);			// 5.0	
		
		d1 = Math.floor(4.9);			//소수점 내림
		System.out.println("floor: "+d1); 		// 4.0
		
		long l1 = Math.round(42.789);
		System.out.println(l1);			// 43
		
		double l2 = Math.round(42.789*100);
		System.out.println(l2);			// 4279.0

		double l3 = Math.round(42.789*100);
		System.out.println(l3/100);	// 42.79
		
		
		d1 = Math.abs(-4.3);						//절대값으로 리턴
		System.out.println("abs: "+d1);			// 4.3
		
		d1 = Math.sqrt(4);							//제곱근
		System.out.println("sqrt: "+d1);			// 2.0
		
		d1 = Math.pow(2, 3);						// x의 y 제곱 ex. 2^3=8
		System.out.println("pow: "+d1);			// 8.0
		
		d1 = Math.random();						//0~1 사이의 임의값
		System.out.println("random: "+d1);			// 0.9506343784670137
			
	}
}
