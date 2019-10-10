package Control;
import java.text.DecimalFormat;

public class ThreadGetter extends Thread {
	public int delay;
	public boolean start = false;
	public boolean on = true;
	public Controller control;
	public Window windowGUI;
	public DecimalFormat df = new DecimalFormat("#,###,##0.0000");
	
	public ThreadGetter(){
		this(1,null,null);
	}
	
	public ThreadGetter(int delay,Controller C,Window W){
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
	}
	
	
}
