package Java_20191119;

public class LiteralDemo {
	public static void main(String[] args){
		//byte 범위를 넘어가면 overflow발생 => compile error
		//ex) byte b1 = 128;
		
		int a1 = 128; 			//10진수 표기법
		int a2 = 076;			//8진수 표기법
		int a3 = 0x123;		//16진수 표기법
		int a4 = 0b10101;	//2진수 표기법
		
		System.out.println(a1); //128
		System.out.println(a2); //62
		System.out.println(a3); //291
		System.out.println(a4); //21
	
		//long 리터럴은 숫자뒤에 l 또는 L로 표기
		long l1 = 2200000l;
		//float 리터럴은 소수점 뒤에 f 또는 F로 표기
		float f1 = 123.43f;
		//double 리터럴은 소수점 뒤에 d 또는 D, 또는 생략도 가능.
		double d1 = 1234.56;
		//boolean 리터럴은 true 또는 false
		boolean isExisted = false;
		
		System.out.println(l1); //2200000
		System.out.println(f1); //123.43
		System.out.println(d1); //1234.56
		System.out.println(isExisted); //false
		
		a1 = 10;
		d1 = 10.0;
		//prmitive data type의 == 연산자는 값만 비교함
		System.out.println(a1==d1); //true
		
		int first = 10;
		int second = first;
		first = 20;
		System.out.println(first);		//20
		System.out.println(second);	//10
		
		
	}
}
