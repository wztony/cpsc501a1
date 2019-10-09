package Control;
import java.text.DecimalFormat;

public class SprinklerThreadGetter extends Thread{
	public int delay;
	public boolean start = false;
	public boolean on = true;
	public Controller control;
	public Window guiWin;
	public DecimalFormat df = new DecimalFormat("#,###,##0.0000");
	
	public SprinklerThreadGetter(){
		this(1,null,null);
	}
	
	public SprinklerThreadGetter(int delay,Controller C,Window W){
		this.delay = delay * 1000;
		this.control = C;
		this.guiWin = W;
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
		guiWin = W;
	}
	
	

	public void run(){
		try{
			while(start){
				guiWin.setLblCurrentSoilMois(df.format(control.getCurrentState()));
				if (control.getDelta() >= 0){
					guiWin.setLblSoilMoisUpdateRate("+" + df.format(control.getDelta()));
				}
				else {
					guiWin.setLblSoilMoisUpdateRate(df.format(control.getDelta()));
				}
				
				guiWin.setLblSoilMoisLimitLower(df.format(control.getDesiredState() + control.getUpperBound()));
				guiWin.setLblSoilMoisLimitUpper(df.format(control.getDesiredState() - control.getLowerBound()));
				if (control.getActivity()){
					guiWin.setSprinklerOn();
				}
				else {
					guiWin.setSprinklerOff();
				}
				Thread.sleep(delay);
			}
				
				
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
			return;
		}
	}
}
