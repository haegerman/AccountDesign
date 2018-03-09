
public class Deposit extends Transaction {

	public Deposit(int amount) {
		super(amount); //send to super class
		 //initalise deposit
		
	}
	
	@Override
	public void print() {
		System.out.println(super.toString() + " deposited");

	}

}
