class Account{
	private double balance;
	public void setBalance(double balance) {
		if(balance>=0) {
			this.balance = balance;
		}else {
			System.out.println("Invalid balance");
		}
	}
	public double getBalance() {
		return balance;
	}
}
class Encapsulation2{
	public static void main(String[] args) {
		Account a = new Account();
		//a.setBalance(5000);
		a.setBalance(-500);
		System.out.print(a.getBalance());
	}
}