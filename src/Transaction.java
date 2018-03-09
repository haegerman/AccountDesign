import java.util.Date;

public abstract class Transaction {
	private Date date;
	final private int id;
	private int amount;
	
	static private int nTransactions = 0;
	
	public Transaction (int amount) {
		date = new Date();
		this.amount = amount;
		nTransactions++;
		id = nTransactions;
	}
	
	public String toString() {
		return date + " [" + id + "]" + amount;
	}
	
	public abstract void print();
		
	
}
