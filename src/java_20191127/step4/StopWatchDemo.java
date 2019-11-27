package java_20191127.step4;
// 1. 실제 비지니스 로직을 메서드로 분리하자.
public class StopWatchDemo {
	public void execute(StopNanoWatch s) {
		s.start();
		for (long i = 0; i < 50000000l; i++) {

		}
		s.stop();

		double elaspsedTime = s.getElaspedTime();

		System.out.printf("경과시간 (나노) : %.9f", elaspsedTime);

	}

	public void execute(StopMilliWatch s) {
		s.start();
		for (long i = 0; i < 50000000l; i++) {

		}
		s.stop();

		double elaspsedTime = s.getElaspedTime();

		System.out.printf("경과시간 (밀리) : %.3f", elaspsedTime);

	}
	
	 
	public static void main(String[] args) {
		StopWatchDemo swd = new StopWatchDemo();
		
		StopNanoWatch s = new StopNanoWatch();
		swd.execute(s);	
			System.out.println();
		StopMilliWatch s1 = new StopMilliWatch();
		swd.execute(s1);
	}
}
