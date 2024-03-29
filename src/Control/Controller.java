package Control;



public class Controller extends Thread{
	/**
	 * current state
	 */
	private double currentState;
	/**
	 * ambient state
	 */
	private double ambientState;
	/**
	 * ambient rate 
	 */
	private double ambientRate;
	/**
	 * desired state 
	 */
	private double desiredState;
	/**
	 * desired rate 
	 */
	private double desiredRate;
	/**
	 * upper bound 
	 */
	private double desiredUpperBound;
	/**
	 * lower bound 
	 */
	private double desiredLowerBound;
	/**
	 * refresh rate 
	 */
	private double refresh;
	/**
	 * refresh rate with modifier 
	 */
	private double refreshRate;
	/**
	 * maximum state
	 */
	private double maxState;
	/**
	 * minimum state
	 */
	private double minState;
	/**
	 * state's rate of change
	 */
	private double delta;
	
	/**
	 * standard delay of 1 second
	 */
	private int delay = 1000;
	
	/**
	 * variable to show if the controller (ie, humidifier. Not the class) is "on" or "off"
	 */
	private boolean activity;
	/**
	 * variable to determine to "pause" the thread or not
	 */
	private boolean pause = true;
	/**
	 * variable to determine to run the thread
	 */
	private boolean start = false;
	
	
	public Controller() {
		this(0,0,0,0,0,0,0,1,-271,1000000);
	}

	
	/**
	 * Basic constructor for Controller. It calls the Controller constructor
	 * with 0 for currentState, ambientState, ambientRate, desiredState,
	 * desiredRate, upperBound, and lowerBound, 1 for refresh, and double
	 * variables for minBound, and maxBound.
	 * @param minBound minimum state
	 * @param maxBound maximum state
	 */
	public Controller(double minBound, double maxBound){
		this(0,0,0,0,0,0,0,1,minBound,maxBound);
	}
	
	/**
	 * Constructor for Controller. It takes 10 double inputs and set them as 
	 * currentState,ambientState, ambientRate, desiredState, desiredRate, 
	 * upperBound, lowerBound, refresh, minBound, and maxBound.
	 * It also sets boolean activity false, setting the ie. humidifier as off.
	 * @param currentState current state
	 * @param ambientState ambient state
	 * @param ambientRate ambient rate
	 * @param desiredState desired state
	 * @param desiredRate desired rate
	 * @param upperBound upper bound
	 * @param lowerBound lower bound
	 * @param refresh refresh rate
	 * @param minBound minimum state
	 * @param maxBound maximum state
	 */
	public Controller(double currentState, double ambientState, 
			double ambientRate, double desiredState, double desiredRate,
			double upperBound, double lowerBound, double refresh, double 
			minBound, double maxBound){
		this.setCurrentState(currentState);
		this.setAmbientState(ambientState);
		this.setAmbientRate(ambientRate);
		this.setDesiredState(desiredState);
		this.setDesiredRate(desiredRate);
		this.setDesiredUpperBound(upperBound);
		this.setDesiredLowerBound(lowerBound);
		this.setRefresh(refresh);
		this.setMinState(minBound);
		this.setMaxState(maxBound);
		this.setActivity(false);
	}
	
	/**
	 * a method that has the same effect as the basic constructor in assigning
	 * values to variables.
	 */
	public void setDefault(){
		this.setCurrentState(0);
		this.setAmbientState(0);
		this.setAmbientRate(0);
		this.setDesiredState(0);
		this.setDesiredRate(0);
		this.setDesiredUpperBound(0);
		this.setDesiredLowerBound(0);
		this.setRefresh(1);
		this.setActivity(false);
	}
	
	/**
	 * method that takes a double as parameter and sets it as currentState
	 * @param currentState current state
	 */
	public void setCurrentState(double currentState){
		this.currentState = currentState;
	}
	/**
	 * method that takes a double as parameter and sets it as ambientState
	 * @param ambientState ambient state
	 */
	public void setAmbientState(double ambientState){
		this.ambientState = ambientState;
	}
	/**
	 * method that takes a double as parameter and sets it as ambientRate
	 * @param ambientRate ambient rate
	 */
	public void setAmbientRate(double ambientRate){
		this.ambientRate = ambientRate;
	}
	/**
	 * method that takes a double as parameter and sets it as desiredState
	 * @param desiredState desired state
	 */
	public void setDesiredState(double desiredState){
		this.desiredState = desiredState;
	}
	/**
	 * method that takes a double as parameter and sets it as desiredRate
	 * @param desiredRate desired rate
	 */
	public void setDesiredRate(double desiredRate){
		this.desiredRate = desiredRate;
	}
	/**
	 * method that takes a double as parameter and sets it as upperBound
	 * @param upperBound upper bound
	 */
	public void setDesiredUpperBound(double upperBound){
		this.desiredUpperBound = Math.abs(upperBound);
	}
	/**
	 * method that takes a double as parameter and sets it as lowerBound
	 * @param lowerBound lower bound
	 */
	public void setDesiredLowerBound(double lowerBound){
		this.desiredLowerBound = Math.abs(lowerBound);
	}
	/**
	 * method that takes a double as parameter and sets it as refresh and
	 * calls setRefreshRate method with refresh as parameter
	 * @param refresh refresh rate
	 */
	public void setRefresh(double refresh){
		this.refresh = refresh;
		setRefreshRate(refresh);
	}
	/**
	 * method that takes a double as parameter and divides it by 3600 and
	 * set it as refreshRate
	 * @param refresh refresh
	 */
	public void setRefreshRate(double refresh){
		this.refreshRate = refresh/60;
	}	
	/**
	 * method that takes a double as parameter and sets it as maxBound
	 * @param maxBound maximum state
	 */
	public void setMaxState(double maxBound) {
		this.maxState = maxBound;
	}
	/**
	 * method that takes a double as parameter and sets it as minBound
	 * @param minBound minimum stare
	 */
	public void setMinState(double minBound) {
		this.minState = minBound;
	}
	/**
	 * method that takes a boolean as parameter and sets it activity
	 * @param activity status of ie. humidifier
	 */
	public void setActivity(boolean activity){
		this.activity = activity;
	}
	
	
	/**
	 * method that returns currentState as a double
	 * @return currentState
	 */
	public double getCurrentState(){
		return currentState;
	}
	/**
	 * method that returns ambientState as a double
	 * @return ambientState
	 */
	public double getAmbientState(){
		return ambientState;
	}
	/**
	 * method that returns ambientRate as a double
	 * @return ambientRate
	 */
	public double getAmbientRate(){
		return ambientRate;
	}
	/**
	 * method that returns desiredState as a double
	 * @return desiredState
	 */
	public double getDesiredState(){
		return desiredState;
	}
	/**
	 * method that returns desiredRate as a double
	 * @return desiredRate
	 */
	public double getDesiredRate(){
		return desiredRate;
	}
	/**
	 * method that returns upperBound as a double
	 * @return upperBound
	 */
	public double getDesiredUpperBound(){
		return desiredUpperBound;
	}
	/**
	 * method that returns lowerBound as a double
	 * @return lowerBound
	 */
	public double getDesiredLowerBound(){
		return desiredLowerBound;
	}
	/**
	 * method that returns refresh as a double
	 * @return refresh
	 */
	public double getRefresh(){
		return refresh;
	}
	/**
	 * method that returns refreshRate as a double
	 * @return refreshRate
	 */
	public double getRefreshRate(){
		return refreshRate;
	}
	/**
	 * method that returns maxBound as a double
	 * @return maxBound
	 */
	public double getMaxState() {
		return maxState;
	}
	/**
	 * method that returns minBound as a double
	 * @return minBound
	 */
	public double getMinState() {
		return minState;
	}
	/**
	 * method that returns activity as a boolean
	 * @return activity
	 */
	public boolean getActivity(){
		return activity;
	}
	
	
	/**
	 * method to set the boolean pause true
	 */
	public void setPauseTrue(){
		pause = true;
	}
	/**
	 * method to set the boolean pause false
	 */
	public void setPauseFalse(){
		pause = false;
	}
	/**
	 * method that returns pause as a boolean
	 * @return pause
	 */
	public boolean getPause(){
		return pause;
	}
	
	/**
	 * method to set the boolean start true
	 */
	public void setStartTrue(){
		start = true;
	}
	/**
	 * method to set the boolean start false
	 */
	public void setStartFalse(){
		start = false;
	}
	/**
	 * method that returns start as a boolean
	 * @return start
	 */
	public boolean getStart(){
		return start;
	}
	
	
	/**
	 * method that takes a double as parameter and sets it as delta
	 * @param delta state's rate of change
	 */
	public void setDelta(double delta){
		this.delta = delta;
	}
	/**
	 * method that returns delta as a double
	 * @return
	 */
	public double getDelta(){
		return delta;
	}
	
	
	
	/**
	 * method to update the sign of ambientRate.
	 * If currentState is greater than ambientState, it will set ambientRate
	 * as negative.
	 * If currentState is lesser than ambientState, it will set ambientRate
	 * as positive.
	 */
	public void updateAmbientRate(){
		if (this.currentState > this.ambientState){
			this.ambientRate = (0 - Math.abs(ambientRate));
		}
		else if (this.currentState < this.ambientState){
			this.ambientRate = (Math.abs(ambientRate));
		}
	}
	/**
	 * method to update the sign of desiredRate.
	 * If currentState is greater than desiredState, it will set desiredRate
	 * as negative.
	 * If currentState is lesser than desiredState, it will set desiredRate
	 * as positive.
	 */
	public void updateDesiredRate(){
		if (this.currentState > this.desiredState){
			this.desiredRate = (0 - Math.abs(desiredRate));
		}
		else if (this.currentState < this.desiredState){
			this.desiredRate = (Math.abs(desiredRate));
		}
	}
	/**
	 * method that calls the methods updateAmbientRate and updateDesiredRate
	 */
	public void updateRates(){
		updateAmbientRate();
		updateDesiredRate();
	}
	
	public double getAugmentedAR() {
		return ambientRate/(60/refresh);
	}
	
	public double getAugmentedDR() {
		return desiredRate/(60/refresh);
	}
	
	/**
	 * method that updates the currentState and delta.
	 */
	public void simulateActivity(){
		double current = currentState;
		if(!this.getActivity()) {
			if (Math.abs(ambientState - currentState) < Math.abs(getAugmentedAR())) {
				currentState = ambientState;
			}
			else {
				currentState = currentState + getAugmentedAR();
			}
		}
		else {
			if (Math.abs(ambientState-currentState) < getAugmentedAR()) {
				currentState = ambientState;
				currentState = currentState + getAugmentedDR();
			}
			else {
				currentState = currentState + getAugmentedAR() + getAugmentedDR();
			}
		}
		if (currentState < minState) {
			currentState = minState;
		}
		else if(currentState > maxState) {
			currentState = maxState;
		}
		setDelta(currentState - current);
	}
	
	
	/**
	 * method that sets the ie.humidifier on or off.
	 */
	public void determineActivity(){
		if (this.desiredRate == 0){
			this.activity = false;
		}
		else if (this.currentState - this.desiredState > this.desiredUpperBound){
			this.activity = true;
		}
		else if (this.desiredState - this.currentState > this.desiredLowerBound){
			this.activity = true;
		}
		else {
			this.activity = false;
		}
	}
	
	/**
	 * method that calls the methods onActivity, updateRate, and update. It is
	 * the main running method of a controller, ie. humidifier, sprinkler
	 */
	public void runSimulation(){
		determineActivity();
		updateRates();
		simulateActivity();
	}
	
	/**
	 * method to start the Controller thread. 
	 * If pause if true, it will just sleep. 
	 * If pause if false, it will call the method running, and then sleep.
	 */
	public void run(){
		
		try{
			for(;;){
				if (!pause) {
					runSimulation();
					Thread.sleep(delay*(int)getRefresh());
				}
				else {
					Thread.sleep(delay*(int)getRefresh());
				}
				
				
			}
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
			return;
		}
	}
	
}