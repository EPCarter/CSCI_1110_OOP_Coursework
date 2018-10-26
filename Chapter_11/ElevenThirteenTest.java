import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElevenThirteenTest {
	private ElevenThirteen classUnderTest;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		classUnderTest = new ElevenThirteen();
	}

	@Test
	void test() {
		String input = "34 5 3 5 6 4 33 2 2 4";
		String answer = "2 3 4 5 6 33 34";
		String output = ElevenThirteen.testMethod(input);
		System.out.println(output + "|" + answer);
		assertTrue(output.matches(answer));
	}
}