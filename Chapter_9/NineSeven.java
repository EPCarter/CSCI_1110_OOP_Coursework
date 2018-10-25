import java.util.Scanner;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 9-7
 * @date Oct. 24, 2018
 * @summary (The Account class) Design a class named Account that contains:
 * 
 *          A private int data field named id for the account (default 0). A
 *          private double data field named balance for the account (default 0).
 *          A private double data field named annualInterestRate that stores the
 *          current interest rate (default 0). Assume all accounts have the same
 *          interest rate. A private Date data field named dateCreated that
 *          stores the date when the account was created. A no-arg constructor
 *          that creates a default account. A constructor that creates an
 *          account with the specified id and initial balance. The accessor and
 *          mutator methods for id, balance, and annualInterestRate. The
 *          accessor method for dateCreated. A method named
 *          getMonthlyInterestRate() that returns the monthly interest rate. A
 *          method named getMonthlyInterest() that returns the monthly interest.
 *          A method named withdraw() that withdraws a specified amount from the
 *          account. A method named deposit() that deposits a specified amount
 *          to the account.
 * 
 *          Draw the UML diagram for the class and then implement the class.
 * 
 *          (Hint: The method getMonthlyInterest() is to return monthly
 *          interest, not the interest rate. Monthly interest is balance *
 *          monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12.
 *          Note that annualInterestRate is a percentage, e.g., like 4.5%. You
 *          need to divide it by 100.)
 * 
 *          Write a test program that creates an Account object with an account
 *          ID of 1122, a balance of $20,000, and an annual interest rate of
 *          4.5%. Use the withdraw method to withdraw $2,500, use the deposit
 *          method to deposit $3,000, and print the balance, the monthly
 *          interest, and the date when this account was created.
 **/
class NineSeven {
	public static void main(String[] args) {

	}

	/**
	 * This is the account that holds the ID, balance, annual interest rate, and
	 * date created
	 */
	public class Account {
		private int id = 0;
		private double balance = 0;
		private double annualInterestRate = 0;
		private String dateCreated = ""; // current nanoseconds since 1970
	}

	/**
	 * This is the no argument constructor
	 */
	public static void noArgConstructor() {

	}

	/**
	 * This is the new account constructor that uses a given ID and balance
	 */
	public static void newAccountConstructor() {
		System.out.println("ID: ");
		int id = (int) getInput();
		System.out.println("Balance: ");
		double balance = (double) getInput();

	}

	/**
	 * This method gets the input from the user
	 * 
	 * @return it returns the input as a double
	 */
	public static double getInput() {
		Scanner reader = new Scanner(System.in);
		double input = reader.nextDouble();
		reader.close();
		return input;
	}

	/**
	 * This method grabs the date the account was created
	 * 
	 * @return it is returned as nanoseconds since 1970
	 */
	public long dateCreatedAccessor() {
		long dateCreated = 0;
		return dateCreated;
	}

	/**
	 * This method accesses the account ID
	 * 
	 * @return ID is returned as an int
	 */
	public int idAccessor() {
		int idAccessor = 0;
		return idAccessor;
	}

	/**
	 * This method accesses the account balance
	 * 
	 * @return Balance is returned as a double
	 */
	public double balanceAccessor() {
		double balance = 0;
		return balance;
	}

	/**
	 * This method accesses the account annual interest rate
	 * 
	 * @return Interest rate is returned as a double
	 */
	public double annualInterestRateAccessor() {
		double annualInterestRate = 0;
		return annualInterestRate;
	}

	/**
	 * This method sets the ID
	 */
	public static int idMutator() {
		int idAccessor = 0;
		return idAccessor;
	}

	/**
	 * This method sets the account balance
	 */
	public static double balanceMutator() {
		double balance = 0;
		return balance;
	}

	/**
	 * This method sets the annual interest rate
	 */
	public static double annualInterestRateMutator() {
		double annualInterestRate = 0;
		return annualInterestRate;
	}

	/**
	 * This method gets the monthly interest rate
	 * 
	 * @return Monthly interest rate is returned as a double
	 */
	public static double getMonthlyInterestRate() {
		double monthlyInterestRate = 0;
		return monthlyInterestRate;
	}

	/**
	 * This method withdraws from the account
	 * 
	 * @return it returns the new balance as a double
	 */
	public static double withdraw() {
		int id = 0;
		double balance = 0;
		double withdraw = 0;
		return balance;
	}

	/**
	 * This method deposits into the account
	 * 
	 * @return The new balance is returned as a double
	 */
	public static double deposit() {
		int id = 0;
		double balance = 0;
		double deposit = 0;
		return balance;
	}

	/**
	 * This method gets the monthly interest
	 * 
	 * @return Monthly interest is retunred as a double
	 */
	public static double monthlyInterest() {
		double monthlyInterest = 0;
		double monthlyInterestRate = getMonthlyInterestRate();
		double balance = 0;
		double annualInterestRate = 0;
		monthlyInterest = balance * monthlyInterestRate;
		return monthlyInterest;
	}

	/**
	 * This method draws the UML
	 */
	public static void uml() {

	}
}