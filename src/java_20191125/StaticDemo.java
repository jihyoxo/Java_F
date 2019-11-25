package java_20191125;

public class StaticDemo {
	static String name;
	int age;
	
	public void m1() { 		
		name = "sung";		//인스턴스 메서드에서는 static 변수 사용가능
		age = 10;				//인스턴스 메서드에서는 변수 사용가능
		m2();						//호출도 가능
		m4();						//static메서드 호출도 가능
	}
	public void m2() {
		System.out.println("instance method m2()");
	}
	public static void m3() {	//
		name = "sung";			//static메서드에서 static변수 사용가능
		//age = 10;					//인스턴스 변수는 사용 불가
		//m2();							//인스턴스 메서드 호출도 불가
		m4();							//static 메서드는 호출 가능
		StaticDemo sd = new StaticDemo(); //객체 생성해서 인스턴스 사용가능
		sd.age = 10;
		sd.m2();
	}
	public static void m4() {
		System.out.println("instance method m4()");		
	}
}
