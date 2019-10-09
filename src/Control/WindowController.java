package Control;

import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WindowController implements ActionListener{
	//Create new Controller for temperature, soil moisture, and humidity
	//Set the max and min limit, ie -217C for absolute zero, ie. 0 and 100%
	//for min and max moisture and humidity.
	private TemperatureController temperatureController = new TemperatureController();
	private SoilMoistureController moistureController = new SoilMoistureController();
	private HumidityController humidityController = new HumidityController();
	//Create new Window
	private Window windowGUI = new Window();
	private int eventNumber;
	private PrintWriter printWriter;
	
	//Create new updater of Window. One for each Controller.
	private ThermostatThreadGetter getTemp = new ThermostatThreadGetter();
	private SprinklerThreadGetter getSoilMois = new SprinklerThreadGetter();
	private HumidifierThreadGetter getHumi = new HumidifierThreadGetter();
	
	//Constructor that activates all action listeners
	public WindowController(){
		windowGUI.temperatureUpdate(this);
		windowGUI.temperatureParametersUpdate(this);
		windowGUI.thermostatRun(this);
		windowGUI.thermostatPause(this);
		windowGUI.thermostatSave(this);
		windowGUI.thermostatLoad(this);
		windowGUI.thermostatReset(this);
		
		windowGUI.moistureUpdate(this);
		windowGUI.moistureParametersUpdate(this);
		windowGUI.sprinklerRun(this);
		windowGUI.sprinklerPause(this);
		windowGUI.sprinklerSave(this);
		windowGUI.sprinklerLoad(this);
		windowGUI.sprinklerReset(this);
		
		windowGUI.humidityUpdate(this);
		windowGUI.humidityParametersUpdate(this);
		windowGUI.humidifierRun(this);
		windowGUI.humidifierPause(this);
		windowGUI.humidifierSave(this);
		windowGUI.humidifierLoad(this);
		windowGUI.humidifierReset(this);
	}
	
	
	
	public static void main(String[] args) {
		//Create new GUI window
		new WindowController();
	}

	//When any button is pressed
	public void actionPerformed(ActionEvent e) {
		eventNumber = Integer.parseInt(e.getActionCommand());
		System.out.println(eventNumber);
		
		//If the controller and updater are not running, start running.
		//If they are already running, do nothing.
		if (!temperatureController.getStart()){
			temperatureController.start();
			temperatureController.setStartTrue();
		}
		if (!getTemp.getStart()){
			getTemp.start();
			getTemp.setStartTrue();
		}
		//Link updater to its controller and set refresh rate
		getTemp.setController(temperatureController);
		getTemp.setWindow(windowGUI);
		getTemp.setDelay((int)temperatureController.getRefresh());
		
		
		//If the controller and updater are not running, start running.
		//If they are already running, do nothing.
		if (!moistureController.getStart()){
			moistureController.start();
			moistureController.setStartTrue();
		}
		if (!getSoilMois.getStart()){
			getSoilMois.start();
			getSoilMois.setStartTrue();
		}
		//Link updater to its controller and set refresh rate
		getSoilMois.setController(moistureController);
		getSoilMois.setWindow(windowGUI);
		getSoilMois.setDelay((int)moistureController.getRefresh());
		
		
		//If the controller and updater are not running, start running.
		//If they are already running, do nothing.
		if (!humidityController.getStart()){
			humidityController.start();
			humidityController.setStartTrue();
		}
		if (!getHumi.getStart()){
			getHumi.start();
			getHumi.setStartTrue();
		}
		//Link updater to its controller and set refresh rate
		getHumi.setController(humidityController);
		getHumi.setWindow(windowGUI);
		getHumi.setDelay((int)humidityController.getRefresh());
		
		
		switch(eventNumber){	
		case 1: //Use temperature from text field
				temperatureController.setCurrentState(windowGUI.getInputTemperature());
				break;
		case 2: //Use other variables from text fields
				temperatureController.setAmbientState(windowGUI.getAmbientTemperature());
				temperatureController.setAmbientRate(windowGUI.getAmbientTemperatureRate());
				temperatureController.setDesiredState(windowGUI.getDesiredTemperatue());
				temperatureController.setDesiredRate(windowGUI.getDesiredTemperatureRate());
				temperatureController.setDesiredUpperBound(windowGUI.getDesiredTemperatureUpperBound());
				temperatureController.setDesiredLowerBound(windowGUI.getDesiredTemperatureLowerBound());
				temperatureController.setRefresh(windowGUI.getTemperatureRefresh());
				break;
		case 3: //Run or resume thermostat thread
				temperatureController.setPauseFalse();
				break;
		case 4:	//Pause thermostat thread
				temperatureController.setPauseTrue();				
				break;
		case 5: //Save
				try{
					printWriter = new PrintWriter(new FileOutputStream("GreenHouseThermostat.txt"));
				}catch(FileNotFoundException f){
					System.out.println(f.getMessage());
				}
				printWriter.println("Initial temperature: " + windowGUI.getInputTemperature());
				printWriter.println("Ambient temperature: " + windowGUI.getAmbientTemperature());
				printWriter.println("Ambient rate: " + windowGUI.getAmbientTemperatureRate());
				printWriter.println("Desired temperature: " + windowGUI.getDesiredTemperatue());
				printWriter.println("Desired rate: " + windowGUI.getDesiredTemperatureRate());
				printWriter.println("Temperature upper bound: " + windowGUI.getDesiredTemperatureUpperBound());
				printWriter.println("Temperature lower bound: " + windowGUI.getDesiredTemperatureLowerBound());
				printWriter.println("Temperature Refresh: " + windowGUI.getTemperatureRefresh());
				printWriter.println("--------");
				printWriter.println("Current temperature: " + windowGUI.getTemperatureLabel());
				printWriter.println("Current rate: " + windowGUI.getTemperatureRate());
				printWriter.close();
				break;
		case 6:	//Load
				break;
		case 7:	//Reset
				temperatureController.setDefault();
				break;
				
		case 8: //Use soil moisture from text field
				moistureController.setCurrentState(windowGUI.getInputMoisture());
				break;
		case 9: //Use other variables from text fields
				moistureController.setAmbientState(windowGUI.getAmbientMoisture());
				moistureController.setAmbientRate(windowGUI.getAmbientMoistureRate());
				moistureController.setDesiredState(windowGUI.getDesiredMoisture());
				moistureController.setDesiredRate(windowGUI.getDesiredMoistureRate());
				moistureController.setDesiredUpperBound(windowGUI.getDesiredMoistureUpperBound());
				moistureController.setDesiredLowerBound(windowGUI.getDesiredMoistureLowerBound());
				moistureController.setRefresh(windowGUI.getMoistureRefresh());
				break;
		case 10://Run or resume sprinkler thread
				moistureController.setPauseFalse();
				break;
		case 11://Pause sprinkler thread
				moistureController.setPauseTrue();
				break;
		case 12://Save
				try{
					printWriter = new PrintWriter(new FileOutputStream("GreenHouseSprinkler.txt"));
				}catch(FileNotFoundException f){
					System.out.println(f.getMessage());
				}
				printWriter.println("Initial soil moisture: " + windowGUI.getInputMoisture());
				printWriter.println("Ambient soil moisture: " + windowGUI.getAmbientMoisture());
				printWriter.println("Ambient rate: " + windowGUI.getAmbientMoistureRate());
				printWriter.println("Desired soil moisture: " + windowGUI.getDesiredMoisture());
				printWriter.println("Desired rate: " + windowGUI.getDesiredMoistureRate());
				printWriter.println("Soil moisture upper bound: " + windowGUI.getDesiredMoistureUpperBound());
				printWriter.println("Soil moisture lower bound: " + windowGUI.getDesiredMoistureLowerBound());
				printWriter.println("Soil moisture Refresh: " + windowGUI.getMoistureRefresh());
				printWriter.println("--------");
				printWriter.println("Current soil moisture: " + windowGUI.getMoistureLabel());
				printWriter.println("Current rate: " + windowGUI.getMoistureRateLabel());
				printWriter.close();
				break;
		case 13://Load
				break;
		case 14://Reset
				moistureController.setDefault();
				break;
				
		case 15://Use humidity from text field
				humidityController.setCurrentState(windowGUI.getInputHumidity());
				break;
		case 16://Use other variables from text fields
				humidityController.setAmbientState(windowGUI.getAmbientHumidity());
				humidityController.setAmbientRate(windowGUI.getAmbientHumidityRate());
				humidityController.setDesiredState(windowGUI.getDesiredHumidity());
				humidityController.setDesiredRate(windowGUI.getDesiredHumidityRate());
				humidityController.setDesiredUpperBound(windowGUI.getDesiredHumidityUpperBound());
				humidityController.setDesiredLowerBound(windowGUI.getDesiredHumidityLowerBound());
				humidityController.setRefresh(windowGUI.getHumidityRefresh());
				break;
		case 17://Run or resume humidifier thread
				humidityController.setPauseFalse();
				break;
		case 18://Pause humidifier thread
				humidityController.setPauseTrue();
				break;
		case 19://Save
				try{
					printWriter = new PrintWriter(new FileOutputStream("GreenHouseHumidifier.txt"));
				}catch(FileNotFoundException f){
					System.out.println(f.getMessage());
				}
				printWriter.println("Initial humidity: " + windowGUI.getInputHumidity());
				printWriter.println("Ambient humidity: " + windowGUI.getAmbientHumidity());
				printWriter.println("Ambient rate: " + windowGUI.getAmbientHumidityRate());
				printWriter.println("Desired humidity: " + windowGUI.getDesiredHumidity());
				printWriter.println("Desired rate: " + windowGUI.getDesiredHumidityRate());
				printWriter.println("Humidity upper bound: " + windowGUI.getDesiredHumidityUpperBound());
				printWriter.println("Humidity lower bound: " + windowGUI.getDesiredHumidityLowerBound());
				printWriter.println("Humidity Refresh: " + windowGUI.getHumidityRefresh());
				printWriter.println("--------");
				printWriter.println("Current humidity: " + windowGUI.getHumidityLabel());
				printWriter.println("Current rate: " + windowGUI.getHumidityRateLabel());
				printWriter.close();
				break;
		case 20://Load
				break;
		case 21://Reset
				humidityController.setDefault();
				break;
		}
	}



	
	
	
}
