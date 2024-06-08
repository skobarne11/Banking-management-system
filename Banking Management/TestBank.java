package p1;

import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		Bank ref = null;
		while (!exit) {

			System.out.println("1.Create A/C in BOB 2.Create A/c in HDFC  3.Withdraw 4.Pay Bills 10.exit");
			switch (sc.nextInt()) {
			case 1: // Create A/C in BOB

				if (ref == null) {
					ref = new BankOfBoroda();
					System.out.println("Enter A/c no  Name  Balence");
					ref.createAccount(sc.nextInt(), sc.next(), sc.nextDouble());
				} else
					System.out.println("You Have already Created The Account");

				break;
			case 2:// Create A/c in HDFC
				if (ref == null) {
					ref = new HDFC();
					System.out.println("Enter A/c no  Name  Balence");
					ref.createAccount(sc.nextInt(), sc.next(), sc.nextDouble());
				} else
					System.out.println("You Have already Created The Account");
				break;
			case 3:// Withdraw
				if (ref != null) {
					System.out.println("Enter acct no n amount to withdraw");
					ref.withdraw(sc.nextInt(), sc.nextDouble());
				} else
					System.out.println("You have Not Chosen a Bank");
				break;
			case 4:// Pay bills
				if(ref!=null) {
					if(ref instanceof HDFC)
						((HDFC)ref).payBills();
					else 
						System.out.println("Not Supporting Facelity yet!!!!");
				}else
					System.out.println("No Bank A/C is Created !!!");

				break;
			default:
				exit = true;
				break;

			}
		}

		sc.close();

	}

}
