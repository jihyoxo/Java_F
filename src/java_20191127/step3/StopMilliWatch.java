package java_20191127.step3;

public class StopMilliWatch {
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
}
