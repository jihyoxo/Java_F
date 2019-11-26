package java_20191126;
import java.*;
public class Super extends Object { //보이진 않지만 extends Object가 항상 기본적으로 붙어있음
	int money;
	public Super(){
		// super(); 가 숨겨져 있음
	}
	public Super(int money) {
		// super(); 가 숨겨져 있음
		this.money = money;
	}
	public void makeMoney() {
		System.out.println("Super makeMoney()");
	}

	public void play(String omok) {
		System.out.println("Super play()");
	}
}
