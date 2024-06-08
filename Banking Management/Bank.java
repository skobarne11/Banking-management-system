package p1;

public interface Bank {
	
	boolean createAccount(int accNo,String name,double initBalence);
	
	void withdraw(int accNo,double amt);

}
