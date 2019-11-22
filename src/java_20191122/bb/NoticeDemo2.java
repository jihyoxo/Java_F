package java_20191122.bb;

import java_20191122.aa.Notice;	//import하기 위해서는 class가 public이여야함.


public class NoticeDemo2 extends Notice{
	public static void main(String[] args) {
		 //서로 다른 package에서 같은 class를 쓰기 위해서는 import해야한다.
		Notice n = new Notice();
		n.number = 10;
		//n.title = "title";
		//n.hit = 100;
		//n.regdate = "2019-11-22";
		//서로 다른 package에서는 public만 import가능.
		
		NoticeDemo2 nc = new NoticeDemo2();
		nc.number = 10;
		nc.title = "title";
		
		
	}
}
