package Day4;

public class bank_Account {
	static class bank{
		String owner;
		double balance;
		public bank(String owner , double balance) {
			this.owner = owner;
			this.balance = balance;
		}
		void deposit(double amount) {
			if(amount > 0) {
				balance+= amount;
			}
		}
		void withdraw(double amount) {
			if(balance >= amount ) {
				balance-= amount;
			}
		}
		public String getOwner() {
			return owner;
		}
		public double getBalance() {
			return balance;
		}
	}

	public static void main(String[] args) {
		bank acc = new bank("Sarthak", 1000.0);
		acc.deposit(500);acc.withdraw(300);
		System.out.println(acc.getBalance()); // 1200.0 
	}

}
