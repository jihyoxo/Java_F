package java_20191125;

public class OverLoadingDemo {
	/*OverLoading의 작성규칙
	1. 같은 클래스 내
	2. 메서드 이름은 같아야 한다.
	3. 매개변수 갯수가 같으면 자료형이 달라야 한다.
	4. 매개변수 갯수가 달라야 한다.
	5. 반환형과 접근 한정자는 같아도 되고 달라도 된다.
	*/
	
	public void print(String str){
		System.out.println(str);
	}
	public void print(int i) {
		System.out.println(i);
	}
	private void print(double d) {
		System.out.println(d);
	}
	public void print(boolean b) {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		OverLoadingDemo o = new OverLoadingDemo();
		o.print(true);		//boolean
		o.print("test");		//string
		o.print(23+34);	//int
		o.print(43.456);	//double
		
	}
}
