package Control;

import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WindowController implements ActionListener{
	//Create new Controller for temperature, soil moisture, and humidity
	//Set the max and min limit, ie -217C for absolute zero, ie. 0 and 100%
	//for min and max moisture and humidity.
	private TemperatureController Temp = new TemperatureController();
	private SoilMoistureController SoilMois = new SoilMoistureController();
	private HumidityController Humi = new HumidityController();
	//Create new Window
	private Window W = new Window();
	private int action;
	private PrintWriter writer;
	
	//Create new updater of Window. One for each Controller.
	private ThermostatThreadGetter getTemp = new ThermostatThreadGetter();
	private SprinklerThreadGetter getSoilMois = new SprinklerThreadGetter();
	private HumidifierThreadGetter getHumi = new HumidifierThreadGetter();
	
	//Constructor that activates all action listeners
	public WindowController(){
		W.bTempUse(this);
		W.bTempOtherUse(this);
		W.bTempRun(this);
		W.bTempPause(this);
		W.bTempSave(this);
		W.bTempLoad(this);
		W.bTempReset(this);
		
		W.bSoilMoisUse(this);
		W.bSoilMoisOtherUse(this);
		W.bSoilMoisRun(this);
		W.bSoilMoisPause(this);
		W.bSoilMoisSave(this);
		W.bSoilMoisLoad(this);
		W.bSoilMoisReset(this);
		
		W.bHumiUse(this);
		W.bHumiOtherUse(this);
		W.bHumiRun(this);
		W.bHumiPause(this);
		W.bHumiSave(this);
		W.bHumiLoad(this);
		W.bHumiReset(this);
	}
	
	
	
	public static void main(String[] args) {
		//Create new GUI window
		new WindowController();
	}

	//When any button is pressed
	public void actionPerformed(ActionEvent e) {
		action = Integer.parseInt(e.getActionCommand());
		System.out.println(action);
		
		//If the controller and updater are not running, start running.
		//If they are already running, do nothing.
		if (!Temp.getStart()){
			Temp.start();
			Temp.setStartTrue();
		}
		if (!getTemp.getStart()){
			getTemp.start();
			getTemp.setStartTrue();
		}
		//Link updater to its controller and set refresh rate
		getTemp.setController(Temp);
		getTemp.setWindow(W);
		getTemp.setDelay((int)Temp.getRefresh());
		
		
		//If the controller and updater are not running, start running.
		//If they are already running, do nothing.
		if (!SoilMois.getStart()){
			SoilMois.start();
			SoilMois.setStartTrue();
		}
		if (!getSoilMois.getStart()){
			getSoilMois.start();
			getSoilMois.setStartTrue();
		}
		//Link updater to its controller and set refresh rate
		getSoilMois.setController(SoilMois);
		getSoilMois.setWindow(W);
		getSoilMois.setDelay((int)SoilMois.getRefresh());
		
		
		//If the controller and updater are not running, start running.
		//If they are already running, do nothing.
		if (!Humi.getStart()){
			Humi.start();
			Humi.setStartTrue();
		}
		if (!getHumi.getStart()){
			getHumi.start();
			getHumi.setStartTrue();
		}
		//Link updater to its controller and set refresh rate
		getHumi.setController(Humi);
		getHumi.setWindow(W);
		getHumi.setDelay((int)Humi.getRefresh());
		
		
		switch(action){	
		case 1: //Use temperature from text field
				Temp.setCurrentState(W.getInitialTemperature());
				break;
		case 2: //Use other variables from text fields
				Temp.setAmbientState(W.getAmbientTemperature());
				Temp.setAmbientRate(W.getAmbientTempRate());
				Temp.setDesiredState(W.getDesiredTemperatue());
				Temp.setDesiredRate(W.getDesiredTempRate());
				Temp.setUpperBound(W.getTempUpperBound());
				Temp.setLowerBound(W.getTempLowerBound());
				Temp.setRefresh(W.getTempRefresh());
				break;
		case 3: //Run or resume thermostat thread
				Temp.setPauseFalse();
				break;
		case 4:	//Pause thermostat thread
				Temp.setPauseTrue();				
				break;
		case 5: //Save
				try{
					writer = new PrintWriter(new FileOutputStream("GreenHouseThermostat.txt"));
				}catch(FileNotFoundException f){
					System.out.println(f.getMessage());
				}
				writer.println("Initial temperature: " + W.getInitialTemperature());
				writer.println("Ambient temperature: " + W.getAmbientTemperature());
				writer.println("Ambient rate: " + W.getAmbientTempRate());
				writer.println("Desired temperature: " + W.getDesiredTemperatue());
				writer.println("Desired rate: " + W.getDesiredTempRate());
				writer.println("Temperature upper bound: " + W.getTempUpperBound());
				writer.println("Temperature lower bound: " + W.getTempLowerBound());
				writer.println("Temperature Refresh: " + W.getTempRefresh());
				writer.println("--------");
				writer.println("Current temperature: " + W.getLblCurrentTemp());
				writer.println("Current rate: " + W.getLblCurrentTempRate());
				writer.close();
				break;
		case 6:	//Load
				break;
		case 7:	//Reset
				Temp.setDefault();
				break;
				
		case 8: //Use soil moisture from text field
				SoilMois.setCurrentState(W.getInitialSoilMoisture());
				break;
		case 9: //Use other variables from text fields
				SoilMois.setAmbientState(W.getAmbientSoilMoisture());
				SoilMois.setAmbientRate(W.getAmbientSoilMoisRate());
				SoilMois.setDesiredState(W.getDesiredSoilMoisture());
				SoilMois.setDesiredRate(W.getDesiredSoilMoisRate());
				SoilMois.setUpperBound(W.getSoilMoisUpperBound());
				SoilMois.setLowerBound(W.getSoilMoisLowerBound());
				SoilMois.setRefresh(W.getSoilMoisRefresh());
				break;
		case 10://Run or resume sprinkler thread
				SoilMois.setPauseFalse();
				break;
		case 11://Pause sprinkler thread
				SoilMois.setPauseTrue();
				break;
		case 12://Save
				try{
					writer = new PrintWriter(new FileOutputStream("GreenHouseSprinkler.txt"));
				}catch(FileNotFoundException f){
					System.out.println(f.getMessage());
				}
				writer.println("Initial soil moisture: " + W.getInitialSoilMoisture());
				writer.println("Ambient soil moisture: " + W.getAmbientSoilMoisture());
				writer.println("Ambient rate: " + W.getAmbientSoilMoisRate());
				writer.println("Desired soil moisture: " + W.getDesiredSoilMoisture());
				writer.println("Desired rate: " + W.getDesiredSoilMoisRate());
				writer.println("Soil moisture upper bound: " + W.getSoilMoisUpperBound());
				writer.println("Soil moisture lower bound: " + W.getSoilMoisLowerBound());
				writer.println("Soil moisture Refresh: " + W.getSoilMoisRefresh());
				writer.println("--------");
				writer.println("Current soil moisture: " + W.getLblCurrentSoilMois());
				writer.println("Current rate: " + W.getLblCurrentSoilMoisRate());
				writer.close();
				break;
		case 13://Load
				break;
		case 14://Reset
				SoilMois.setDefault();
				break;
				
		case 15://Use humidity from text field
				Humi.setCurrentState(W.getInitialHumidity());
				break;
		case 16://Use other variables from text fields
				Humi.setAmbientState(W.getAmbientHumidity());
				Humi.setAmbientRate(W.getAmbientHumiRate());
				Humi.setDesiredState(W.getDesiredHumidity());
				Humi.setDesiredRate(W.getDesiredHumiRate());
				Humi.setUpperBound(W.getHumiUpperBound());
				Humi.setLowerBound(W.getHumiLowerBound());
				Humi.setRefresh(W.getHumiRefresh());
				break;
		case 17://Run or resume humidifier thread
				Humi.setPauseFalse();
				break;
		case 18://Pause humidifier thread
				Humi.setPauseTrue();
				break;
		case 19://Save
				try{
					writer = new PrintWriter(new FileOutputStream("GreenHouseHumidifier.txt"));
				}catch(FileNotFoundException f){
					System.out.println(f.getMessage());
				}
				writer.println("Initial humidity: " + W.getInitialHumidity());
				writer.println("Ambient humidity: " + W.getAmbientHumidity());
				writer.println("Ambient rate: " + W.getAmbientHumiRate());
				writer.println("Desired humidity: " + W.getDesiredHumidity());
				writer.println("Desired rate: " + W.getDesiredHumiRate());
				writer.println("Humidity upper bound: " + W.getHumiUpperBound());
				writer.println("Humidity lower bound: " + W.getHumiLowerBound());
				writer.println("Humidity Refresh: " + W.getHumiRefresh());
				writer.println("--------");
				writer.println("Current humidity: " + W.getLblCurrentHumi());
				writer.println("Current rate: " + W.getLblCurrentHumiRate());
				writer.close();
				break;
		case 20://Load
				break;
		case 21://Reset
				Humi.setDefault();
				break;
		}
	}



	
	
	
}
