package Hoemwork;

public class Homework2 {
	public static void main(String[] args) {
		//문자 reverse 하기.
		//1. input "abcd"		=> "dcba"
		//2. input "abcde"		=>	"edcba"
		
		String input = "abcd";	//"abcde"
		char[] ch = input.toCharArray();	
// 1)		
//		for (int i = ch.length -1 ; i >= 0 ; i--) {
//			System.out.print(ch[i]);
//		}
//		System.out.println();
// 2)		
		for (int i = 0; i < ch.length/2; i++) {
			char temp = ch[i];
			//System.out.println(temp); //=> a, d
			ch[i] = ch[ch.length-1-i]; 
			//System.out.println(ch[i]); //=> a, b
			ch[ch.length-1-i] = temp;
			//System.out.println(temp); //=> c, b
		}
		//System.out.println(ch.length); // => 4
		
		System.out.println(new String(ch));
		
	
		// 1~100 소수 구하기.

		int set, j, num = 0;
		for (set = 2; set <= 100; set++) {
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
