package java_20191125;

public class MemberDemo {
	public static void main(String[] args) {
		Member m = new Member(); //ctrl누른상태로 Member에 커서를 가져다 되면 Member 클래스로 이동.
		//m.name = "aa"; 
		//private 되어있기 때문에 못불러냄
		m.setName("성영한");
		m.setAddress1("서울");
		m.setZipcode("12334");
		m.setAddress2("서울대");
		m.setEmail("email@email.com");
		m.setSsn("123456-7891234");
		m.setAge(60);
		m.setPassword("1234");
		m.setHeight(176.2);
		
		System.out.println("이름: " + m.getName());
		System.out.println("우편번호: " + m.getZipcode());
		System.out.println(m.getAddress1());
		System.out.println(m.getAddress2());
		System.out.println(m.getEmail());
		System.out.println(m.getAge());
		System.out.println(m.getHeight());
	}
}
