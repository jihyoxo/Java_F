package java_20191126;

public class ChildDemo {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.age = 55;
		p1.work();				//Parent work()
		p1.playBadook();		//Parent playBadook()
		
		System.out.println();
		
		Child c1 = new Child(); //Child 안에 Parent있음.
		c1.age = 25;
		c1.height = 155.24;
		c1.playBadook();		//Parent playBadook()
		c1.work();				//Child work()
		c1.playGame();		//Child playGame()
		
		System.out.println();
		
		Parent p2 = new Child(); //Parent가 추상클래스라 객체를 생성할 수 없다.
		p2.age = 25;			
//		p2.height = 155.24;	//호출 안됨
		p2.playBadook();		//Parent playBadook()
		p2.work();				//Parent work() , Child work()
//		p2.playGame();		//호출 안됨
		
//		Child c2 = new Parent(); //불가능
		
	}
}
