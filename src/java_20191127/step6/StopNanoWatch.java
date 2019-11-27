package java_20191127.step6;

public class StopNanoWatch extends StopWatch{
	private void start() {		
		setStartTime(System.currentTimeMillis());
	}
	private void stop() {		
		setEndTime(System.currentTimeMillis());
	}
	private double getElaspedTime() {
		return (double) (getEndTime() - getStartTime()) / (double) 1000000000;
	}
	
	public void run() {
		start();
		for (long i = 0; i < 50000000l; i++) {

		}
		stop();

		double elaspsedTime = getElaspedTime();

		System.out.printf("경과시간 (나노) : %.9f", elaspsedTime);
	}
}
