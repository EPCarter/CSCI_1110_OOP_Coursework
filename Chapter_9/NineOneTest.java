import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NineOneTest {
	private NineOne classUnderTest;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		classUnderTest = new NineOne();
	}

	@Test
	void test() {
		Rectangle rectangle1 = new NineOne.Rectangle();
		printer(rectangle1);

		Rectangle rectangle2 = new NineOne(4, 40) {
		};
		printer(rectangle2);

		Rectangle rectangle3 = new NioneOne.Rectangle(3.5, 35.9) {
		};
		printer(rectangle3);
	}
}