package java_20191121;

public class CopyArrayDemo {
	public static void main(String[] args) {
		
		String[] fruits = {"apple", "banana", "watermelon", "peach"};
		
		String[] temp = new String[6];
		// fruits => 원본배열
		// 0 => 원본매열의 위치, 즉 원본배열의 복사할 시작위치
		// temp => 복사할 배열
		// 2 => 복사할 배열의 시작위치
		// 4 => 원본배열의 4개 요소를 복사
		System.arraycopy(fruits, 0, temp, 2, 4);
		temp[0] = "blueberry";
		temp[1] = "rasberry";
		for (String fruit : temp) {
			System.out.print(fruit + "\t");		//blue, ras, apple, ban, water, peach => temp 2번째위이부터 fruit 배열4개 복사
		}
		System.out.println();
		
		System.out.println(fruits[3]);		//peach
		System.out.println(temp[3]);		//banana
		
		String[] ref = fruits;
		ref[3] = "jobs" ;
		
		System.out.println(fruits[3]);		//jobs
		System.out.println(temp[3]);		//banana
		System.out.println(ref[3]);		//jobs
		
		int[] a = new int[] {1,2,3,4,5,6,7};
		int[] b = new int[4];
		System.arraycopy(a, 2, b, 1, 2);
		System.out.println(a[0]); 				// 1, 2, 3, 4, 5, 6, 7
		System.out.println(b[0]); 				// 0, 3, 4, 0
		
		
// == (참조) 보너스
		int[] c = {1, 2, 3, 4};
		int[] d = {1, 2, 3, 4};
		int[] e = d;
		
		System.out.println(c==d);		//false
		System.out.println(d==e);		//true
		System.out.println(c==e);		//false
		// == 는 같은 값이 아니라 같은 참조를 하는 냐를 나타냄
	}
}
