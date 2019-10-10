package Control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControllerTest {


	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Controller temperatureController = new Controller();
		assertEquals(1000000, temperatureController.getMaxState());
		assertEquals(-271, temperatureController.getMinState());
		
		OneWayController humidityController = new OneWayController();
		assertEquals(100, humidityController.getMaxState());
		assertEquals(0, humidityController.getMinState());
	}

}
