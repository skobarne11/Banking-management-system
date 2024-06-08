package p1;

public class BankOfBoroda implements Bank {
	public static final double MIN_BALENCE;
	static {
		MIN_BALENCE = 1000;
	}

	@Override
	public boolean createAccount(int accNo, String name, double initBalence) {

		if (initBalence > MIN_BALENCE) {
			System.out.println("Account Created successfully in BOB");
			return true;
		}
		System.out.println("Insufficient Opening Balence!!!!");
		return false;
	}

	@Override
	public void withdraw(int accNo, double amt) {
		System.out.println("Withdrawing from BOB a/c");

	}

}
