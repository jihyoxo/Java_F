package java_20191126;

public class SubDemo {
	// 숨겨져 있음.
// public SubDemo(){
// 		super();
// }
//	shift + alt + s => c 하면 자동생성
	public SubDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Sub s1 = new Sub();
		s1.makeMoney();
		s1.gotoSchool();
		s1.play("omok");

		s1.money = 10000;
		s1.chicken = "교촌치민 2마리";

	}

}
