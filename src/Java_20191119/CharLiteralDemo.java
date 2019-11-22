package Java_20191119;

public class CharLiteralDemo {
	public static void main(String[] args) {
		//1. 유니코드 표현법 => '\u0000' (네자리);
		char c1 = '\uAE40' ;
		char c2 = '\uC9C0' ;
		char c3 = '\uD6A8' ;
		
		System.out.println(c1);	//김
		System.out.println(c2);	//지	
		System.out.println(c3);	//효
		
		//2. 아스키코드 표현
		// 48 - 57 => 0-9
		// 65 - 90 => A-Z
		// 97 - 122 => a-z
		
		char c4 = 97;
		System.out.println(c4); //a
		
		//3. 문자 표현 => ' '
		char c5 = 'a';
		char c6 = '성';
		System.out.println(c5); //a
		System.out.println(c6); //성
		
		//escape char
		// \n 	=> line feed 
		// \t	=> tab
		// \\ 	=> \
		// \ "	=> "
		// \ ' 	=> '
		
		System.out.println("hello\n"+"world");
		System.out.println("hello\t"+"world");	
		
		String path = "C:\\dev\\\"eclipse\"";
		System.out.println(path);
		
		
	}
}
