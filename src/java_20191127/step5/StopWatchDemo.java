package java_20191127.step5;
// 1. 실제 비지니스 로직을  해당 클래스에 추가하자
// 2. 
public class StopWatchDemo {
	public void execute(StopWatch s) {
		s.run();
	}

	 
	public static void main(String[] args) {
		StopWatchDemo swd = new StopWatchDemo();
		
		StopNanoWatch s = new StopNanoWatch();
		swd.execute(s);	
			System.out.println();
		StopMicroWatch s2 = new StopMicroWatch();
		swd.execute(s2);
			System.out.println();
		StopMilliWatch s1 = new StopMilliWatch();
		swd.execute(s1);
		
	}
}
