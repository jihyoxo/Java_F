package java_20191126.abs;

public class ShapeDemo {
	public static void run(Shape a) {
		a.draw();
	}
	
	public static void main(String[] args) {
		//추상 클래스는 객체를 생성할 수 없다.
//		Shape s = new Shape(); 	//불가능
		Shape s =  new Rectangle();
		s.draw();	//Rectangle - draw()
		
		Shape s2 = new Triangle();
		s2.draw();	//Triangle - draw()
		
		System.out.println();
		
		run(new Rectangle());	//Rectangle - draw()
		run(new Triangle());		//Triangle - draw()
		
		
	}
}
