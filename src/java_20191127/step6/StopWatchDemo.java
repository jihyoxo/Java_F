package java_20191127.step6;
//1. 모든 클래스의 Encapsulation
//2. 메인 클래스의 Java Reflection 추가
public class StopWatchDemo {
	public void execute(StopWatch s) {
		s.run();
	}

	 
	public static void main(String[] args) {
		StopWatchDemo swd = new StopWatchDemo();
		
		StopNanoWatch s = new StopNanoWatch();
		swd.execute(new StopNanoWatch());	 //s넣어도 상관없음.
			System.out.println();
		StopMicroWatch s2 = new StopMicroWatch();
		swd.execute(new StopMicroWatch());
			System.out.println();
		StopMilliWatch s1 = new StopMilliWatch();
		swd.execute(new StopMilliWatch());
		
	}
}
