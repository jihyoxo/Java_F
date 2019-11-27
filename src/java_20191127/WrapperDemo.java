package java_20191127;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		/*자바 1.4 이전 버전에서는 primitive data type을 Collection에 
		 * 저장 할 수 없어서 primitive data type을 객체화 할 수 있는 
		 * Wrapper class로 반환하여 저장해야 한다.
		*/
		ArrayList list = new ArrayList();
		//list.add(1); 		//list.add(new Integer(1)); 라고 써야했음.
		//list.add(2;		//list.add(new Integer(2));
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		
		Integer i1 = (Integer)list.get(0);
		Integer i2 = (Integer)list.get(0);
		
		int a = i1.intValue() + i2.intValue();
		System.out.println(a);		//2
		
		//java 1.5 or java 5.0 이후
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);	//auto-boxing
		list1.add(2);	//auto-boxting
		
		Integer i3 = (Integer)list.get(0);
		Integer i4 = (Integer)list.get(0);
		
		
		int b = i3 + i4;	//auto-umboxing
		System.out.println(b);		//2
		
//		String str = 10; //10을 넣으면 에러람
		String str = String.valueOf(10);
		String str2 = ""+10; 
		System.out.println(str);	//10
		
		//문자열을 in로 바꿀때 사용
		int d = Integer.parseInt("100");		
		System.out.println(d);		//100
	}
}
