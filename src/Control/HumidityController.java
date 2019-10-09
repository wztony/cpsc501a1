package Control;

public class HumidityController extends Controller {
	
	public HumidityController(double currentState, double ambientState, 
			double ambientRate, double desiredState, double desiredRate,
			double upperBound, double lowerBound, double refresh, double 
			maxBound, double minBound){
		super(currentState,ambientState,ambientRate,desiredState,desiredRate,
				upperBound,lowerBound,refresh,maxBound,minBound);
	}
	
	public HumidityController(){
		super(0,0,0,0,0,0,0,1,0,100);
	}
	
	/**
	 * method that sets the humidifier on or off. If the desired moisture is 
	 * lower than the ambient humidity, it is impossible to achieve the desired
	 * humidity because we can only turn the humidifier on and off.
	 */
	public void determineActivity(){
		double dr = this.getDesiredRate();
		double c = this.getCurrentState();
		double d = this.getDesiredState();
		double lb = this.getDesiredLowerBound();
		boolean activity;
		
		if (dr == 0){
			activity = false;
		}
		else if (c > d){
			activity = false;
		}
		else if (d - c > lb){
			activity = true;
		}
		else {
			activity = false;
		}
		this.setActivity(activity);
	}
	
	public void runSimulation(){
		determineActivity();
		updateRates();
		simulateActivity();
	}
}
