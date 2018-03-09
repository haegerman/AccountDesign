
public class TransferFrom extends Transaction {

	private Account fromAccount;
	
	public TransferFrom(int amount, Account fromAccount) {
		super(amount);
		this.fromAccount = fromAccount;
	}

	@Override
	public void print() {
		System.out.println(super.toString() + " transfered from " + fromAccount.getOwner());

	}

}
