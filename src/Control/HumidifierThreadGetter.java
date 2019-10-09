package Control;
import java.text.DecimalFormat;

public class HumidifierThreadGetter extends Thread{
	public int delay;
	public boolean start = false;
	public boolean on = true;
	public Controller control;
	public Window windowGUI;
	public DecimalFormat df = new DecimalFormat("#,###,##0.0000");
	
	public HumidifierThreadGetter(){
		this(1,null,null);
	}
	
	public HumidifierThreadGetter(int delay,Controller C,Window W){
		this.delay = delay * 1000;
		this.control = C;
		this.windowGUI = W;
	}
	
	public boolean getStart(){
		return start;
	}
	public void setStartTrue(){
		start = true;
	}
	public void setStartFalse(){
		start = false;
	}
	
	public boolean getOn(){
		return on;
	}
	public void setOnTrue(){
		on = true;
	}
	public void setOnFalse(){
		on = false;
	}
	
	public void setDelay(int delay){
		this.delay = delay * 1000;
	}
	
	
	public void setController(Controller C){
		control = C;
	}
	
	public void setWindow(Window W){
		windowGUI = W;
	}
	
	

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
