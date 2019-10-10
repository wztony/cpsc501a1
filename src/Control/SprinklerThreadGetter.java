package Control;

public class SprinklerThreadGetter extends ThreadGetter{
	public void run(){
		try{
			while(start){
				windowGUI.setMoistureLabel(df.format(control.getCurrentState()));
				if (control.getDelta() >= 0){
					windowGUI.setMoistureRateLabel("+" + df.format(control.getDelta()));
				}
				else {
					windowGUI.setMoistureRateLabel(df.format(control.getDelta()));
				}
				
				windowGUI.setMoistureLowerLabel(df.format(control.getDesiredState() + control.getDesiredUpperBound()));
				windowGUI.setMoistureUpperLabel(df.format(control.getDesiredState() - control.getDesiredLowerBound()));
				if (control.getActivity()){
					windowGUI.setSprinklerOn();
				}
				else {
					windowGUI.setSprinklerOff();
				}
				Thread.sleep(delay);
			}
				
				
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
			return;
		}
	}
}
