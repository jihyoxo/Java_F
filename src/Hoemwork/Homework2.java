package Hoemwork;

public class Homework2 {
	public static void main(String[] args) {
		//문자 reverse 하기.
		//1. input "abcd"		=> 	"dcba"
		//2. input "abcde"		=>		"edcba"
		
		String input = "abcd";	//"abcde"
		char[] ch = input.toCharArray();	
		
		for (int i = ch.length -1 ; i >= 0 ; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
	
		
		//1~100까지 소수를 구하기.
 
		int num = 100;
		int rmd = 0;
		int n = 0 ;
		for (n = 1; n <= num; n++) {
			if(num % n == 0){
				System.out.println(num);
			}
		}
		
	}
}
