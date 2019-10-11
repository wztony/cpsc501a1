package Control;

import java.awt.event.*;

public class WindowController implements ActionListener{
	//Create new Controller for temperature, soil moisture, and humidity
	//Set the max and min limit, ie -217C for absolute zero, ie. 0 and 100%
	//for min and max moisture and humidity.
	private Controller temperatureController = new Controller();
	private OneWayController moistureController = new OneWayController();
	private OneWayController humidityController = new OneWayController();
	//Create new Window
	private Window windowGUI = new Window();
	private int eventNumber;
	private WriteCurrentState writer;
	
	//Create new updater of Window. One for each Controller.
	private ThermostatThreadGetter thermostatThreadGetter = new ThermostatThreadGetter();
	private SprinklerThreadGetter sprinklerThreadGetter = new SprinklerThreadGetter();
	private HumidifierThreadGetter humidifierThreadGetter = new HumidifierThreadGetter();
	
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
		
		startTheromstat();
		startSprinkler();
		startHumidifier();
		
		writer = new WriteCurrentState();
	}
	
	public void startTheromstat() {
		//If the controller and updater are not running, start running.
		//If they are already running, do nothing.
		temperatureController.start();
		temperatureController.setStartTrue();
		
		thermostatThreadGetter.start();
		thermostatThreadGetter.setStartTrue();
		
		//Link updater to its controller and set refresh rate
		thermostatThreadGetter.setController(temperatureController);
		thermostatThreadGetter.setWindow(windowGUI);
		thermostatThreadGetter.setDelay((int)temperatureController.getRefresh());
	}
	
	public void startSprinkler() {
		//If the controller and updater are not running, start running.
		//If they are already running, do nothing.
		moistureController.start();
		moistureController.setStartTrue();
		
		sprinklerThreadGetter.start();
		sprinklerThreadGetter.setStartTrue();
		
		//Link updater to its controller and set refresh rate
		sprinklerThreadGetter.setController(moistureController);
		sprinklerThreadGetter.setWindow(windowGUI);
		sprinklerThreadGetter.setDelay((int)moistureController.getRefresh());
	}
	
	public void startHumidifier() {
		//If the controller and updater are not running, start running.
		//If they are already running, do nothing.
		humidityController.start();
		humidityController.setStartTrue();
		
		humidifierThreadGetter.start();
		humidifierThreadGetter.setStartTrue();
		
		//Link updater to its controller and set refresh rate
		humidifierThreadGetter.setController(humidityController);
		humidifierThreadGetter.setWindow(windowGUI);
		humidifierThreadGetter.setDelay((int)humidityController.getRefresh());
	}
	
	public void setTemperature() {
		temperatureController.setCurrentState(windowGUI.getInputTemperature());
	}
	
	public void setThermostatVariables() {
		temperatureController.setAmbientState(windowGUI.getAmbientTemperature());
		temperatureController.setAmbientRate(windowGUI.getAmbientTemperatureRate());
		temperatureController.setDesiredState(windowGUI.getDesiredTemperature());
		temperatureController.setDesiredRate(windowGUI.getDesiredTemperatureRate());
		temperatureController.setDesiredUpperBound(windowGUI.getDesiredTemperatureUpperBound());
		temperatureController.setDesiredLowerBound(windowGUI.getDesiredTemperatureLowerBound());
		temperatureController.setRefresh(windowGUI.getTemperatureRefresh());
	}
	
	public void setMoisture() {
		moistureController.setCurrentState(windowGUI.getInputMoisture());
	}
	
	public void setSprinklerVariables() {
		moistureController.setAmbientState(windowGUI.getAmbientMoisture());
		moistureController.setAmbientRate(windowGUI.getAmbientMoistureRate());
		moistureController.setDesiredState(windowGUI.getDesiredMoisture());
		moistureController.setDesiredRate(windowGUI.getDesiredMoistureRate());
		moistureController.setDesiredUpperBound(windowGUI.getDesiredMoistureUpperBound());
		moistureController.setDesiredLowerBound(windowGUI.getDesiredMoistureLowerBound());
		moistureController.setRefresh(windowGUI.getMoistureRefresh());
	}
	
	public void setHumidity() {
		humidityController.setCurrentState(windowGUI.getInputHumidity());
	}
	
	public void setHumidifierVariables() {
		humidityController.setAmbientState(windowGUI.getAmbientHumidity());
		humidityController.setAmbientRate(windowGUI.getAmbientHumidityRate());
		humidityController.setDesiredState(windowGUI.getDesiredHumidity());
		humidityController.setDesiredRate(windowGUI.getDesiredHumidityRate());
		humidityController.setDesiredUpperBound(windowGUI.getDesiredHumidityUpperBound());
		humidityController.setDesiredLowerBound(windowGUI.getDesiredHumidityLowerBound());
		humidityController.setRefresh(windowGUI.getHumidityRefresh());
	}
	
	public void saveThermostat() {
		writer.setFileForController("GreenHouseThermostat.txt", "temperature");
		double[] thermostatNumbers = {windowGUI.getInputTemperature(), 
				windowGUI.getAmbientTemperature(), 
				windowGUI.getAmbientTemperatureRate(),
				windowGUI.getDesiredTemperature(), 
				windowGUI.getDesiredTemperatureRate(), 
				windowGUI.getDesiredTemperatureUpperBound(), 
				windowGUI.getDesiredTemperatureLowerBound(), 
				windowGUI.getTemperatureRefresh()};
		String[] thermostatTexts = {windowGUI.getTemperatureLabel(), 
				windowGUI.getTemperatureRateLabel()};
		writer.write(thermostatNumbers, thermostatTexts);
	}
	
	public void saveSprinkler() {
		writer.setFileForController("GreenHouseSprinkler.txt", "moisture");
		double[] sprinklerNumbers = {windowGUI.getInputMoisture(), 
				windowGUI.getAmbientMoisture(), 
				windowGUI.getAmbientMoistureRate(),
				windowGUI.getDesiredMoisture(), 
				windowGUI.getDesiredMoistureRate(), 
				windowGUI.getDesiredMoistureUpperBound(), 
				windowGUI.getDesiredMoistureLowerBound(), 
				windowGUI.getMoistureRefresh()};
		String[] sprinklerTexts = {windowGUI.getMoistureLabel(), 
				windowGUI.getMoistureRateLabel()};
		writer.write(sprinklerNumbers, sprinklerTexts);
	}
	
	public void saveHumidifier() {
		writer.setFileForController("GreenHouseHumidifier.txt", "humidity");
		double[] humidifierNumbers = {windowGUI.getInputHumidity(), 
				windowGUI.getAmbientHumidity(), 
				windowGUI.getAmbientHumidityRate(),
				windowGUI.getDesiredHumidity(), 
				windowGUI.getDesiredHumidityRate(), 
				windowGUI.getDesiredHumidityUpperBound(), 
				windowGUI.getDesiredHumidityLowerBound(), 
				windowGUI.getHumidityRefresh()};
		String[] humidifierTexts = {windowGUI.getHumidityLabel(), 
				windowGUI.getHumidityRateLabel()};
		writer.write(humidifierNumbers, humidifierTexts);
	}
	
	public static void main(String[] args) {
		//Create new GUI window
		new WindowController();
	}

	//When any button is pressed
	public void actionPerformed(ActionEvent e) {
		eventNumber = Integer.parseInt(e.getActionCommand());
		//System.out.println(eventNumber);
		
		switch(eventNumber){	
		case 1: //Use temperature from text field
				setTemperature();
				break;
		case 2: //Use other variables from text fields
				setThermostatVariables();
				break;
		case 3: //Run or resume thermostat thread
				temperatureController.setPauseFalse();
				break;
		case 4:	//Pause thermostat thread
				temperatureController.setPauseTrue();				
				break;
		case 5: //Save
				saveThermostat();
				break;
		case 6:	//Load
				break;
		case 7:	//Reset
				temperatureController.setDefault();
				break;
				
		case 8: //Use soil moisture from text field
				setMoisture();
				break;
		case 9: //Use other variables from text fields
				setSprinklerVariables();
				break;
		case 10://Run or resume sprinkler thread
				moistureController.setPauseFalse();
				break;
		case 11://Pause sprinkler thread
				moistureController.setPauseTrue();
				break;
		case 12://Save
				saveSprinkler();
				break;
		case 13://Load
				break;
		case 14://Reset
				moistureController.setDefault();
				break;
				
		case 15://Use humidity from text field
				setHumidity();
				break;
		case 16://Use other variables from text fields
				setHumidifierVariables();
				break;
		case 17://Run or resume humidifier thread
				humidityController.setPauseFalse();
				break;
		case 18://Pause humidifier thread
				humidityController.setPauseTrue();
				break;
		case 19://Save
				saveHumidifier();
				break;
		case 20://Load
				break;
		case 21://Reset
				humidityController.setDefault();
				break;
		}
	}



	
	
	
}
