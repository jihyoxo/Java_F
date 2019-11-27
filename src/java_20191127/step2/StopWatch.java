package java_20191127.step2;
//1. 실제 비지니스 로직이 있는 클래스와 실행되는 클래스를 분리해 보자
public class StopWatch {
	//밀리워치
	long startTime;
	long endTime;
	public void start() {		
		startTime = System.currentTimeMillis();
	}
	public void stop() {		
		endTime = System.currentTimeMillis();
	}
	public double getElaspedTime() {
		return (double) (endTime - startTime) / (double) 1000;
	}
	//나노워치
	long startNanoTime;
	long endNanoTime;
	public void startNano() {		
		startNanoTime = System.nanoTime();
	}
	public void stopNano() {		
		endNanoTime = System.nanoTime();
	}
	public double getElaspedNanoTime() {
		return (double) (endNanoTime - startNanoTime) / (double) 1000000000;
	}

}
