package java_20191126;

//i18n => internationalization => 국제화
//l10n	 => localization => 지역화

public class StaticInitializationDemo { 			//선언
	int age;						//instance variable	instance에서 초기화
	static String title;		//static variable		static에서 초기화
	static {
		System.out.println("static block");
		title = "모기지론";
	}
	//생성자의 접근 한정자는 객체 생성과 관련있다
	private StaticInitializationDemo(int age){		//객체생선
		this.age = age;
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		new StaticInitializationDemo(10);
		new StaticInitializationDemo(20);
		new StaticInitializationDemo(30);
	}	
}
