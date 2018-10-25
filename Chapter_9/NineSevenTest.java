import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NineSevenTest {
	private NineSeven classUnderTest;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		classUnderTest = new NineSeven();
	}

	@Test
	void test() {
		int id = 1122;
		double balance = 20000;
		double annualInterestRate = .045;
		double withdraw = 2500;
		double deposit = 3000;
		long dateCreated = 0;
		double monthlyInterest = 0;
		System.out.println("Balance: $" + balance);
		System.out.println("Monthly Interest: $" + monthlyInterest);
		System.out.println("Date Created: " + dateCreated);
	}
}