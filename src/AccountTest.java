
public class AccountTest {

	public static void main(String[] args) {
		Account a1 = new Account("Oliver"); 
		Account a2 = new Account("Caroline"); 
		
		a1.deposit(200); 
		a1.withdraw(170); 
		a2.deposit(300); 
		a2.transferTo(100, a1); 
		
		a1.printAll(); 
		a2.printAll();

	}

}
