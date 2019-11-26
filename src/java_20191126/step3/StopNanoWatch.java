package java_20191126.step3;

public class StopNanoWatch {
	private long startTime;
	private long endTime;

	public void start() {
		startTime = System.nanoTime();
	}

	public void stopNano() {
		endTime = System.nanoTime();
	}
	
	public double getElapseTime() {
		return (double)(endTime-startTime) / (double)100000000;
	}
	
}
