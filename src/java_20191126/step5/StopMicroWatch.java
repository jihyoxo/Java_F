package java_20191126.step5;

public class StopMicroWatch extends StopWatch {

	private void start() {
		startTime = System.nanoTime();
	}

	private void stop() {
		endTime = System.nanoTime();
	}

	private double getElapseTime() {
		return (double) (endTime - startTime) / (double) 100000000;
	}

	public void run() {
		start();
		for (long i = 0; i < 5000000000l; i++) {
		}
		stop();
		double elapsedTime = getElapseTime();
		System.out.printf("경과시간(마이) : %.6f", elapsedTime);
	}
}
