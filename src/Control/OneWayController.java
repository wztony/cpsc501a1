package Control;

public class OneWayController extends Controller {

	public OneWayController() {
		super(0,100);
	}
	
	/**
	 * method that sets the eg. humidifier on or off. If the desired moisture is 
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
