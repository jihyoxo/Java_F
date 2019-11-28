package java_20191128;

import javax.print.DocFlavor.STRING;

public class StringDemo {
	public static void main(String[] args) {
		String str = "abcdefg";
		for (int i = 0; i < str.length(); i++) {		//문자는 length()
			System.out.print(str.charAt(i));		//a b ... e g
		}
		
		str = str.concat("abcd");			//str + abcd
		System.out.println("\n" + str); 	//abcsfegabcd
		
		String fileName = "abc.zip";
		if(fileName.endsWith("zip")) {
			System.out.println("zip 파일입니다.");
		}else if (fileName.endsWith("ppt")) {
			System.out.println("ppt 파일입니다.");
		}
		
		String uri = "artist/index.jsp";
		if (uri.startsWith("artist")) {
				System.out.println("작가 페이지입니다.");
		}else if (uri.startsWith("exhbition")) {
			System.out.println("전시 페이지입니다.");
		}

//equalsIgnoreCase (대소문자 무시)		
		System.out.println("abc".equalsIgnoreCase("aBC")); 	//대소문자를 구분하지 않고 비교한다.

//indexOf (특정 문자 앞/뒤 글자 수 출력)		
		String s1 = "a";
		String s2 = "성";
		System.out.println(s1.getBytes().length);		//
		System.out.println(s2.getBytes().length);		//
		str = "941129-2000000";
		System.out.println(str.indexOf("-"));	// - 앞 글자 수 = 6
		fileName = "abc.bde.fafb.asdf.ppt";
		System.out.println(fileName.lastIndexOf(".")); 	// 17 (끝의.부터 앞까지의 글자수)
		System.out.println(fileName.indexOf("."));			// 3	(앞의 점부터 앞까지의 글자수)

//substring (특정 수 글자만 출력)		
		String first = str.substring(0, 6);	//0부터 6전까지의 글자 <
		System.out.println(first);			//941129
		String second = str.substring(7);//앞에서 7개 수를 제외한 뒤에 수?
		System.out.println(second);		//2000000

//replace 		
		String content = "abc\nabc\nabc\nabc";
		System.out.println(content);
		content = content.replaceAll("\n", "<br>");
		System.out.println(content);
		
//trim (앞뒤 공백 지우기)		
		s1 = "abc";
		s2 = "abc ";
		System.out.println(s1.equals(s2));					 //false
		System.out.println(s1==s2);							//false
		System.out.println(s1.equalsIgnoreCase(s2)); 	//false
		System.out.println(s1.length());		//3 
		System.out.println(s2.length());		//4 => 글자수가 다름
		System.out.println(s1.trim().equals(s2.trim()));	//true => trim은 앞뒤의 공백을 제거해줌

//primitive data type => String		
		s1 = String.valueOf(100);	// = 1+ "";
		System.out.println(s1); 	//100

//split (그룹으로 쪼개기)		
		String phone = "010-1234-5678";
		String[] temp = phone.split("-");	// - 빼고 쪼개기
		System.out.println(temp[0]);	//010
		for (String string : temp) {
			System.out.print(string + "\t"); //010	1234	5678
		}	System.out.println();
		
//format		
		str = String.format("%,d %,d %,d", 1000, 2000, 3000);	// 천단위로 , 표시
		System.out.println(str);	//10,000 20,000 30,000
		str = String.format("%3$d %2$d %1$d", 10, 20, 30);	//n$ 는 n순서로 바꾸어줌
		System.out.println(str);	//30 20 10
		str = String.format("%10d %10d %10d", 10, 20, 30);	// n 수만큼 공백 =자릿수
		System.out.println(str);	//        10         20         30
		
	}
}
