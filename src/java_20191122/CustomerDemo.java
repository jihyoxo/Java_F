package java_20191122;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name = "성영한";
		c1.email = "syh@hbilab.org";
		System.out.println(c1.name + ", " + c1.email);		//성영한, syh@hbilab.org
		
		Customer c2 = new Customer();
		c2. name = "손정의";
		c2. email = "masayosi@yahoo.jp";
		System.out.println(c2.name + ", " + c2.email);		//손정의, masayosi@yahoo.jp
		
		Customer c3 = new Customer();
		c3. name = "배조스";
		c3. email = "ceo@amazon.com";
		System.out.println(c3.name + ", " + c3.email);		//배조스, ceo@amazon.com

		
		//static 변수는 reference variable로 접근 가능하나 일반적으로 클래스 이름으로 접근한다.
		 System.out.println(c3.interestRate);	//0.0
//		c1.interestRate = 10.2;
//		System.out.println(c3.interestRate);	//이 방식말고 밑에 방식으로 하기.
		
		Customer.interestRate = 12.2;
		System.out.println(Customer.interestRate);
		
//		Customer.BANKNAME = "국민은행";		//final 변수는 수정 불가.
		
		Customer c4 = c3;
		c4.name = "잡스";
		System.out.println(c3.name + ", " + c3.email);		//잡스, ceo@amazon.com
		
		Customer c5 = new Customer();
		c5.name = "손정의";
		c5.email = "masayosi@yahoo.jp";
		
		System.out.println(c2 == c5);	//false
		System.out.println(c3 == c4);	//true
		// == 는 값이 같은지를 보는게 아니라 같은 것을 참조하는지를 확인 하는 것.
		
		
	}
}
