package java_20191126.step1;
/*	1. 요구사항 : 밀리 세컨드로 경과 시간을 만들어 주세요...
	2. 요구사항 : 나노 세컨드로 경과 시간을 만들어 주세요... 제발...
*/
public class FootStopWatch {
	long startTime;
	long endTime;
	public double getElapseMilliTime() {
		return (double)(endTime-startTime) / (double)1000;
	}
	public static void main(String[] args) {
		FootStopWatch f = new FootStopWatch();
		//1970년 1월 1일부터 지금까지 시간을 밀리세컨드로 반환
		f.startTime = System.currentTimeMillis(); 	//지금 시간을 밀리 세컨드로 구함
		
		for(long i = 0; i < 5000000000l ; i++){		//숫자 끝에 l 붙이기
			
		}
		
		f.endTime = System.currentTimeMillis();
		
//		double elapsedTime = (double) ((f.endTime - f.startTime) / (double)1000);
		double elapsedTime = f.getElapseMilliTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}

}
