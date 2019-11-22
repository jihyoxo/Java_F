package Java_20191119;

public class CastingDemo {
	public static void main(String[] args){
		//overflow 발색하여 complie error 발생
		//ex) byte b1 = 130;
		byte b1 = (byte) 130; //circuit 발생, 비권장 =>-126
		System.out.println(b1);
		
		int i1 = (int) 125.35; //cut 발생 =>125
		System.out.println(i1);
		
		double d1 = 123.5f; //auto casting
		System.out.println(d1);
		
		byte b2 = 10;
		byte b3 = 20;
		// 산술연산자는 반환같이 int 이기 때문에 전체를 byte로 casting 해야 에러가 안 난다.
		//byte b4 = b1 + b2;
		byte b4 = (byte)(b3 + b2);
		System.out.println(b4); //30
		
		int a1 = 10_000_000; //=> 10,000,000

	}
}
