package ATM;
import java.util.Scanner;

class Bank1
{
	private int bal=200000;
	private int pass;
	private int amaunt;
	int Transaction;

	void dposit()
	{
		System.out.println("Enter Password");
		Scanner s = new Scanner(System.in);
		pass = s.nextInt();
		if (pass == 123)
		{
			System.out.println(" Enter Diposit amaunt");
			amaunt = s.nextInt();
			bal=bal+ amaunt;
			System.out.println("Diposit Amaount Successfully");
			System.out.println("Your Currunt Balance is :" + bal);
			Transaction= amaunt;
		} 
		else 
		{
			System.out.println("Incorrect Password");
		}
	}

	void Withdraw() {
		System.out.println("Enter Password");
		Scanner s = new Scanner(System.in);
		pass = s.nextInt();
		if (pass == 123) {
	    System.out.println("Enter Withdraw Amaunt");

			amaunt = s.nextInt();

			if (bal < amaunt) {
				System.out.println("Insufficient Balance please check Your Balance");

			} else {
				bal = bal - amaunt;
				System.out.println("Amaunt withdraw Successfully=" + amaunt);
				System.out.println("Your Currunt balance is=" + bal);
				Transaction = -amaunt;
			}

		}
	else
	{
		System.out.println("Incorrect Password");
	 }
  }	

	void Viewbalance() {
		System.out.println("Enter Password");
		Scanner s = new Scanner(System.in);
		pass = s.nextInt();

		if (pass == 123) {

			System.out.println("Currurt balance=" + bal);
		} else {
			System.out.println("Incorrect Password");
		}
	}

	void Transaction() {

		if (Transaction > 0)
		{
			System.out.println("Diposited :" +Transaction);
		} 
		else if (Transaction < 0) 
		{
			System.out.println("Withdraw :" + Math.abs(Transaction));
		} 
		else 
		{
			System.out.println("No Transaction Occoured");
		}
	}
}

  public class bank {

		public static void main(String[] args) {

			System.out.println("!... Welcome To ATM..!  \n     ");
			Bank1 b = new Bank1();

			int ch;
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Transaction");
			System.out.println("4.View Balance");
			System.out.println("5.Quit");
			do {
				System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
				System.out.println("Enter Your choice");
				System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");

				Scanner s = new Scanner(System.in);
				ch = s.nextInt();
				switch (ch) {
				case 1:
					b.dposit();
					break;
				case 2:
					b.Withdraw();
					break;
				case 3:
					b.Transaction();
					break;
				case 4:
					b.Viewbalance();
					break;
				case 5:
					System.out.println("Thank you for visiting This ATM........");
					break;
				default:
					System.out.println("Invalid Choice");
					break;
				}
			} while (ch != 5);
			System.out.println("Thank You For Using Our Services");
		}

	}