package java_20191127.step5;

public class StopMilliWatch extends StopWatch{
	public void start() {		
		startTime = System.currentTimeMillis();
	}
	public void stop() {		
		endTime = System.currentTimeMillis();
	}
	public double getElaspedTime() {
		return (double) (endTime - startTime) / (double) 1000;
	}
	
	//Demo에 있던 메소드를 넣기
	public void run(){
		start();
		for (long i = 0; i < 50000000l; i++) {

		}
		stop();

		double elaspsedTime = getElaspedTime();

		System.out.printf("경과시간 (밀리) : %.3f", elaspsedTime);
	}
	
}
