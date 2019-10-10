package Control;

public class HumidifierThreadGetter extends ThreadGetter{
	public void run(){
		try{
			while(start){
				windowGUI.setHumidityLabel(df.format(control.getCurrentState()));
				if (control.getDelta() >= 0){
					windowGUI.setHumidityRateLabel("+" + df.format(control.getDelta()));
				}
				else {
					windowGUI.setHumidityRateLabel(df.format(control.getDelta()));
				}
				
				windowGUI.setHumidityLowerLabel(df.format(control.getDesiredState() + control.getDesiredUpperBound()));
				windowGUI.setHumidityUpperLabel(df.format(control.getDesiredState() - control.getDesiredLowerBound()));
				if (control.getActivity()){
					windowGUI.setHumidifierOn();
				}
				else {
					windowGUI.setHumidifierOff();
				}
				Thread.sleep(delay);
			}
				
				
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
			return;
		}
	}
}
