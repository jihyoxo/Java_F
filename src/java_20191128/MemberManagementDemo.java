package java_20191128;

import java.util.ArrayList;

public class MemberManagementDemo {
	private ArrayList<Member> list;
	
	public MemberManagementDemo() {
		list = new ArrayList<Member>();
	}
	
	private void print() {
		System.out.println("************************************");
		System.out.println("*1) insert 2) update 3) delete 4) search 5) exit*");
		System.out.println("************************************");
	}
		
	public static void main(String[] args) {
		MemberManagementDemo m1 = new MemberManagementDemo();
		m1.print();
	}

}
