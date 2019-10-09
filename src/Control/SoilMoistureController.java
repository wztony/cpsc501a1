package Control;

public class SoilMoistureController extends Controller {
	
	public SoilMoistureController(double currentState, double ambientState, 
			double ambientRate, double desiredState, double desiredRate,
			double upperBound, double lowerBound, double refresh, double 
			maxBound, double minBound){
		super(currentState,ambientState,ambientRate,desiredState,desiredRate,
				upperBound,lowerBound,refresh,maxBound,minBound);
	}
	
	public SoilMoistureController(){
		super(0,0,0,0,0,0,0,1,0,100);
	}
	
	/**
	 * method that sets the sprinkler on or off. If the desired moisture is 
	 * lower than the ambient moisture, it is impossible to achieve the desired
	 * moisture because we can only turn the sprinkler on and off.
	 */
	public void onActivity(){
		double dr = this.getDesiredRate();
		double c = this.getCurrentState();
		double d = this.getDesiredState();
		double lb = this.getLowerBound();
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
	
	public void running(){
		onActivity();
		updateRate();
		update();
	}
}
