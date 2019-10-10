package Control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControllerTest {
	int maxState;
	int minState;
	boolean activity;
	int currentState;
	int ambientState;
	int ambientRate;
	int desiredState;
	int desiredRate;
	int upperBound;
	int lowerBound;
	int refresh;
	int higherValue;
	int lowerValue;

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {	
	activity = true;
	currentState = 50;
	ambientState = 35;
	ambientRate = 23;
	desiredState = 80;
	desiredRate = 17;
	upperBound = 4;
	lowerBound = 2;
	refresh = 1;
	higherValue = 90;
	lowerValue = 10;

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testController() {
		Controller temperatureController = new Controller();
		
		maxState = 1000000;
		minState = -271;
		
		assertEquals(maxState, temperatureController.getMaxState());
		
		assertEquals(minState, temperatureController.getMinState());
		
		temperatureController.setActivity(activity);
		assertEquals(activity, temperatureController.getActivity());
		
		temperatureController.setCurrentState(currentState);
		assertEquals(currentState, temperatureController.getCurrentState());
		
		temperatureController.setAmbientState(ambientState);
		assertEquals(ambientState, temperatureController.getAmbientState());
		
		temperatureController.setAmbientRate(ambientRate);
		assertEquals(ambientRate, temperatureController.getAmbientRate());
		
		temperatureController.setDesiredState(desiredState);
		assertEquals(desiredState, temperatureController.getDesiredState());
		
		temperatureController.setDesiredRate(desiredRate);
		assertEquals(desiredRate, temperatureController.getDesiredRate());
		
		temperatureController.setDesiredUpperBound(upperBound);
		assertEquals(upperBound, temperatureController.getDesiredUpperBound());
		
		temperatureController.setDesiredLowerBound(lowerBound);
		assertEquals(lowerBound, temperatureController.getDesiredLowerBound());
		
		temperatureController.setRefresh(refresh);
		assertEquals(refresh, temperatureController.getRefresh());
		
		int negativeAR = 0-Math.abs(ambientRate);
		temperatureController.setCurrentState(higherValue);
		temperatureController.setAmbientState(lowerValue);
		temperatureController.updateAmbientRate();
		assertEquals(negativeAR, temperatureController.getAmbientRate());
		
		int positiveAR = Math.abs(ambientRate);
		temperatureController.setCurrentState(lowerValue);
		temperatureController.setAmbientState(higherValue);
		temperatureController.updateAmbientRate();
		assertEquals(positiveAR, temperatureController.getAmbientRate());
		
		int negativeDR = 0-Math.abs(desiredRate);
		temperatureController.setCurrentState(higherValue);
		temperatureController.setDesiredState(lowerValue);
		temperatureController.updateDesiredRate();
		assertEquals(negativeDR, temperatureController.getDesiredRate());
		
		int positiveDR = Math.abs(desiredRate);
		temperatureController.setCurrentState(lowerValue);
		temperatureController.setDesiredState(higherValue);
		temperatureController.updateDesiredRate();
		assertEquals(positiveDR, temperatureController.getDesiredRate());
	}
	
	@Test
	void testOneWayController() {
		OneWayController oneWayController = new OneWayController();
		
		maxState = 100;
		minState = 0;
		
		assertEquals(maxState, oneWayController.getMaxState());
		
		assertEquals(minState, oneWayController.getMinState());
		
		oneWayController.setActivity(activity);
		assertEquals(activity, oneWayController.getActivity());
		
		oneWayController.setCurrentState(currentState);
		assertEquals(currentState, oneWayController.getCurrentState());
		
		oneWayController.setAmbientState(ambientState);
		assertEquals(ambientState, oneWayController.getAmbientState());
		
		oneWayController.setAmbientRate(ambientRate);
		assertEquals(ambientRate, oneWayController.getAmbientRate());
		
		oneWayController.setDesiredState(desiredState);
		assertEquals(desiredState, oneWayController.getDesiredState());
		
		oneWayController.setDesiredRate(desiredRate);
		assertEquals(desiredRate, oneWayController.getDesiredRate());
		
		oneWayController.setDesiredUpperBound(upperBound);
		assertEquals(upperBound, oneWayController.getDesiredUpperBound());
		
		oneWayController.setDesiredLowerBound(lowerBound);
		assertEquals(lowerBound, oneWayController.getDesiredLowerBound());
		
		oneWayController.setRefresh(refresh);
		assertEquals(refresh, oneWayController.getRefresh());
		
		int negativeAR = 0-Math.abs(ambientRate);
		oneWayController.setCurrentState(higherValue);
		oneWayController.setAmbientState(lowerValue);
		oneWayController.updateAmbientRate();
		assertEquals(negativeAR, oneWayController.getAmbientRate());
		
		int positiveAR = Math.abs(ambientRate);
		oneWayController.setCurrentState(lowerValue);
		oneWayController.setAmbientState(higherValue);
		oneWayController.updateAmbientRate();
		assertEquals(positiveAR, oneWayController.getAmbientRate());
		
		int negativeDR = 0-Math.abs(desiredRate);
		oneWayController.setCurrentState(higherValue);
		oneWayController.setDesiredState(lowerValue);
		oneWayController.updateDesiredRate();
		assertEquals(negativeDR, oneWayController.getDesiredRate());
		
		int positiveDR = Math.abs(desiredRate);
		oneWayController.setCurrentState(lowerValue);
		oneWayController.setDesiredState(higherValue);
		oneWayController.updateDesiredRate();
		assertEquals(positiveDR, oneWayController.getDesiredRate());
	}

}
