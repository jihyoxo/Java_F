package java_20191129;

public class ThrowDemo {
	public static double withdraw(String account, int amount) 
			throws Exception {
		double myBalance = 10000;
		String myAccount = "123-123-1234";
		if(myAccount.equals(account)){
			if(myBalance - amount >= 0){
				myBalance -= amount;
			}else {
				throw new InsufficientBalanceException("잔고가 부족합니다.");
			}
		}else {
			throw new InCorrectAccountException("계좌번호가 잘못되었습니다.");
		}
		return myBalance;
	}
	
	public static void main(String[] args) {
		double balance = 0;
		try {
			balance = withdraw("123-123-1234", 2000);
			System.out.printf("인출 후 잔고는 %.0f원 입니다.", balance);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
