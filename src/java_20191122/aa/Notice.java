package java_20191122.aa;

public class Notice {
	public int number;
	protected String title;
	int hit;
	private String regdate;				//private은 이 class에서만 접근 가능.
	public static void main(String[] args){
		Notice n = new Notice();
		n.number = 10;
		n.title = "title";
		n.hit = 100;
		n.regdate = "2019-11-22";
		
	}
}
