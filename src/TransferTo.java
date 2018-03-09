
public class TransferTo extends Transaction {

	private Account toAccount;
	
	public TransferTo(int amount, Account toAccount) {
		super(amount);
		this.toAccount = toAccount;
	}

	@Override
	public void print() {
		System.out.println(super.toString() + " transfered to " + toAccount.getOwner());

	}

}
