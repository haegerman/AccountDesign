import java.util.ArrayList;

public class Account {

	private int balance;
	final private int number;
	private String owner;
	
	ArrayList<Transaction> list;

	
	static private int nAccounts = 0;
	

	public Account(String name) { //constructor
		owner = name;
		balance = 0;
		nAccounts++;
		number = nAccounts;
		list = new ArrayList<>();
		list.add(new Creation());
	}

	public void deposit(int amount) {
		balance = balance + amount;
		list.add(new Deposit(amount));
	}

	public void withdraw(int amount) {
		if (amount > balance) {
			System.out.println("Withdraw: Not enough money!");
		} else {
			balance = balance - amount;
			list.add(new Withdrawal(amount));
			System.out.println("Withdraw - Balance is: " + balance);
		}
	}

	public void transferTo (int amount, Account toAccount) {
		if (amount > balance) {
			System.out.println("Transfer: Not enough money!");
		} else {
			balance = balance - amount;
			list.add(new TransferTo(amount, toAccount));
			toAccount.balance = toAccount.balance + amount;
			toAccount.list.add(new TransferFrom(amount, this));
			System.out.println("Transfer - Balance is: " + balance);
		}
	}

	public void printAll() {
		System.out.println(number + "/" + owner + ": " + balance);
		for(Transaction t :list) {
			t.print();
		}
	}

	public String getOwner() {
		return owner;
	}
}


