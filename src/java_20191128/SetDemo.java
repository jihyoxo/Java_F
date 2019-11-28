package java_20191128;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//HashSet은 데이터(객체)의 중복을 허용하지 않고, 순서가 없다.
//		HashSet set = new HashSet();
		TreeSet<Integer> set = new TreeSet<Integer>();
		while (true) {
			int random = (int)(Math.random()*45) + 1;
			set.add(random);
			if(set.size()==6) break;
		}
		 
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()){		//hasNext() : HashSet에 출력할 객체가 존재하는지 판단하는 메서드
//			int temp = (Integer)i.next();	//next() 해당 객체를 가져온다.
			int temp = i.next();	
			System.out.print(temp + "\t");
		}System.out.println();
		
		HashSet<Test> s = new HashSet<Test>();
		s.add(new Test(10));
		s.add(new Test(20));
		s.add(new Test(10));	//위와 다른 객체로 인식
		System.out.println(s.size()); //3 (밑에 HashCode 작성시 10이 같은 객체로 인식되어 2 출력
	}
}

class Test{
	int a ;
	Test(int a){
		this.a = a;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (a != other.a)
			return false;
		return true;
	}
	
}