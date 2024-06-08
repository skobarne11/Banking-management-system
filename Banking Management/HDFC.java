package p1;

public class HDFC implements Bank {
	public static final double MIN_BALENCE;
	static {
		MIN_BALENCE = 2500;
	}

	@Override
	public boolean createAccount(int accNo, String name, double initBalence) {

		if (initBalence > MIN_BALENCE) {
			System.out.println("Account Created successfully in HDFC");
			return true;
		}
		System.out.println("Insufficient Opening Balence!!!!");
		return false;
	}

	@Override
	public void withdraw(int accNo, double amt) {
		System.out.println("Withdrawing from HDFC a/c");

	}

	public void payBills() {
		System.out.println("Paying bills using the HDFC bank A/C");
	}

}
