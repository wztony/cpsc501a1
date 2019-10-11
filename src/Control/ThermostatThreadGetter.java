package Control;

public class ThermostatThreadGetter extends ThreadGetter{
	/**
	 * method to start ThermostatThreadGetter.
	 * It will update the current temperature, rate of change, and upper and lower limit.
	 */
	public void run(){
		try{
			while(start){
				control.updateRates();
				windowGUI.setTemperatureLabel(df.format(control.getCurrentState()));
				if (control.getDelta() >= 0){
					windowGUI.setTemperatureRateLabel("+" + df.format(control.getDelta()));
				}
				else {
					windowGUI.setTemperatureRateLabel(df.format(control.getDelta()));
				}
				
				
				windowGUI.setTemperatureLowerLabel(df.format(control.getDesiredState() + control.getDesiredUpperBound()));
				windowGUI.setTemperatureUpperLabel(df.format(control.getDesiredState() - control.getDesiredLowerBound()));
				if (control.getActivity()){
					windowGUI.setThermostatOn();
					if (control.getDesiredRate() > 0){
						windowGUI.setHeaterOn();
					}
					else if (control.getDesiredRate() < 0){
						windowGUI.setAirConditionerOn();
					}
					else {
						windowGUI.setACAndHeaterOff();
					}
				}
				else {
					windowGUI.setThermostatOff();
					windowGUI.setACAndHeaterOff();
				}
				Thread.sleep(delay);
			}
				
				
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
			return;
		}
	}
}
