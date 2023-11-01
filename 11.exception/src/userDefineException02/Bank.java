package userDefineException02;

public class Bank {
	//잔액 필드
	private int balance;
	
	public void deposit(int money) {
		balance += money;
		
	}
	public void withdraw(int money) throws userException{
		if(balance < money) {
			throw new userException();
		throw new userException("잔고 부족 : " + (money-balance)+ "모자람")
			
		else 
			
			balance -= money;
		}
		
	}
	public int getBalance() {
		return balance;
	}

}
