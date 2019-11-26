package java_20191126;

public class CallByRefDemo {
	public static void change(int i, int[] j) { //int i = a, int[] j = b
		i = 20;
		j[3] = 400;
	}
	public static void main(String[] args) {
		int a = 10;
		int [] b = {1, 2, 3, 4};

		System.out.println(a);			//10
		System.out.println(b[3]);		//4
		
		CallByRefDemo.change(a, b); // a=> call by value, b=> call by reference
		
		System.out.println(a);			//10	//call by value 메서드 호출 후 변화 없음
		System.out.println(b[3]);		//400	//call by reference  메서드 호출 후 변화 있음
	
		int[] c;
		c = new int[4];
		
		int[] d = null;
		System.out.println(d); //null
		d = new int[4];
		
		int age;
		age = 10;
	}
	
}

