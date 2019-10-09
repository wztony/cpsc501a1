package Control;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;


public class Window extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Text fields, sorted by type of controller
	private JTextField fieldInputTemperature,
		fieldAmbientTemperature,
		fieldAmbientTemperatureRate,
		fieldDesiredTemperature,
		fieldDesiredTemperatureRate,
		fieldDesiredTemperatureUpperBound,
		fieldDesiredTemperatureLowerBound,
		fieldTemperatureRefresh,
		fieldThermostatOn,
		fieldThermostatOff,
		fieldAirConditioner,
		fieldHeater,
		
		fieldInputMoisture,
		fieldAmbientMoisture,
		fieldAmbientMoistureRate,
		fieldDesiredMoisture,
		fieldDesiredMoistureRate,
		fieldDesiredMoistureUpperBound,
		fieldDesiredMoistureLowerBound,
		fieldMoistureRefresh,
		fieldSprinklerOn,
		fieldSprinklerOff,
		
		fieldInputHumidity,
		fieldAmbientHumidity,
		fieldAmbientHumidityRate,
		fieldDesiredHumidity,
		fieldDesiredHumidityRate,
		fieldDesiredHumidityUpperBound,
		fieldDesiredHumidityLowerBound,
		fieldHumidityRefresh,
		fieldHumidifierOn,
		fieldHumidifierOff;
	//Labels, sorted by type of controller
	private JLabel labelThermostat,
		labelInputTemperature,
		labelAmbientTemperature1,
		labelAmbientTemperature2,
		labelAmbientTemperatureRate,
		labelDesiredTemperature1,
		labelDesiredTemperature2,
		labelDesiredTemperatureRate,
		labelTemperatureRange,
		labelTemperatureUpperBound,
		labelTemperatureLowerBound,
		labelTemperatureRefresh,
		labelCurrentTemperature,
		labelTemperature,
		labelTemperatureUpdateRate,
		labelTemperatureLimit,
		labelTemperatureUpperLimit,
		labelTemperatureLowerLimit,
		
		labelSprinkler,
		labelInputMoisture,
		labelAmbientMoisture1,
		labelAmbientMoisture2,
		labelAmbientMoistureRate,
		labelDesiredMoisture1,
		labelDesiredMoisture2,
		labelDesiredMoistureRate,
		labelMoistureRange,
		labelMoistureUpperBound,
		labelMoistureLowerBound,
		labelMoistureRefresh,
		labelCurrentMoisture,
		labelMoisture,
		labelMoistureUpdateRate,
		labelMoistureLimit,
		labelMoistureUpperLimit,
		labelMoistureLowerLimit,
		
		labelHumidifier,
		labelInputHumidity,
		labelAmbientHumidity1,
		labelAmbientHumidity2,
		labelAmbientHumidityRate,
		labelDesiredHumidity1,
		labelDesiredHumidity2,
		labelDesiredHumidityRate,
		labelHumidityRange,
		labelHumidityUpperBound,
		labelHumidityLowerBound,
		labelHumidityRefresh,
		labelCurrentHumidity,
		labelHumidity,
		labelHumidityUpdateRate,
		labelHumidityLimit,
		labelHumidityUpperLimit,
		labelHumidityLowerLimit;
	//Buttons, sorted by the type of controller
	private JButton buttonSetInputTemperature,
		buttonSetTemperatureParameters,
		buttonThermostatRun,
		buttonThermostatPause,
		buttonThermostatSave,
		buttonThermostatLoad,
		buttonThermostatReset,
		
		buttonSetInputMoisture,
		buttonSetMoistureParameters,
		buttonSprinklerRun,
		buttonSprinklerPause,
		buttonSprinklerSave,
		buttonSprinklerLoad,
		buttonSprinklerReset,
		
		buttonSetInputHumidity,
		buttonSetHumidityParameters,
		buttonHumidifierRun,
		buttonHumidifierPause,
		buttonHumidifierSave,
		buttonHumidifierLoad,
		buttonHumidifierReset;
	//Background panels 
	private JPanel panelThermostat,
		panelSprinkler,
		panelHumidifier;
	
	//Creates GUI window with text fields, labels, buttons, and panels.
	public Window() {
		this.setVisible(true);
		this.setTitle("GreenhouseControlSimulator.gui");
		this.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.getContentPane().setBackground(Color.WHITE);
		this.setBounds(100, 100, 900, 947);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		
		//Temperature***********************************************Temperature
		//Temperature Text Field
		fieldInputTemperature = new JTextField();
		fieldInputTemperature.setBackground(new Color(245, 245, 245));
		fieldInputTemperature.setBounds(210, 46, 50, 24);
		this.getContentPane().add(fieldInputTemperature);
		fieldInputTemperature.setColumns(10);
		fieldInputTemperature.setVisible(true);
		
		fieldAmbientTemperature = new JTextField();
		fieldAmbientTemperature.setBackground(new Color(245, 245, 245));
		fieldAmbientTemperature.setBounds(210, 96, 50, 24);
		this.getContentPane().add(fieldAmbientTemperature);
		fieldAmbientTemperature.setColumns(10);
		fieldAmbientTemperature.setVisible(true);
		
		fieldAmbientTemperatureRate = new JTextField();
		fieldAmbientTemperatureRate.setBackground(new Color(245, 245, 245));
		fieldAmbientTemperatureRate.setBounds(360, 96, 50, 24);
		this.getContentPane().add(fieldAmbientTemperatureRate);
		fieldAmbientTemperatureRate.setColumns(10);
		fieldAmbientTemperatureRate.setVisible(true);
		
		fieldDesiredTemperature = new JTextField();
		fieldDesiredTemperature.setBackground(new Color(245, 245, 245));
		fieldDesiredTemperature.setBounds(210, 146, 50, 24);
		this.getContentPane().add(fieldDesiredTemperature);
		fieldDesiredTemperature.setColumns(10);
		fieldDesiredTemperature.setVisible(true);
		
		fieldDesiredTemperatureRate = new JTextField();
		fieldDesiredTemperatureRate.setBackground(new Color(245, 245, 245));
		fieldDesiredTemperatureRate.setBounds(360, 146, 50, 24);
		this.getContentPane().add(fieldDesiredTemperatureRate);
		fieldDesiredTemperatureRate.setColumns(10);
		fieldDesiredTemperatureRate.setVisible(true);
		
		fieldDesiredTemperatureUpperBound = new JTextField();
		fieldDesiredTemperatureUpperBound.setBackground(new Color(245, 245, 245));
		fieldDesiredTemperatureUpperBound.setBounds(210, 202, 50, 24);
		this.getContentPane().add(fieldDesiredTemperatureUpperBound);
		fieldDesiredTemperatureUpperBound.setColumns(10);
		fieldDesiredTemperatureUpperBound.setVisible(true);
		
		fieldDesiredTemperatureLowerBound = new JTextField();
		fieldDesiredTemperatureLowerBound.setBackground(new Color(245, 245, 245));
		fieldDesiredTemperatureLowerBound.setBounds(210, 226, 50, 24);
		this.getContentPane().add(fieldDesiredTemperatureLowerBound);
		fieldDesiredTemperatureLowerBound.setColumns(10);
		fieldDesiredTemperatureLowerBound.setVisible(true);
		
		fieldTemperatureRefresh = new JTextField();
		fieldTemperatureRefresh.setBackground(new Color(245, 245, 245));
		fieldTemperatureRefresh.setBounds(210, 256, 50, 24);
		this.getContentPane().add(fieldTemperatureRefresh);
		fieldTemperatureRefresh.setColumns(10);
		fieldTemperatureRefresh.setVisible(true);
		
		fieldThermostatOn = new JTextField();
		fieldThermostatOn.setEditable(false);
		fieldThermostatOn.setText("On");
		fieldThermostatOn.setBackground(Color.WHITE);
		fieldThermostatOn.setBounds(660, 46, 40, 24);
		this.getContentPane().add(fieldThermostatOn);
		fieldThermostatOn.setColumns(10);
		fieldThermostatOn.setVisible(true);
		
		fieldThermostatOff = new JTextField();
		fieldThermostatOff.setEditable(false);
		fieldThermostatOff.setText("Off");
		fieldThermostatOff.setBackground(Color.RED);
		fieldThermostatOff.setBounds(700, 46, 40, 24);
		this.getContentPane().add(fieldThermostatOff);
		fieldThermostatOff.setColumns(10);
		fieldThermostatOff.setVisible(true);
		
		fieldAirConditioner = new JTextField();
		fieldAirConditioner.setEditable(false);
		fieldAirConditioner.setText("A/C");
		fieldAirConditioner.setBackground(Color.WHITE);
		fieldAirConditioner.setBounds(760, 46, 45, 24);
		this.getContentPane().add(fieldAirConditioner);
		fieldAirConditioner.setColumns(10);
		fieldAirConditioner.setVisible(true);
		
		fieldHeater = new JTextField();
		fieldHeater.setEditable(false);
		fieldHeater.setText("Heater");
		fieldHeater.setBackground(Color.WHITE);
		fieldHeater.setBounds(805, 46, 45, 24);
		this.getContentPane().add(fieldHeater);
		fieldHeater.setColumns(10);
		fieldHeater.setVisible(true);
		//Temperature Text Field
		
		//Temperature Label
		labelThermostat = new JLabel("Thermostat");
		labelThermostat.setFont(new Font("Tahoma", Font.BOLD, 20));
		labelThermostat.setHorizontalAlignment(SwingConstants.CENTER);
		labelThermostat.setBounds(0, 8, 900, 36);
		this.getContentPane().add(labelThermostat);
		labelThermostat.setVisible(true);
		
		labelInputTemperature = new JLabel("Temperature(" + "\u00b0" + "C)");
		labelInputTemperature.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelInputTemperature.setBounds(60, 40, 190, 35);
		this.getContentPane().add(labelInputTemperature);
		
		labelAmbientTemperature1 = new JLabel("Ambient");
		labelAmbientTemperature1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelAmbientTemperature1.setBounds(60, 70, 190, 35);
		this.getContentPane().add(labelAmbientTemperature1);
		
		labelAmbientTemperature2 = new JLabel("Temperature(" + "\u00b0" + "C)");
		labelAmbientTemperature2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelAmbientTemperature2.setBounds(60, 90, 190, 35);
		this.getContentPane().add(labelAmbientTemperature2);
		
		labelAmbientTemperatureRate = new JLabel("Rate(" + "\u00b0" + "C/m)");
		labelAmbientTemperatureRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelAmbientTemperatureRate.setBounds(280, 90, 190, 35);
		this.getContentPane().add(labelAmbientTemperatureRate);
		
		labelDesiredTemperature1 = new JLabel("Want");
		labelDesiredTemperature1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelDesiredTemperature1.setBounds(60, 120, 190, 35);
		this.getContentPane().add(labelDesiredTemperature1);
		
		labelDesiredTemperature2 = new JLabel("Temperature(" + "\u00b0" + "C)");
		labelDesiredTemperature2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelDesiredTemperature2.setBounds(60, 140, 190, 35);
		this.getContentPane().add(labelDesiredTemperature2);
		
		labelDesiredTemperatureRate = new JLabel("Rate(" + "\u00b0" + "C/m)");
		labelDesiredTemperatureRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelDesiredTemperatureRate.setBounds(280, 140, 190, 35);
		this.getContentPane().add(labelDesiredTemperatureRate);
		
		labelTemperatureRange = new JLabel("Range");
		labelTemperatureRange.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelTemperatureRange.setBounds(60, 170, 190, 35);
		this.getContentPane().add(labelTemperatureRange);
		
		labelTemperatureUpperBound = new JLabel("Upper allowance(" + "\u00b0" + "C)");
		labelTemperatureUpperBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelTemperatureUpperBound.setBounds(60, 195, 190, 35);
		this.getContentPane().add(labelTemperatureUpperBound);
		
		labelTemperatureLowerBound = new JLabel("Lower allowance(" + "\u00b0" + "C)");
		labelTemperatureLowerBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelTemperatureLowerBound.setBounds(60, 220, 190, 35);
		this.getContentPane().add(labelTemperatureLowerBound);
		
		labelTemperatureRefresh = new JLabel("Update rate(s)");
		labelTemperatureRefresh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelTemperatureRefresh.setBounds(60, 250, 190, 35);
		this.getContentPane().add(labelTemperatureRefresh);
		
		labelCurrentTemperature = new JLabel("Current temperature:");
		labelCurrentTemperature.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelCurrentTemperature.setBounds(660, 85, 210, 35);
		this.getContentPane().add(labelCurrentTemperature);
		
		labelTemperature = new JLabel("0.0000" + "\u00b0" + "C");
		labelTemperature.setFont(new Font("Tahoma", Font.PLAIN, 34));
		labelTemperature.setBounds(660, 120, 190, 35);
		this.getContentPane().add(labelTemperature);
		
		labelTemperatureUpdateRate = new JLabel("+0.0000" + "\u00b0" + "C/s");
		labelTemperatureUpdateRate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelTemperatureUpdateRate.setBounds(675, 150, 190, 35);
		this.getContentPane().add(labelTemperatureUpdateRate);
		
		labelTemperatureLimit = new JLabel("Limit:");
		labelTemperatureLimit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelTemperatureLimit.setBounds(660, 190, 190, 35);
		this.getContentPane().add(labelTemperatureLimit);
		
		labelTemperatureUpperLimit = new JLabel("0.0000" + "\u00b0" + "C");
		labelTemperatureUpperLimit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelTemperatureUpperLimit.setBounds(720, 220, 190, 35);
		this.getContentPane().add(labelTemperatureUpperLimit);
		
		labelTemperatureLowerLimit = new JLabel("0.0000" + "\u00b0" + "C");
		labelTemperatureLowerLimit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelTemperatureLowerLimit.setBounds(720, 190, 190, 35);
		this.getContentPane().add(labelTemperatureLowerLimit);
		//Temperature Label
		
		//Temperature Button
		buttonSetInputTemperature = new JButton("Set As Temperature");
		buttonSetInputTemperature.setBounds(280, 46, 150, 25);
		buttonSetInputTemperature.setActionCommand("1");
		this.getContentPane().add(buttonSetInputTemperature);
		
		buttonSetTemperatureParameters = new JButton("Update Variables");
		buttonSetTemperatureParameters.setBounds(280, 256, 150, 25);
		buttonSetTemperatureParameters.setActionCommand("2");
		this.getContentPane().add(buttonSetTemperatureParameters);
		
		buttonThermostatRun = new JButton("Run");
		buttonThermostatRun.setBounds(500, 46, 70, 25);
		buttonThermostatRun.setActionCommand("3");
		this.getContentPane().add(buttonThermostatRun);
		
		buttonThermostatPause = new JButton("Pause");
		buttonThermostatPause.setBounds(500, 98, 70, 25);
		buttonThermostatPause.setActionCommand("4");
		this.getContentPane().add(buttonThermostatPause);
		
		buttonThermostatSave = new JButton("Save");
		buttonThermostatSave.setBounds(500, 150, 70, 25);
		buttonThermostatSave.setActionCommand("5");
		this.getContentPane().add(buttonThermostatSave);
		
		buttonThermostatLoad = new JButton("Load");
		buttonThermostatLoad.setBounds(500, 202, 70, 25);
		buttonThermostatLoad.setActionCommand("6");
		this.getContentPane().add(buttonThermostatLoad);
		
		buttonThermostatReset = new JButton("Reset");
		buttonThermostatReset.setBounds(500, 256, 70, 25);
		buttonThermostatReset.setActionCommand("7");
		this.getContentPane().add(buttonThermostatReset);
		//Temperature Button
		
		//Temperature Panel
		panelThermostat = new JPanel();
		panelThermostat.setBackground(new Color(240, 128, 128));
		panelThermostat.setBounds(0, 0, 900, 300);
		getContentPane().add(panelThermostat);
		panelThermostat.setLayout(null);
		//Temperature Panel
		//Temperature***********************************************Temperature
		
		//SoilMoisture*********************************************SoilMoisture
		//Soil Moisture Text Field
		fieldInputMoisture = new JTextField();
		fieldInputMoisture.setBackground(new Color(245, 245, 245));
		fieldInputMoisture.setBounds(465, 346, 50, 24);
		this.getContentPane().add(fieldInputMoisture);
		fieldInputMoisture.setColumns(10);
		fieldInputMoisture.setVisible(true);
		
		fieldAmbientMoisture = new JTextField();
		fieldAmbientMoisture.setBackground(new Color(245, 245, 245));
		fieldAmbientMoisture.setBounds(465, 396, 50, 24);
		this.getContentPane().add(fieldAmbientMoisture);
		fieldAmbientMoisture.setColumns(10);
		fieldAmbientMoisture.setVisible(true);
		
		fieldAmbientMoistureRate = new JTextField();
		fieldAmbientMoistureRate.setBackground(new Color(245, 245, 245));
		fieldAmbientMoistureRate.setBounds(615, 396, 50, 24);
		this.getContentPane().add(fieldAmbientMoistureRate);
		fieldAmbientMoistureRate.setColumns(10);
		fieldAmbientMoistureRate.setVisible(true);
		
		fieldDesiredMoisture = new JTextField();
		fieldDesiredMoisture.setBackground(new Color(245, 245, 245));
		fieldDesiredMoisture.setBounds(465, 446, 50, 24);
		this.getContentPane().add(fieldDesiredMoisture);
		fieldDesiredMoisture.setColumns(10);
		fieldDesiredMoisture.setVisible(true);
		
		fieldDesiredMoistureRate = new JTextField();
		fieldDesiredMoistureRate.setBackground(new Color(245, 245, 245));
		fieldDesiredMoistureRate.setBounds(615, 446, 50, 24);
		this.getContentPane().add(fieldDesiredMoistureRate);
		fieldDesiredMoistureRate.setColumns(10);
		fieldDesiredMoistureRate.setVisible(true);
		
		fieldDesiredMoistureUpperBound = new JTextField();
		fieldDesiredMoistureUpperBound.setBackground(new Color(245, 245, 245));
		fieldDesiredMoistureUpperBound.setBounds(465, 502, 50, 24);
		this.getContentPane().add(fieldDesiredMoistureUpperBound);
		fieldDesiredMoistureUpperBound.setColumns(10);
		fieldDesiredMoistureUpperBound.setVisible(true);
		
		fieldDesiredMoistureLowerBound = new JTextField();
		fieldDesiredMoistureLowerBound.setBackground(new Color(245, 245, 245));
		fieldDesiredMoistureLowerBound.setBounds(465, 526, 50, 24);
		this.getContentPane().add(fieldDesiredMoistureLowerBound);
		fieldDesiredMoistureLowerBound.setColumns(10);
		fieldDesiredMoistureLowerBound.setVisible(true);
		
		fieldMoistureRefresh = new JTextField();
		fieldMoistureRefresh.setBackground(new Color(245, 245, 245));
		fieldMoistureRefresh.setBounds(465, 556, 50, 24);
		this.getContentPane().add(fieldMoistureRefresh);
		fieldMoistureRefresh.setColumns(10);
		fieldMoistureRefresh.setVisible(true);
		
		fieldSprinklerOn = new JTextField();
		fieldSprinklerOn.setEditable(false);
		fieldSprinklerOn.setText("On");
		fieldSprinklerOn.setBackground(Color.WHITE);
		fieldSprinklerOn.setBounds(53, 346, 40, 24);
		this.getContentPane().add(fieldSprinklerOn);
		fieldSprinklerOn.setColumns(10);
		fieldSprinklerOn.setVisible(true);
		
		fieldSprinklerOff = new JTextField();
		fieldSprinklerOff.setEditable(false);
		fieldSprinklerOff.setText("Off");
		fieldSprinklerOff.setBackground(Color.RED);
		fieldSprinklerOff.setBounds(93, 346, 40, 24);
		this.getContentPane().add(fieldSprinklerOff);
		fieldSprinklerOff.setColumns(10);
		fieldSprinklerOff.setVisible(true);
		//Soil Moisture Text Field
		
		//Soil Moisture Label
		labelSprinkler = new JLabel("Sprinkler");
		labelSprinkler.setFont(new Font("Tahoma", Font.BOLD, 20));
		labelSprinkler.setHorizontalAlignment(SwingConstants.CENTER);
		labelSprinkler.setBounds(0, 308, 900, 36);
		this.getContentPane().add(labelSprinkler);
		labelSprinkler.setVisible(true);
		
		labelInputMoisture = new JLabel("Soil saturation(%)");
		labelInputMoisture.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelInputMoisture.setBounds(315, 340, 190, 35);
		this.getContentPane().add(labelInputMoisture);
		
		labelAmbientMoisture1 = new JLabel("Ambient");
		labelAmbientMoisture1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelAmbientMoisture1.setBounds(315, 370, 190, 35);
		this.getContentPane().add(labelAmbientMoisture1);
		
		labelAmbientMoisture2 = new JLabel("Soil saturation(%)");
		labelAmbientMoisture2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelAmbientMoisture2.setBounds(315, 390, 190, 35);
		this.getContentPane().add(labelAmbientMoisture2);
		
		labelAmbientMoistureRate = new JLabel("Rate(%/m)");
		labelAmbientMoistureRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelAmbientMoistureRate.setBounds(534, 390, 190, 35);
		this.getContentPane().add(labelAmbientMoistureRate);
		
		labelDesiredMoisture1 = new JLabel("Want");
		labelDesiredMoisture1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelDesiredMoisture1.setBounds(315, 420, 190, 35);
		this.getContentPane().add(labelDesiredMoisture1);
		
		labelDesiredMoisture2 = new JLabel("Saturation(%)");
		labelDesiredMoisture2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelDesiredMoisture2.setBounds(315, 440, 190, 35);
		this.getContentPane().add(labelDesiredMoisture2);
		
		labelDesiredMoistureRate = new JLabel("Rate(%/m)");
		labelDesiredMoistureRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelDesiredMoistureRate.setBounds(535, 440, 190, 35);
		this.getContentPane().add(labelDesiredMoistureRate);
		
		labelMoistureRange = new JLabel("Range");
		labelMoistureRange.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelMoistureRange.setBounds(315, 470, 190, 35);
		this.getContentPane().add(labelMoistureRange);
		
		labelMoistureUpperBound = new JLabel("Upper allowance(%)");
		labelMoistureUpperBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelMoistureUpperBound.setBounds(315, 495, 190, 35);
		this.getContentPane().add(labelMoistureUpperBound);
		
		labelMoistureLowerBound = new JLabel("Lower allowance(%)");
		labelMoistureLowerBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelMoistureLowerBound.setBounds(315, 520, 190, 35);
		this.getContentPane().add(labelMoistureLowerBound);
		
		labelMoistureRefresh = new JLabel("Update rate(s)");
		labelMoistureRefresh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelMoistureRefresh.setBounds(315, 550, 190, 35);
		this.getContentPane().add(labelMoistureRefresh);
		
		labelCurrentMoisture = new JLabel("Current soil moisture:");
		labelCurrentMoisture.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelCurrentMoisture.setBounds(53, 385, 210, 35);
		this.getContentPane().add(labelCurrentMoisture);
		
		labelMoisture = new JLabel("0.0000%");
		labelMoisture.setFont(new Font("Tahoma", Font.PLAIN, 34));
		labelMoisture.setBounds(53, 420, 190, 35);
		this.getContentPane().add(labelMoisture);
		
		labelMoistureUpdateRate = new JLabel("+0.0000%/s");
		labelMoistureUpdateRate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelMoistureUpdateRate.setBounds(68, 450, 190, 35);
		this.getContentPane().add(labelMoistureUpdateRate);
		
		labelMoistureLimit = new JLabel("Limit:");
		labelMoistureLimit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelMoistureLimit.setBounds(53, 490, 190, 35);
		this.getContentPane().add(labelMoistureLimit);
		
		labelMoistureUpperLimit = new JLabel("0.0000%");
		labelMoistureUpperLimit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelMoistureUpperLimit.setBounds(113, 520, 190, 35);
		this.getContentPane().add(labelMoistureUpperLimit);
		
		labelMoistureLowerLimit = new JLabel("0.0000%");
		labelMoistureLowerLimit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelMoistureLowerLimit.setBounds(113, 490, 190, 35);
		this.getContentPane().add(labelMoistureLowerLimit);
		//Soil Moisture Label
		
		//Soil Moisture Button
		buttonSetInputMoisture = new JButton("Set As Saturation");
		buttonSetInputMoisture.setBounds(535, 346, 150, 25);
		buttonSetInputMoisture.setActionCommand("8");
		this.getContentPane().add(buttonSetInputMoisture);
		
		buttonSetMoistureParameters = new JButton("Update Variables");
		buttonSetMoistureParameters.setBounds(535, 556, 150, 25);
		buttonSetMoistureParameters.setActionCommand("9");
		this.getContentPane().add(buttonSetMoistureParameters);
		
		buttonSprinklerRun = new JButton("Run");
		buttonSprinklerRun.setBounds(725, 346, 70, 25);
		buttonSprinklerRun.setActionCommand("10");
		this.getContentPane().add(buttonSprinklerRun);
		
		buttonSprinklerPause = new JButton("Pause");
		buttonSprinklerPause.setBounds(725, 398, 70, 25);
		buttonSprinklerPause.setActionCommand("11");
		this.getContentPane().add(buttonSprinklerPause);
		
		buttonSprinklerSave = new JButton("Save");
		buttonSprinklerSave.setBounds(725, 450, 70, 25);
		buttonSprinklerSave.setActionCommand("12");
		this.getContentPane().add(buttonSprinklerSave);
		
		buttonSprinklerLoad = new JButton("Load");
		buttonSprinklerLoad.setBounds(725, 502, 70, 25);
		buttonSprinklerLoad.setActionCommand("13");
		this.getContentPane().add(buttonSprinklerLoad);
		
		buttonSprinklerReset = new JButton("Reset");
		buttonSprinklerReset.setBounds(725, 556, 70, 25);
		buttonSprinklerReset.setActionCommand("14");
		this.getContentPane().add(buttonSprinklerReset);
		//Soil Moisture Button
		
		//Soil Moisture Panel
		panelSprinkler = new JPanel();
		panelSprinkler.setBackground(new Color(152, 251, 152));
		panelSprinkler.setBounds(0, 300, 900, 300);
		getContentPane().add(panelSprinkler);
		panelSprinkler.setLayout(null);
		//Soil Moisture Panel
		//SoilMoisture*********************************************SoilMoisture
		
		//Humidity*****************************************************Humidity
		//Humidity Text Field
		fieldInputHumidity = new JTextField();
		fieldInputHumidity.setBackground(new Color(245, 245, 245));
		fieldInputHumidity.setBounds(210, 646, 50, 24);
		this.getContentPane().add(fieldInputHumidity);
		fieldInputHumidity.setColumns(10);
		fieldInputHumidity.setVisible(true);
		
		fieldAmbientHumidity = new JTextField();
		fieldAmbientHumidity.setBackground(new Color(245, 245, 245));
		fieldAmbientHumidity.setBounds(210, 696, 50, 24);
		this.getContentPane().add(fieldAmbientHumidity);
		fieldAmbientHumidity.setColumns(10);
		fieldAmbientHumidity.setVisible(true);
		
		fieldAmbientHumidityRate = new JTextField();
		fieldAmbientHumidityRate.setBackground(new Color(245, 245, 245));
		fieldAmbientHumidityRate.setBounds(360, 696, 50, 24);
		this.getContentPane().add(fieldAmbientHumidityRate);
		fieldAmbientHumidityRate.setColumns(10);
		fieldAmbientHumidityRate.setVisible(true);
		
		fieldDesiredHumidity = new JTextField();
		fieldDesiredHumidity.setBackground(new Color(245, 245, 245));
		fieldDesiredHumidity.setBounds(210, 746, 50, 24);
		this.getContentPane().add(fieldDesiredHumidity);
		fieldDesiredHumidity.setColumns(10);
		fieldDesiredHumidity.setVisible(true);
		
		fieldDesiredHumidityRate = new JTextField();
		fieldDesiredHumidityRate.setBackground(new Color(245, 245, 245));
		fieldDesiredHumidityRate.setBounds(360, 746, 50, 24);
		this.getContentPane().add(fieldDesiredHumidityRate);
		fieldDesiredHumidityRate.setColumns(10);
		fieldDesiredHumidityRate.setVisible(true);
		
		fieldDesiredHumidityUpperBound = new JTextField();
		fieldDesiredHumidityUpperBound.setBackground(new Color(245, 245, 245));
		fieldDesiredHumidityUpperBound.setBounds(210, 802, 50, 24);
		this.getContentPane().add(fieldDesiredHumidityUpperBound);
		fieldDesiredHumidityUpperBound.setColumns(10);
		fieldDesiredHumidityUpperBound.setVisible(true);
		
		fieldDesiredHumidityLowerBound = new JTextField();
		fieldDesiredHumidityLowerBound.setBackground(new Color(245, 245, 245));
		fieldDesiredHumidityLowerBound.setBounds(210, 826, 50, 24);
		this.getContentPane().add(fieldDesiredHumidityLowerBound);
		fieldDesiredHumidityLowerBound.setColumns(10);
		fieldDesiredHumidityLowerBound.setVisible(true);
		
		fieldHumidityRefresh = new JTextField();
		fieldHumidityRefresh.setBackground(new Color(245, 245, 245));
		fieldHumidityRefresh.setBounds(210, 856, 50, 24);
		this.getContentPane().add(fieldHumidityRefresh);
		fieldHumidityRefresh.setColumns(10);
		fieldHumidityRefresh.setVisible(true);
		
		fieldHumidifierOn = new JTextField();
		fieldHumidifierOn.setEditable(false);
		fieldHumidifierOn.setText("On");
		fieldHumidifierOn.setBackground(Color.WHITE);
		fieldHumidifierOn.setBounds(660, 646, 40, 24);
		this.getContentPane().add(fieldHumidifierOn);
		fieldHumidifierOn.setColumns(10);
		fieldHumidifierOn.setVisible(true);
		
		fieldHumidifierOff = new JTextField();
		fieldHumidifierOff.setEditable(false);
		fieldHumidifierOff.setText("Off");
		fieldHumidifierOff.setBackground(Color.RED);
		fieldHumidifierOff.setBounds(700, 646, 40, 24);
		this.getContentPane().add(fieldHumidifierOff);
		fieldHumidifierOff.setColumns(10);
		fieldHumidifierOff.setVisible(true);
		//Humidity Text Field
		
		//Humidity Label
		labelHumidifier = new JLabel("Humidifier");
		labelHumidifier.setFont(new Font("Tahoma", Font.BOLD, 20));
		labelHumidifier.setHorizontalAlignment(SwingConstants.CENTER);
		labelHumidifier.setBounds(0, 608, 900, 36);
		this.getContentPane().add(labelHumidifier);
		labelHumidifier.setVisible(true);
		
		labelInputHumidity = new JLabel("Humidity(%)");
		labelInputHumidity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelInputHumidity.setBounds(60, 640, 190, 35);
		this.getContentPane().add(labelInputHumidity);
		
		labelAmbientHumidity1 = new JLabel("Ambient");
		labelAmbientHumidity1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelAmbientHumidity1.setBounds(60, 670, 190, 35);
		this.getContentPane().add(labelAmbientHumidity1);
		
		labelAmbientHumidity2 = new JLabel("Humidity(%)");
		labelAmbientHumidity2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelAmbientHumidity2.setBounds(60, 690, 190, 35);
		this.getContentPane().add(labelAmbientHumidity2);
		
		labelAmbientHumidityRate = new JLabel("Rate(%/m)");
		labelAmbientHumidityRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelAmbientHumidityRate.setBounds(280, 690, 190, 35);
		this.getContentPane().add(labelAmbientHumidityRate);
		
		labelDesiredHumidity1 = new JLabel("Want");
		labelDesiredHumidity1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelDesiredHumidity1.setBounds(60, 720, 190, 35);
		this.getContentPane().add(labelDesiredHumidity1);
		
		labelDesiredHumidity2 = new JLabel("Humidity(%)");
		labelDesiredHumidity2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelDesiredHumidity2.setBounds(60, 740, 190, 35);
		this.getContentPane().add(labelDesiredHumidity2);
		
		labelDesiredHumidityRate = new JLabel("Rate(%/m)");
		labelDesiredHumidityRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelDesiredHumidityRate.setBounds(280, 740, 190, 35);
		this.getContentPane().add(labelDesiredHumidityRate);
		
		labelHumidityRange = new JLabel("Range");
		labelHumidityRange.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelHumidityRange.setBounds(60, 770, 190, 35);
		this.getContentPane().add(labelHumidityRange);
		
		labelHumidityUpperBound = new JLabel("Upper allowance(%)");
		labelHumidityUpperBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelHumidityUpperBound.setBounds(60, 795, 190, 35);
		this.getContentPane().add(labelHumidityUpperBound);
		
		labelHumidityLowerBound = new JLabel("Lower allowance(%)");
		labelHumidityLowerBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelHumidityLowerBound.setBounds(60, 820, 190, 35);
		this.getContentPane().add(labelHumidityLowerBound);
		
		labelHumidityRefresh = new JLabel("Update rate(s)");
		labelHumidityRefresh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelHumidityRefresh.setBounds(60, 850, 190, 35);
		this.getContentPane().add(labelHumidityRefresh);
		
		labelCurrentHumidity = new JLabel("Current humidity:");
		labelCurrentHumidity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelCurrentHumidity.setBounds(660, 685, 210, 35);
		this.getContentPane().add(labelCurrentHumidity);
		
		labelHumidity = new JLabel("0.0000%");
		labelHumidity.setFont(new Font("Tahoma", Font.PLAIN, 34));
		labelHumidity.setBounds(660, 720, 190, 35);
		this.getContentPane().add(labelHumidity);
		
		labelHumidityUpdateRate = new JLabel("+0.0000%/s");
		labelHumidityUpdateRate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelHumidityUpdateRate.setBounds(675, 750, 190, 35);
		this.getContentPane().add(labelHumidityUpdateRate);
		
		labelHumidityLimit = new JLabel("Limit:");
		labelHumidityLimit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelHumidityLimit.setBounds(660, 790, 190, 35);
		this.getContentPane().add(labelHumidityLimit);
		
		labelHumidityUpperLimit = new JLabel("0.0000%");
		labelHumidityUpperLimit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelHumidityUpperLimit.setBounds(720, 820, 190, 35);
		this.getContentPane().add(labelHumidityUpperLimit);
		
		labelHumidityLowerLimit = new JLabel("0.0000%");
		labelHumidityLowerLimit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelHumidityLowerLimit.setBounds(720, 790, 190, 35);
		this.getContentPane().add(labelHumidityLowerLimit);
		//Humidity Label

		//Humidity Button
		buttonSetInputHumidity = new JButton("Set As Humidity");
		buttonSetInputHumidity.setBounds(280, 646, 150, 25);
		buttonSetInputHumidity.setActionCommand("15");
		this.getContentPane().add(buttonSetInputHumidity);
		
		buttonSetHumidityParameters = new JButton("Update Variables");
		buttonSetHumidityParameters.setBounds(280, 856, 150, 25);
		buttonSetHumidityParameters.setActionCommand("16");
		this.getContentPane().add(buttonSetHumidityParameters);
		
		buttonHumidifierRun = new JButton("Run");
		buttonHumidifierRun.setBounds(500, 646, 70, 25);
		buttonHumidifierRun.setActionCommand("17");
		this.getContentPane().add(buttonHumidifierRun);
		
		buttonHumidifierPause = new JButton("Pause");
		buttonHumidifierPause.setBounds(500, 698, 70, 25);
		buttonHumidifierPause.setActionCommand("18");
		this.getContentPane().add(buttonHumidifierPause);
		
		buttonHumidifierSave = new JButton("Save");
		buttonHumidifierSave.setBounds(500, 750, 70, 25);
		buttonHumidifierSave.setActionCommand("19");
		this.getContentPane().add(buttonHumidifierSave);
		
		buttonHumidifierLoad = new JButton("Load");
		buttonHumidifierLoad.setBounds(500, 802, 70, 25);
		buttonHumidifierLoad.setActionCommand("20");
		this.getContentPane().add(buttonHumidifierLoad);
		
		buttonHumidifierReset = new JButton("Reset");
		buttonHumidifierReset.setBounds(500, 856, 70, 25);
		buttonHumidifierReset.setActionCommand("21");
		this.getContentPane().add(buttonHumidifierReset);
		//Humidity Button
		
		//Humidity Panel
		panelHumidifier = new JPanel();
		panelHumidifier.setBackground(new Color(135, 206, 250));
		panelHumidifier.setBounds(0, 600, 900, 300);
		getContentPane().add(panelHumidifier);
		panelHumidifier.setLayout(null);
		//Humidity Panel
		//Humidity*****************************************************Humidity
	}
	
	//Getters for Thermostat text fields
	/**
	 * method to get the temperature user entered
	 * @return initial temperature
	 */
	public double getInputTemperature(){
		return Double.parseDouble(fieldInputTemperature.getText());
	}
	/**
	 * method to get the ambient temperature user entered
	 * @return ambient temperature
	 */
	public double getAmbientTemperature(){
		return Double.parseDouble(fieldAmbientTemperature.getText());
	}
	/**
	 * method to get the ambient temperature rate user entered
	 * @return ambient rate
	 */
	public double getAmbientTemperatureRate(){
		return Double.parseDouble(fieldAmbientTemperatureRate.getText());
	}
	/**
	 * method to get the desired temperature user entered
	 * @return desired temperature
	 */
	public double getDesiredTemperatue(){
		return Double.parseDouble(fieldDesiredTemperature.getText());
	}
	/**
	 * method to get the desired temperature rate user entered
	 * @return desired rate
	 */
	public double getDesiredTemperatureRate(){
		return Double.parseDouble(fieldDesiredTemperatureRate.getText());
	}
	/**
	 * method to get the upper bound value user entered
	 * @return temperature upper bound 
	 */
	public double getDesiredTemperatureUpperBound(){
		return Double.parseDouble(fieldDesiredTemperatureUpperBound.getText());
	}
	/**
	 * method to get the lower bound value user entered
	 * @return temperature lower bound
	 */
	public double getDesiredTemperatureLowerBound(){
		return Double.parseDouble(fieldDesiredTemperatureLowerBound.getText());
	}
	/**
	 * method to get the thermostat refresh rate user entered
	 * @return refresh rate
	 */
	public double getTemperatureRefresh(){
		return Double.parseDouble(fieldTemperatureRefresh.getText());
	}
	
	//Getters for Sprinkler text fields
	/**
	 * method to get the soil moisture user entered
	 * @return initial soil moisture
	 */
	public double getInputMoisture(){
		return Double.parseDouble(fieldInputMoisture.getText());
	}
	/**
	 * method to get the ambient soil moisture user entered
	 * @return ambient soil moisture
	 */
	public double getAmbientMoisture(){
		return Double.parseDouble(fieldAmbientMoisture.getText());
	}
	/**
	 * method to get the ambient soil moisture rate user entered
	 * @return ambient rate
	 */
	public double getAmbientMoistureRate(){
		return Double.parseDouble(fieldAmbientMoistureRate.getText());
	}
	/**
	 * method to get the desired soil moisture user entered
	 * @return desired soil moisture
	 */
	public double getDesiredMoisture(){
		return Double.parseDouble(fieldDesiredMoisture.getText());
	}
	/**
	 * method to get the desired soil moisture rate user entered
	 * @return desired rate
	 */
	public double getDesiredMoistureRate(){
		return Double.parseDouble(fieldDesiredMoistureRate.getText());
	}
	/**
	 * method to get the upper bound soil moisture user entered
	 * @return soil moisture upper bound
	 */
	public double getDesiredMoistureUpperBound(){
		return Double.parseDouble(fieldDesiredMoistureUpperBound.getText());
	}
	/**
	 * method to get the lower bound soil moisture user entered
	 * @return soil moisture lower bound
	 */
	public double getDesiredMoistureLowerBound(){
		return Double.parseDouble(fieldDesiredMoistureLowerBound.getText());
	}
	/**
	 * method to get the sprinkler refresh rate user entered
	 * @return refresh rate
	 */
	public double getMoistureRefresh(){
		return Double.parseDouble(fieldMoistureRefresh.getText());
	}
	
	//Getters for Humidifier text fields
	/**
	 * method to get the humidity user entered
	 * @return initial humidity
	 */
	public double getInputHumidity(){
		return Double.parseDouble(fieldInputHumidity.getText());
	}
	/**
	 * method to get the ambient humidity user entered
	 * @return ambient humidity
	 */
	public double getAmbientHumidity(){
		return Double.parseDouble(fieldAmbientHumidity.getText());
	}
	/**
	 * method to get the ambient humidity rate user entered
	 * @return ambient rate
	 */
	public double getAmbientHumidityRate(){
		return Double.parseDouble(fieldAmbientHumidityRate.getText());
	}
	/**
	 * method to get the desired humidity user entered
	 * @return desired humidity
	 */
	public double getDesiredHumidity(){
		return Double.parseDouble(fieldDesiredHumidity.getText());
	}
	/**
	 * method to get the desired humidity rate user entered
	 * @return desired rate
	 */
	public double getDesiredHumidityRate(){
		return Double.parseDouble(fieldDesiredHumidityRate.getText());
	}
	/**
	 * method to get the upper bound humidity user entered
	 * @return humidity upper bound
	 */
	public double getDesiredHumidityUpperBound(){
		return Double.parseDouble(fieldDesiredHumidityUpperBound.getText());
	}
	/**
	 * method to get the lower bound humidity user entered
	 * @return humidity lower bound
	 */
	public double getDesiredHumidityLowerBound(){
		return Double.parseDouble(fieldDesiredHumidityLowerBound.getText());
	}
	/**
	 * method to get the humidifier refresh rate user entered
	 * @return refresh rate
	 */
	public double getHumidityRefresh(){
		return Double.parseDouble(fieldHumidityRefresh.getText());
	}
	
	//Action listener for Thermostat buttons
	public void temperatureUpdate(ActionListener e) {
		this.buttonSetInputTemperature.addActionListener(e);
	}
	public void temperatureParametersUpdate(ActionListener e) {
		this.buttonSetTemperatureParameters.addActionListener(e);
	}
	public void thermostatRun(ActionListener e) {
		this.buttonThermostatRun.addActionListener(e);
	}
	public void thermostatPause(ActionListener e) {
		this.buttonThermostatPause.addActionListener(e);
	}
	public void thermostatSave(ActionListener e) {
		this.buttonThermostatSave.addActionListener(e);
	}
	public void thermostatLoad(ActionListener e) {
		this.buttonThermostatLoad.addActionListener(e);
	}
	public void thermostatReset(ActionListener e) {
		this.buttonThermostatReset.addActionListener(e);
	}
	
	//Action listeners for Sprinkler buttons
	public void moistureUpdate(ActionListener e) {
		this.buttonSetInputMoisture.addActionListener(e);
	}
	public void moistureParametersUpdate(ActionListener e) {
		this.buttonSetMoistureParameters.addActionListener(e);
	}
	public void sprinklerRun(ActionListener e) {
		this.buttonSprinklerRun.addActionListener(e);
	}
	public void sprinklerPause(ActionListener e) {
		this.buttonSprinklerPause.addActionListener(e);
	}
	public void sprinklerSave(ActionListener e) {
		this.buttonSprinklerSave.addActionListener(e);
	}
	public void sprinklerLoad(ActionListener e) {
		this.buttonSprinklerLoad.addActionListener(e);
	}
	public void sprinklerReset(ActionListener e) {
		this.buttonSprinklerReset.addActionListener(e);
	}
	
	//Action listeners for Humidifier buttons
	public void humidityUpdate(ActionListener e) {
		this.buttonSetInputHumidity.addActionListener(e);
	}
	public void humidityParametersUpdate(ActionListener e) {
		this.buttonSetHumidityParameters.addActionListener(e);
	}
	public void humidifierRun(ActionListener e) {
		this.buttonHumidifierRun.addActionListener(e);
	}
	public void humidifierPause(ActionListener e) {
		this.buttonHumidifierPause.addActionListener(e);
	}
	public void humidifierSave(ActionListener e) {
		this.buttonHumidifierSave.addActionListener(e);
	}
	public void humidifierLoad(ActionListener e) {
		this.buttonHumidifierLoad.addActionListener(e);
	}
	public void humidifierReset(ActionListener e) {
		this.buttonHumidifierReset.addActionListener(e);
	}
	
	/**
	 * method to set lblCurrentTemp 
	 * @param currentTemp current temperature
	 */
	public void setTemperatureLabel(String currentTemp){
		labelTemperature.setText(String.valueOf(currentTemp) + "\u00b0" + "C");
	}
	/**
	 * method to set lblTempUpdateRate
	 * @param tempUpdateRate rate of change
	 */
	public void setTemperatureRateLabel(String tempUpdateRate){
		labelTemperatureUpdateRate.setText(String.valueOf(tempUpdateRate) + "\u00b0" + "C/s");
	}
	/**
	 * method to set lblTempLimitUpper
	 * @param tempLimitUpper upper limit
	 */
	public void setTemperatureUpperLabel(String tempLimitUpper){
		labelTemperatureUpperLimit.setText(String.valueOf(tempLimitUpper) + "\u00b0" + "C");
	}
	/**
	 * method to set lblTempLimitLower
	 * @param tempLimitLower lower limit
	 */
	public void setTemperatureLowerLabel(String tempLimitLower){
		labelTemperatureLowerLimit.setText(String.valueOf(tempLimitLower) + "\u00b0" + "C");
	}
	/**
	 * method to set thermostat visual as on
	 */
	public void setThermostatOn(){
		fieldThermostatOn.setBackground(Color.GREEN);
		fieldThermostatOff.setBackground(Color.WHITE);
	}
	/**
	 * method to set thermostat visual as off
	 */
	public void setThermostatOff(){
		fieldThermostatOn.setBackground(Color.WHITE);
		fieldThermostatOff.setBackground(Color.RED);
	}
	/**
	 * method to set air conditioner visual as on
	 */
	public void setAirConditionerOn(){
		fieldAirConditioner.setBackground(Color.CYAN);
		fieldHeater.setBackground(Color.WHITE);
	}
	/**
	 * method to set furnace visual as on
	 */
	public void setHeaterOn(){
		fieldAirConditioner.setBackground(Color.WHITE);
		fieldHeater.setBackground(Color.ORANGE);
	}
	/**
	 * method to set a/c and furnace visual as off
	 */
	public void setACAndHeaterOff(){
		fieldAirConditioner.setBackground(Color.WHITE);
		fieldHeater.setBackground(Color.WHITE);
	}
	
	/**
	 * method to set lblCurrentSoilMois
	 * @param s current soil moisture
	 */
	public void setMoistureLabel(String s){
		labelMoisture.setText(String.valueOf(s) + "%");
	}
	/**
	 * method to set lblSoilMoisUpdateRate
	 * @param s rate of change
	 */
	public void setMoistureRateLabel(String s){
		labelMoistureUpdateRate.setText(String.valueOf(s) + "%/s");
	}
	/**
	 * method to set lblSoilMoisLimitUpper
	 * @param s upper limit
	 */
	public void setMoistureUpperLabel(String s){
		labelMoistureUpperLimit.setText(String.valueOf(s) + "%");
	}
	/**
	 * method to set lblSoilMoisLimitLower
	 * @param s lower limit
	 */
	public void setMoistureLowerLabel(String s){
		labelMoistureLowerLimit.setText(String.valueOf(s) + "%");
	}
	/**
	 * method to set sprinkler visual as on
	 */
	public void setSprinklerOn(){
		fieldSprinklerOn.setBackground(Color.GREEN);
		fieldSprinklerOff.setBackground(Color.WHITE);
	}
	/**
	 * method to set sprinkler visual as off
	 */
	public void setSprinklerOff(){
		fieldSprinklerOn.setBackground(Color.WHITE);
		fieldSprinklerOff.setBackground(Color.RED);
	}
	
	/**
	 * method to set lblCurrentHumi
	 * @param s current humidity
	 */
	public void setHumidityLabel(String s){
		labelHumidity.setText(String.valueOf(s) + "%");
	}
	/**
	 * method to set lblHumiUpdateRate
	 * @param s rate of change
	 */
	public void setHumidityRateLabel(String s){
		labelHumidityUpdateRate.setText(String.valueOf(s) + "%/s");
	}
	/**
	 * method to set lblHumiLimitUpper
	 * @param s upper limit
	 */
	public void setHumidityUpperLabel(String s){
		labelHumidityUpperLimit.setText(String.valueOf(s) + "%");
	}
	/**
	 * method to set lblHumiLimitLower
	 * @param s lower limit
	 */
	public void setHumidityLowerLabel(String s){
		labelHumidityLowerLimit.setText(String.valueOf(s) + "%");
	}
	/**
	 * method to set humidifier visual as on
	 */
	public void setHumidifierOn(){
		fieldHumidifierOn.setBackground(Color.GREEN);
		fieldHumidifierOff.setBackground(Color.WHITE);
	}
	/**
	 * method to set humidifier visual as off
	 */
	public void setHumidifierOff(){
		fieldHumidifierOn.setBackground(Color.WHITE);
		fieldHumidifierOff.setBackground(Color.RED);
	}
	
	/**
	 * method to return string of current temperature label
	 * @return current temperature
	 */
	public String getTemperatureLabel(){
		return labelTemperature.getText();
	}
	/**
	 * method to return string of temperature rate of change
	 * @return rate of change
	 */
	public String getTemperatureRate(){
		return labelTemperatureUpdateRate.getText();
	}
	
	/**
	 * method to return string of current soil moisture label
	 * @return current soil moisture
	 */
	public String getMoistureLabel(){
		return labelMoisture.getText();
	}
	/**
	 * method to return string of soil moisture rate of change
	 * @return rate of change
	 */
	public String getMoistureRateLabel(){
		return labelMoistureUpdateRate.getText();
	}
	
	/**
	 * method to return string of current humidity label
	 * @return current humidity
	 */
	public String getHumidityLabel(){
		return labelHumidity.getText();
	}
	/**
	 * method to return string of humidity rate of change
	 * @return rate of change
	 */
	public String getHumidityRateLabel(){
		return labelHumidityUpdateRate.getText();
	}
	
}
