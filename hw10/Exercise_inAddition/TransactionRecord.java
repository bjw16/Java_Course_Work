public class TransactionRecord {
	private int accountNumber;
	private double amount;
	public TransactionRecord(){
		this.accountNumber = 0;
		this.amount = 0;
	}
	public TransactionRecord(int x, double y){
		this.accountNumber = x;
		this.amount = y;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	public double getAmount(){
		return amount;
	}
	public void setAccountNumber(int x){
		this.accountNumber = x;
	}
	public void setAmount(double y){
		this.amount = y;
	}

}


