package Control;
import java.text.DecimalFormat;

public class ThermostatThreadGetter extends Thread{
	public int delay;
	public boolean start = false;
	public boolean on = true;
	public Controller control;
	public Window guiWin;
	public DecimalFormat df = new DecimalFormat("#,###,##0.0000");
	
	public ThermostatThreadGetter(){
		this(1,null,null);
	}
	
	public ThermostatThreadGetter(int delay,Controller C,Window W){
		this.delay = delay * 1000;
		this.control = C;
		this.guiWin = W;
	}
	/**
	 * method to return start as boolean
	 * @return start
	 */
	public boolean getStart(){
		return start;
	}
	/**
	 * method to set start true
	 */
	public void setStartTrue(){
		start = true;
	}
	/**
	 * method to set start false
	 */
	public void setStartFalse(){
		start = false;
	}
	
	/**
	 * method to return on as boolean
	 * @return
	 */
	public boolean getOn(){
		return on;
	}
	/**
	 * method to set on true
	 */
	public void setOnTrue(){
		on = true;
	}
	/**
	 * method to set on false
	 */
	public void setOnFalse(){
		on = false;
	}
	
	/**
	 * method to take an int parameter and set as delay
	 * @param delay delay
	 */
	public void setDelay(int delay){
		this.delay = delay * 1000;
	}
	
	/**
	 * method to set current Controller, ie. thermostat in this case
	 * @param C Controller
	 */
	public void setController(Controller C){
		control = C;
	}
	/**
	 * method to set current Window
	 * @param W Window
	 */
	public void setWindow(Window W){
		guiWin = W;
	}
	
	
	/**
	 * method to start ThermostatThreadGetter.
	 * It will update the current temperature, rate of change, and upper and lower limit.
	 */
	public void run(){
		try{
			while(start){
				control.updateRate();
				guiWin.setLblCurrentTemp(df.format(control.getCurrentState()));
				if (control.getDelta() >= 0){
					guiWin.setLblTempUpdateRate("+" + df.format(control.getDelta()/control.getRefresh()));
				}
				else {
					guiWin.setLblTempUpdateRate(df.format(control.getDelta()/control.getRefresh()));
				}
				
				
				guiWin.setLblTempLimitLower(df.format(control.getDesiredState() + control.getUpperBound()));
				guiWin.setLblTempLimitUpper(df.format(control.getDesiredState() - control.getLowerBound()));
				if (control.getActivity()){
					guiWin.setThermostatOn();
					if (control.getDesiredRate() > 0){
						guiWin.setFurnaceOn();
					}
					else if (control.getDesiredRate() < 0){
						guiWin.setAirConditionerOn();
					}
					else {
						guiWin.setACAndFOff();
					}
				}
				else {
					guiWin.setThermostatOff();
					guiWin.setACAndFOff();
				}
				Thread.sleep(delay);
			}
				
				
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
			return;
		}
	}
}
