package Hoemwork;

public class Homework2 {
	public static void main(String[] args) {
		//문자 reverse 하기.
		//1. input "abcd"		=> 	"dcba"
		//2. input "abcde"		=>	"edcba"
		
		String input = "abcd";	//"abcde"
		char[] ch = input.toCharArray();	
		
		for (int i = ch.length -1 ; i >= 0 ; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
	
		// 1~100 소수 구하기.

		int set, j, num = 0;
		for (set = 1; set <= 100; set++) {
			num = 0;
			for (j = 2; j < set; j++) {
				if (set % j == 0) {
					num++;
					break;
				}
			}     
			if (num == 0) {
				System.out.print(set + " ");
			}
		}

	}
}
