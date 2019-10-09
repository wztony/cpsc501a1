package Control;

public class TemperatureController extends Controller {
	
	public TemperatureController(double currentState, double ambientState, 
			double ambientRate, double desiredState, double desiredRate,
			double upperBound, double lowerBound, double refresh, double 
			maxBound, double minBound){
		super(currentState,ambientState,ambientRate,desiredState,desiredRate,
				upperBound,lowerBound,refresh,maxBound,minBound);
	}
	
	public TemperatureController(){
		super(0,0,0,0,0,0,0,1,-271,1000000);
	}
}
