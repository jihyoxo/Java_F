package java_20191127.step1;
/* 1. 요구사항 : 밀리 세컨드로 시간을 측정할 수 있는 애플리케이션을 만들어주세요.
 */
public class FootNanoStopWatch {
	// 여기부터
	long startTime;
	long endTime;

	long startNanoTime;
	long endNanoTime;

	public double getElaspedTime() {
		return (double) (endTime - startTime) / (double) 1000;
	}

	public double getElaspedNanoTime() {
		return (double) (endNanoTime - startNanoTime) / (double) 1000000000;
	}
	// 여기까지 클래스로 빼기

	public static void main(String[] args) {
		FootNanoStopWatch f = new FootNanoStopWatch();
		f.startNanoTime = System.nanoTime();

		for (long i = 0; i < 50000000l; i++) {

		}

		f.endNanoTime = System.nanoTime();

		double elaspsedTime = f.getElaspedNanoTime();

		System.out.printf("경과시간 : %.9f", elaspsedTime);
	}
}
