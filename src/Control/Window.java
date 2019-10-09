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
	private JTextField tfInitialTemperature,
		tfAmbientTemperature,
		tfAmbientTempRate,
		tfDesiredTemperature,
		tfDesiredTempRate,
		tfTempUpperBound,
		tfTempLowerBound,
		tfTempRefresh,
		tfThermostatOn,
		tfThermostatOff,
		tfAirConditioner,
		tfFurnace,
		
		tfInitialSoilMoisture,
		tfAmbientSoilMoisture,
		tfAmbientSoilMoisRate,
		tfDesiredSoilMoisture,
		tfDesiredSoilMoisRate,
		tfSoilMoisUpperBound,
		tfSoilMoisLowerBound,
		tfSoilMoisRefresh,
		tfSprinklerOn,
		tfSprinklerOff,
		
		tfInitialHumidity,
		tfAmbientHumidity,
		tfAmbientHumiRate,
		tfDesiredHumidity,
		tfDesiredHumiRate,
		tfHumiUpperBound,
		tfHumiLowerBound,
		tfHumiRefresh,
		tfHumidifierOn,
		tfHumidifierOff;
	//Labels, sorted by type of controller
	private JLabel lblThermostat,
		lblInitialTemperature,
		lblAmbientTemp,
		lblAmbientTemperature,
		lblAmbientTempRate,
		lblDesiredTemp,
		lblDesiredTemperature,
		lblDesiredTempRate,
		lblTempBound,
		lblTempUpperBound,
		lblTempLowerBound,
		lblTempRefresh,
		lblCurrentT,
		lblCurrentTemp,
		lblTempUpdateRate,
		lblTempLimit,
		lblTempLimitUpper,
		lblTempLimitLower,
		
		lblSprinkler,
		lblInitialSoilMoisture,
		lblAmbientSoilMois,
		lblAmbientSoilMoisture,
		lblAmbientSoilMoisRate,
		lblDesiredSoilMois,
		lblDesiredSoilMoisture,
		lblDesiredSoilMoisRate,
		lblSoilMoisBound,
		lblSoilMoisUpperBound,
		lblSoilMoisLowerBound,
		lblSoilMoisRefresh,
		lblCurrentSM,
		lblCurrentSoilMois,
		lblSoilMoisUpdateRate,
		lblSoilMoisLimit,
		lblSoilMoisLimitUpper,
		lblSoilMoisLimitLower,
		
		lblHumidifier,
		lblInitialHumidity,
		lblAmbientHumi,
		lblAmbientHumidity,
		lblAmbientHumiRate,
		lblDesiredHumi,
		lblDesiredHumidity,
		lblDesiredHumiRate,
		lblHumiBound,
		lblHumiUpperBound,
		lblHumiLowerBound,
		lblHumiRefresh,
		lblCurrentH,
		lblCurrentHumi,
		lblHumiUpdateRate,
		lblHumiLimit,
		lblHumiLimitUpper,
		lblHumiLimitLower;
	//Buttons, sorted by the type of controller
	private JButton bTempUse,
		bTempOtherUse,
		bTempRun,
		bTempPause,
		bTempSave,
		bTempLoad,
		bTempReset,
		
		bSoilMoisUse,
		bSoilMoisOtherUse,
		bSoilMoisRun,
		bSoilMoisPause,
		bSoilMoisSave,
		bSoilMoisLoad,
		bSoilMoisReset,
		
		bHumiUse,
		bHumiOtherUse,
		bHumiRun,
		bHumiPause,
		bHumiSave,
		bHumiLoad,
		bHumiReset;
	//Background panels 
	private JPanel JPThermostat,
		JPSprinkler,
		JPHumidifier;
	
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
		tfInitialTemperature = new JTextField();
		tfInitialTemperature.setBackground(new Color(245, 245, 245));
		tfInitialTemperature.setBounds(210, 46, 50, 24);
		this.getContentPane().add(tfInitialTemperature);
		tfInitialTemperature.setColumns(10);
		tfInitialTemperature.setVisible(true);
		
		tfAmbientTemperature = new JTextField();
		tfAmbientTemperature.setBackground(new Color(245, 245, 245));
		tfAmbientTemperature.setBounds(210, 96, 50, 24);
		this.getContentPane().add(tfAmbientTemperature);
		tfAmbientTemperature.setColumns(10);
		tfAmbientTemperature.setVisible(true);
		
		tfAmbientTempRate = new JTextField();
		tfAmbientTempRate.setBackground(new Color(245, 245, 245));
		tfAmbientTempRate.setBounds(360, 96, 50, 24);
		this.getContentPane().add(tfAmbientTempRate);
		tfAmbientTempRate.setColumns(10);
		tfAmbientTempRate.setVisible(true);
		
		tfDesiredTemperature = new JTextField();
		tfDesiredTemperature.setBackground(new Color(245, 245, 245));
		tfDesiredTemperature.setBounds(210, 146, 50, 24);
		this.getContentPane().add(tfDesiredTemperature);
		tfDesiredTemperature.setColumns(10);
		tfDesiredTemperature.setVisible(true);
		
		tfDesiredTempRate = new JTextField();
		tfDesiredTempRate.setBackground(new Color(245, 245, 245));
		tfDesiredTempRate.setBounds(360, 146, 50, 24);
		this.getContentPane().add(tfDesiredTempRate);
		tfDesiredTempRate.setColumns(10);
		tfDesiredTempRate.setVisible(true);
		
		tfTempUpperBound = new JTextField();
		tfTempUpperBound.setBackground(new Color(245, 245, 245));
		tfTempUpperBound.setBounds(210, 202, 50, 24);
		this.getContentPane().add(tfTempUpperBound);
		tfTempUpperBound.setColumns(10);
		tfTempUpperBound.setVisible(true);
		
		tfTempLowerBound = new JTextField();
		tfTempLowerBound.setBackground(new Color(245, 245, 245));
		tfTempLowerBound.setBounds(210, 226, 50, 24);
		this.getContentPane().add(tfTempLowerBound);
		tfTempLowerBound.setColumns(10);
		tfTempLowerBound.setVisible(true);
		
		tfTempRefresh = new JTextField();
		tfTempRefresh.setBackground(new Color(245, 245, 245));
		tfTempRefresh.setBounds(210, 256, 50, 24);
		this.getContentPane().add(tfTempRefresh);
		tfTempRefresh.setColumns(10);
		tfTempRefresh.setVisible(true);
		
		tfThermostatOn = new JTextField();
		tfThermostatOn.setEditable(false);
		tfThermostatOn.setText("On");
		tfThermostatOn.setBackground(Color.WHITE);
		tfThermostatOn.setBounds(660, 46, 40, 24);
		this.getContentPane().add(tfThermostatOn);
		tfThermostatOn.setColumns(10);
		tfThermostatOn.setVisible(true);
		
		tfThermostatOff = new JTextField();
		tfThermostatOff.setEditable(false);
		tfThermostatOff.setText("Off");
		tfThermostatOff.setBackground(Color.RED);
		tfThermostatOff.setBounds(700, 46, 40, 24);
		this.getContentPane().add(tfThermostatOff);
		tfThermostatOff.setColumns(10);
		tfThermostatOff.setVisible(true);
		
		tfAirConditioner = new JTextField();
		tfAirConditioner.setEditable(false);
		tfAirConditioner.setText("A/C");
		tfAirConditioner.setBackground(Color.WHITE);
		tfAirConditioner.setBounds(760, 46, 45, 24);
		this.getContentPane().add(tfAirConditioner);
		tfAirConditioner.setColumns(10);
		tfAirConditioner.setVisible(true);
		
		tfFurnace = new JTextField();
		tfFurnace.setEditable(false);
		tfFurnace.setText("Heater");
		tfFurnace.setBackground(Color.WHITE);
		tfFurnace.setBounds(805, 46, 45, 24);
		this.getContentPane().add(tfFurnace);
		tfFurnace.setColumns(10);
		tfFurnace.setVisible(true);
		//Temperature Text Field
		
		//Temperature Label
		lblThermostat = new JLabel("Thermostat");
		lblThermostat.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblThermostat.setHorizontalAlignment(SwingConstants.CENTER);
		lblThermostat.setBounds(0, 8, 900, 36);
		this.getContentPane().add(lblThermostat);
		lblThermostat.setVisible(true);
		
		lblInitialTemperature = new JLabel("Temperature(" + "\u00b0" + "C)");
		lblInitialTemperature.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInitialTemperature.setBounds(60, 40, 190, 35);
		this.getContentPane().add(lblInitialTemperature);
		
		lblAmbientTemp = new JLabel("Ambient");
		lblAmbientTemp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmbientTemp.setBounds(60, 70, 190, 35);
		this.getContentPane().add(lblAmbientTemp);
		
		lblAmbientTemperature = new JLabel("Temperature(" + "\u00b0" + "C)");
		lblAmbientTemperature.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmbientTemperature.setBounds(60, 90, 190, 35);
		this.getContentPane().add(lblAmbientTemperature);
		
		lblAmbientTempRate = new JLabel("Rate(" + "\u00b0" + "C/m)");
		lblAmbientTempRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmbientTempRate.setBounds(280, 90, 190, 35);
		this.getContentPane().add(lblAmbientTempRate);
		
		lblDesiredTemp = new JLabel("Want");
		lblDesiredTemp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesiredTemp.setBounds(60, 120, 190, 35);
		this.getContentPane().add(lblDesiredTemp);
		
		lblDesiredTemperature = new JLabel("Temperature(" + "\u00b0" + "C)");
		lblDesiredTemperature.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesiredTemperature.setBounds(60, 140, 190, 35);
		this.getContentPane().add(lblDesiredTemperature);
		
		lblDesiredTempRate = new JLabel("Rate(" + "\u00b0" + "C/m)");
		lblDesiredTempRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesiredTempRate.setBounds(280, 140, 190, 35);
		this.getContentPane().add(lblDesiredTempRate);
		
		lblTempBound = new JLabel("Range");
		lblTempBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTempBound.setBounds(60, 170, 190, 35);
		this.getContentPane().add(lblTempBound);
		
		lblTempUpperBound = new JLabel("Upper allowance(" + "\u00b0" + "C)");
		lblTempUpperBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTempUpperBound.setBounds(60, 195, 190, 35);
		this.getContentPane().add(lblTempUpperBound);
		
		lblTempLowerBound = new JLabel("Lower allowance(" + "\u00b0" + "C)");
		lblTempLowerBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTempLowerBound.setBounds(60, 220, 190, 35);
		this.getContentPane().add(lblTempLowerBound);
		
		lblTempRefresh = new JLabel("Update rate(s)");
		lblTempRefresh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTempRefresh.setBounds(60, 250, 190, 35);
		this.getContentPane().add(lblTempRefresh);
		
		lblCurrentT = new JLabel("Current temperature:");
		lblCurrentT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCurrentT.setBounds(660, 85, 210, 35);
		this.getContentPane().add(lblCurrentT);
		
		lblCurrentTemp = new JLabel("0.0000" + "\u00b0" + "C");
		lblCurrentTemp.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblCurrentTemp.setBounds(660, 120, 190, 35);
		this.getContentPane().add(lblCurrentTemp);
		
		lblTempUpdateRate = new JLabel("+0.0000" + "\u00b0" + "C/s");
		lblTempUpdateRate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTempUpdateRate.setBounds(675, 150, 190, 35);
		this.getContentPane().add(lblTempUpdateRate);
		
		lblTempLimit = new JLabel("Limit:");
		lblTempLimit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTempLimit.setBounds(660, 190, 190, 35);
		this.getContentPane().add(lblTempLimit);
		
		lblTempLimitUpper = new JLabel("0.0000" + "\u00b0" + "C");
		lblTempLimitUpper.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTempLimitUpper.setBounds(720, 220, 190, 35);
		this.getContentPane().add(lblTempLimitUpper);
		
		lblTempLimitLower = new JLabel("0.0000" + "\u00b0" + "C");
		lblTempLimitLower.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTempLimitLower.setBounds(720, 190, 190, 35);
		this.getContentPane().add(lblTempLimitLower);
		//Temperature Label
		
		//Temperature Button
		bTempUse = new JButton("Set As Temperature");
		bTempUse.setBounds(280, 46, 150, 25);
		bTempUse.setActionCommand("1");
		this.getContentPane().add(bTempUse);
		
		bTempOtherUse = new JButton("Update Variables");
		bTempOtherUse.setBounds(280, 256, 150, 25);
		bTempOtherUse.setActionCommand("2");
		this.getContentPane().add(bTempOtherUse);
		
		bTempRun = new JButton("Run");
		bTempRun.setBounds(500, 46, 70, 25);
		bTempRun.setActionCommand("3");
		this.getContentPane().add(bTempRun);
		
		bTempPause = new JButton("Pause");
		bTempPause.setBounds(500, 98, 70, 25);
		bTempPause.setActionCommand("4");
		this.getContentPane().add(bTempPause);
		
		bTempSave = new JButton("Save");
		bTempSave.setBounds(500, 150, 70, 25);
		bTempSave.setActionCommand("5");
		this.getContentPane().add(bTempSave);
		
		bTempLoad = new JButton("Load");
		bTempLoad.setBounds(500, 202, 70, 25);
		bTempLoad.setActionCommand("6");
		this.getContentPane().add(bTempLoad);
		
		bTempReset = new JButton("Reset");
		bTempReset.setBounds(500, 256, 70, 25);
		bTempReset.setActionCommand("7");
		this.getContentPane().add(bTempReset);
		//Temperature Button
		
		//Temperature Panel
		JPThermostat = new JPanel();
		JPThermostat.setBackground(new Color(240, 128, 128));
		JPThermostat.setBounds(0, 0, 900, 300);
		getContentPane().add(JPThermostat);
		JPThermostat.setLayout(null);
		//Temperature Panel
		//Temperature***********************************************Temperature
		
		//SoilMoisture*********************************************SoilMoisture
		//Soil Moisture Text Field
		tfInitialSoilMoisture = new JTextField();
		tfInitialSoilMoisture.setBackground(new Color(245, 245, 245));
		tfInitialSoilMoisture.setBounds(465, 346, 50, 24);
		this.getContentPane().add(tfInitialSoilMoisture);
		tfInitialSoilMoisture.setColumns(10);
		tfInitialSoilMoisture.setVisible(true);
		
		tfAmbientSoilMoisture = new JTextField();
		tfAmbientSoilMoisture.setBackground(new Color(245, 245, 245));
		tfAmbientSoilMoisture.setBounds(465, 396, 50, 24);
		this.getContentPane().add(tfAmbientSoilMoisture);
		tfAmbientSoilMoisture.setColumns(10);
		tfAmbientSoilMoisture.setVisible(true);
		
		tfAmbientSoilMoisRate = new JTextField();
		tfAmbientSoilMoisRate.setBackground(new Color(245, 245, 245));
		tfAmbientSoilMoisRate.setBounds(615, 396, 50, 24);
		this.getContentPane().add(tfAmbientSoilMoisRate);
		tfAmbientSoilMoisRate.setColumns(10);
		tfAmbientSoilMoisRate.setVisible(true);
		
		tfDesiredSoilMoisture = new JTextField();
		tfDesiredSoilMoisture.setBackground(new Color(245, 245, 245));
		tfDesiredSoilMoisture.setBounds(465, 446, 50, 24);
		this.getContentPane().add(tfDesiredSoilMoisture);
		tfDesiredSoilMoisture.setColumns(10);
		tfDesiredSoilMoisture.setVisible(true);
		
		tfDesiredSoilMoisRate = new JTextField();
		tfDesiredSoilMoisRate.setBackground(new Color(245, 245, 245));
		tfDesiredSoilMoisRate.setBounds(615, 446, 50, 24);
		this.getContentPane().add(tfDesiredSoilMoisRate);
		tfDesiredSoilMoisRate.setColumns(10);
		tfDesiredSoilMoisRate.setVisible(true);
		
		tfSoilMoisUpperBound = new JTextField();
		tfSoilMoisUpperBound.setBackground(new Color(245, 245, 245));
		tfSoilMoisUpperBound.setBounds(465, 502, 50, 24);
		this.getContentPane().add(tfSoilMoisUpperBound);
		tfSoilMoisUpperBound.setColumns(10);
		tfSoilMoisUpperBound.setVisible(true);
		
		tfSoilMoisLowerBound = new JTextField();
		tfSoilMoisLowerBound.setBackground(new Color(245, 245, 245));
		tfSoilMoisLowerBound.setBounds(465, 526, 50, 24);
		this.getContentPane().add(tfSoilMoisLowerBound);
		tfSoilMoisLowerBound.setColumns(10);
		tfSoilMoisLowerBound.setVisible(true);
		
		tfSoilMoisRefresh = new JTextField();
		tfSoilMoisRefresh.setBackground(new Color(245, 245, 245));
		tfSoilMoisRefresh.setBounds(465, 556, 50, 24);
		this.getContentPane().add(tfSoilMoisRefresh);
		tfSoilMoisRefresh.setColumns(10);
		tfSoilMoisRefresh.setVisible(true);
		
		tfSprinklerOn = new JTextField();
		tfSprinklerOn.setEditable(false);
		tfSprinklerOn.setText("On");
		tfSprinklerOn.setBackground(Color.WHITE);
		tfSprinklerOn.setBounds(53, 346, 40, 24);
		this.getContentPane().add(tfSprinklerOn);
		tfSprinklerOn.setColumns(10);
		tfSprinklerOn.setVisible(true);
		
		tfSprinklerOff = new JTextField();
		tfSprinklerOff.setEditable(false);
		tfSprinklerOff.setText("Off");
		tfSprinklerOff.setBackground(Color.RED);
		tfSprinklerOff.setBounds(93, 346, 40, 24);
		this.getContentPane().add(tfSprinklerOff);
		tfSprinklerOff.setColumns(10);
		tfSprinklerOff.setVisible(true);
		//Soil Moisture Text Field
		
		//Soil Moisture Label
		lblSprinkler = new JLabel("Sprinkler");
		lblSprinkler.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSprinkler.setHorizontalAlignment(SwingConstants.CENTER);
		lblSprinkler.setBounds(0, 308, 900, 36);
		this.getContentPane().add(lblSprinkler);
		lblSprinkler.setVisible(true);
		
		lblInitialSoilMoisture = new JLabel("Soil saturation(%)");
		lblInitialSoilMoisture.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInitialSoilMoisture.setBounds(315, 340, 190, 35);
		this.getContentPane().add(lblInitialSoilMoisture);
		
		lblAmbientSoilMois = new JLabel("Ambient");
		lblAmbientSoilMois.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmbientSoilMois.setBounds(315, 370, 190, 35);
		this.getContentPane().add(lblAmbientSoilMois);
		
		lblAmbientSoilMoisture = new JLabel("Soil saturation(%)");
		lblAmbientSoilMoisture.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmbientSoilMoisture.setBounds(315, 390, 190, 35);
		this.getContentPane().add(lblAmbientSoilMoisture);
		
		lblAmbientSoilMoisRate = new JLabel("Rate(%/m)");
		lblAmbientSoilMoisRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmbientSoilMoisRate.setBounds(534, 390, 190, 35);
		this.getContentPane().add(lblAmbientSoilMoisRate);
		
		lblDesiredSoilMois = new JLabel("Want");
		lblDesiredSoilMois.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesiredSoilMois.setBounds(315, 420, 190, 35);
		this.getContentPane().add(lblDesiredSoilMois);
		
		lblDesiredSoilMoisture = new JLabel("Saturation(%)");
		lblDesiredSoilMoisture.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesiredSoilMoisture.setBounds(315, 440, 190, 35);
		this.getContentPane().add(lblDesiredSoilMoisture);
		
		lblDesiredSoilMoisRate = new JLabel("Rate(%/m)");
		lblDesiredSoilMoisRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesiredSoilMoisRate.setBounds(535, 440, 190, 35);
		this.getContentPane().add(lblDesiredSoilMoisRate);
		
		lblSoilMoisBound = new JLabel("Range");
		lblSoilMoisBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSoilMoisBound.setBounds(315, 470, 190, 35);
		this.getContentPane().add(lblSoilMoisBound);
		
		lblSoilMoisUpperBound = new JLabel("Upper allowance(%)");
		lblSoilMoisUpperBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSoilMoisUpperBound.setBounds(315, 495, 190, 35);
		this.getContentPane().add(lblSoilMoisUpperBound);
		
		lblSoilMoisLowerBound = new JLabel("Lower allowance(%)");
		lblSoilMoisLowerBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSoilMoisLowerBound.setBounds(315, 520, 190, 35);
		this.getContentPane().add(lblSoilMoisLowerBound);
		
		lblSoilMoisRefresh = new JLabel("Update rate(s)");
		lblSoilMoisRefresh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSoilMoisRefresh.setBounds(315, 550, 190, 35);
		this.getContentPane().add(lblSoilMoisRefresh);
		
		lblCurrentSM = new JLabel("Current soil moisture:");
		lblCurrentSM.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCurrentSM.setBounds(53, 385, 210, 35);
		this.getContentPane().add(lblCurrentSM);
		
		lblCurrentSoilMois = new JLabel("0.0000%");
		lblCurrentSoilMois.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblCurrentSoilMois.setBounds(53, 420, 190, 35);
		this.getContentPane().add(lblCurrentSoilMois);
		
		lblSoilMoisUpdateRate = new JLabel("+0.0000%/s");
		lblSoilMoisUpdateRate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSoilMoisUpdateRate.setBounds(68, 450, 190, 35);
		this.getContentPane().add(lblSoilMoisUpdateRate);
		
		lblSoilMoisLimit = new JLabel("Limit:");
		lblSoilMoisLimit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSoilMoisLimit.setBounds(53, 490, 190, 35);
		this.getContentPane().add(lblSoilMoisLimit);
		
		lblSoilMoisLimitUpper = new JLabel("0.0000%");
		lblSoilMoisLimitUpper.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSoilMoisLimitUpper.setBounds(113, 520, 190, 35);
		this.getContentPane().add(lblSoilMoisLimitUpper);
		
		lblSoilMoisLimitLower = new JLabel("0.0000%");
		lblSoilMoisLimitLower.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSoilMoisLimitLower.setBounds(113, 490, 190, 35);
		this.getContentPane().add(lblSoilMoisLimitLower);
		//Soil Moisture Label
		
		//Soil Moisture Button
		bSoilMoisUse = new JButton("Set As Saturation");
		bSoilMoisUse.setBounds(535, 346, 150, 25);
		bSoilMoisUse.setActionCommand("8");
		this.getContentPane().add(bSoilMoisUse);
		
		bSoilMoisOtherUse = new JButton("Update Variables");
		bSoilMoisOtherUse.setBounds(535, 556, 150, 25);
		bSoilMoisOtherUse.setActionCommand("9");
		this.getContentPane().add(bSoilMoisOtherUse);
		
		bSoilMoisRun = new JButton("Run");
		bSoilMoisRun.setBounds(725, 346, 70, 25);
		bSoilMoisRun.setActionCommand("10");
		this.getContentPane().add(bSoilMoisRun);
		
		bSoilMoisPause = new JButton("Pause");
		bSoilMoisPause.setBounds(725, 398, 70, 25);
		bSoilMoisPause.setActionCommand("11");
		this.getContentPane().add(bSoilMoisPause);
		
		bSoilMoisSave = new JButton("Save");
		bSoilMoisSave.setBounds(725, 450, 70, 25);
		bSoilMoisSave.setActionCommand("12");
		this.getContentPane().add(bSoilMoisSave);
		
		bSoilMoisLoad = new JButton("Load");
		bSoilMoisLoad.setBounds(725, 502, 70, 25);
		bSoilMoisLoad.setActionCommand("13");
		this.getContentPane().add(bSoilMoisLoad);
		
		bSoilMoisReset = new JButton("Reset");
		bSoilMoisReset.setBounds(725, 556, 70, 25);
		bSoilMoisReset.setActionCommand("14");
		this.getContentPane().add(bSoilMoisReset);
		//Soil Moisture Button
		
		//Soil Moisture Panel
		JPSprinkler = new JPanel();
		JPSprinkler.setBackground(new Color(152, 251, 152));
		JPSprinkler.setBounds(0, 300, 900, 300);
		getContentPane().add(JPSprinkler);
		JPSprinkler.setLayout(null);
		//Soil Moisture Panel
		//SoilMoisture*********************************************SoilMoisture
		
		//Humidity*****************************************************Humidity
		//Humidity Text Field
		tfInitialHumidity = new JTextField();
		tfInitialHumidity.setBackground(new Color(245, 245, 245));
		tfInitialHumidity.setBounds(210, 646, 50, 24);
		this.getContentPane().add(tfInitialHumidity);
		tfInitialHumidity.setColumns(10);
		tfInitialHumidity.setVisible(true);
		
		tfAmbientHumidity = new JTextField();
		tfAmbientHumidity.setBackground(new Color(245, 245, 245));
		tfAmbientHumidity.setBounds(210, 696, 50, 24);
		this.getContentPane().add(tfAmbientHumidity);
		tfAmbientHumidity.setColumns(10);
		tfAmbientHumidity.setVisible(true);
		
		tfAmbientHumiRate = new JTextField();
		tfAmbientHumiRate.setBackground(new Color(245, 245, 245));
		tfAmbientHumiRate.setBounds(360, 696, 50, 24);
		this.getContentPane().add(tfAmbientHumiRate);
		tfAmbientHumiRate.setColumns(10);
		tfAmbientHumiRate.setVisible(true);
		
		tfDesiredHumidity = new JTextField();
		tfDesiredHumidity.setBackground(new Color(245, 245, 245));
		tfDesiredHumidity.setBounds(210, 746, 50, 24);
		this.getContentPane().add(tfDesiredHumidity);
		tfDesiredHumidity.setColumns(10);
		tfDesiredHumidity.setVisible(true);
		
		tfDesiredHumiRate = new JTextField();
		tfDesiredHumiRate.setBackground(new Color(245, 245, 245));
		tfDesiredHumiRate.setBounds(360, 746, 50, 24);
		this.getContentPane().add(tfDesiredHumiRate);
		tfDesiredHumiRate.setColumns(10);
		tfDesiredHumiRate.setVisible(true);
		
		tfHumiUpperBound = new JTextField();
		tfHumiUpperBound.setBackground(new Color(245, 245, 245));
		tfHumiUpperBound.setBounds(210, 802, 50, 24);
		this.getContentPane().add(tfHumiUpperBound);
		tfHumiUpperBound.setColumns(10);
		tfHumiUpperBound.setVisible(true);
		
		tfHumiLowerBound = new JTextField();
		tfHumiLowerBound.setBackground(new Color(245, 245, 245));
		tfHumiLowerBound.setBounds(210, 826, 50, 24);
		this.getContentPane().add(tfHumiLowerBound);
		tfHumiLowerBound.setColumns(10);
		tfHumiLowerBound.setVisible(true);
		
		tfHumiRefresh = new JTextField();
		tfHumiRefresh.setBackground(new Color(245, 245, 245));
		tfHumiRefresh.setBounds(210, 856, 50, 24);
		this.getContentPane().add(tfHumiRefresh);
		tfHumiRefresh.setColumns(10);
		tfHumiRefresh.setVisible(true);
		
		tfHumidifierOn = new JTextField();
		tfHumidifierOn.setEditable(false);
		tfHumidifierOn.setText("On");
		tfHumidifierOn.setBackground(Color.WHITE);
		tfHumidifierOn.setBounds(660, 646, 40, 24);
		this.getContentPane().add(tfHumidifierOn);
		tfHumidifierOn.setColumns(10);
		tfHumidifierOn.setVisible(true);
		
		tfHumidifierOff = new JTextField();
		tfHumidifierOff.setEditable(false);
		tfHumidifierOff.setText("Off");
		tfHumidifierOff.setBackground(Color.RED);
		tfHumidifierOff.setBounds(700, 646, 40, 24);
		this.getContentPane().add(tfHumidifierOff);
		tfHumidifierOff.setColumns(10);
		tfHumidifierOff.setVisible(true);
		//Humidity Text Field
		
		//Humidity Label
		lblHumidifier = new JLabel("Humidifier");
		lblHumidifier.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHumidifier.setHorizontalAlignment(SwingConstants.CENTER);
		lblHumidifier.setBounds(0, 608, 900, 36);
		this.getContentPane().add(lblHumidifier);
		lblHumidifier.setVisible(true);
		
		lblInitialHumidity = new JLabel("Humidity(%)");
		lblInitialHumidity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInitialHumidity.setBounds(60, 640, 190, 35);
		this.getContentPane().add(lblInitialHumidity);
		
		lblAmbientHumi = new JLabel("Ambient");
		lblAmbientHumi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmbientHumi.setBounds(60, 670, 190, 35);
		this.getContentPane().add(lblAmbientHumi);
		
		lblAmbientHumidity = new JLabel("Humidity(%)");
		lblAmbientHumidity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmbientHumidity.setBounds(60, 690, 190, 35);
		this.getContentPane().add(lblAmbientHumidity);
		
		lblAmbientHumiRate = new JLabel("Rate(%/m)");
		lblAmbientHumiRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmbientHumiRate.setBounds(280, 690, 190, 35);
		this.getContentPane().add(lblAmbientHumiRate);
		
		lblDesiredHumi = new JLabel("Want");
		lblDesiredHumi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesiredHumi.setBounds(60, 720, 190, 35);
		this.getContentPane().add(lblDesiredHumi);
		
		lblDesiredHumidity = new JLabel("Humidity(%)");
		lblDesiredHumidity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesiredHumidity.setBounds(60, 740, 190, 35);
		this.getContentPane().add(lblDesiredHumidity);
		
		lblDesiredHumiRate = new JLabel("Rate(%/m)");
		lblDesiredHumiRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesiredHumiRate.setBounds(280, 740, 190, 35);
		this.getContentPane().add(lblDesiredHumiRate);
		
		lblHumiBound = new JLabel("Range");
		lblHumiBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHumiBound.setBounds(60, 770, 190, 35);
		this.getContentPane().add(lblHumiBound);
		
		lblHumiUpperBound = new JLabel("Upper allowance(%)");
		lblHumiUpperBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHumiUpperBound.setBounds(60, 795, 190, 35);
		this.getContentPane().add(lblHumiUpperBound);
		
		lblHumiLowerBound = new JLabel("Lower allowance(%)");
		lblHumiLowerBound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHumiLowerBound.setBounds(60, 820, 190, 35);
		this.getContentPane().add(lblHumiLowerBound);
		
		lblHumiRefresh = new JLabel("Update rate(s)");
		lblHumiRefresh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHumiRefresh.setBounds(60, 850, 190, 35);
		this.getContentPane().add(lblHumiRefresh);
		
		lblCurrentH = new JLabel("Current humidity:");
		lblCurrentH.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCurrentH.setBounds(660, 685, 210, 35);
		this.getContentPane().add(lblCurrentH);
		
		lblCurrentHumi = new JLabel("0.0000%");
		lblCurrentHumi.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblCurrentHumi.setBounds(660, 720, 190, 35);
		this.getContentPane().add(lblCurrentHumi);
		
		lblHumiUpdateRate = new JLabel("+0.0000%/s");
		lblHumiUpdateRate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHumiUpdateRate.setBounds(675, 750, 190, 35);
		this.getContentPane().add(lblHumiUpdateRate);
		
		lblHumiLimit = new JLabel("Limit:");
		lblHumiLimit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHumiLimit.setBounds(660, 790, 190, 35);
		this.getContentPane().add(lblHumiLimit);
		
		lblHumiLimitUpper = new JLabel("0.0000%");
		lblHumiLimitUpper.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHumiLimitUpper.setBounds(720, 820, 190, 35);
		this.getContentPane().add(lblHumiLimitUpper);
		
		lblHumiLimitLower = new JLabel("0.0000%");
		lblHumiLimitLower.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHumiLimitLower.setBounds(720, 790, 190, 35);
		this.getContentPane().add(lblHumiLimitLower);
		//Humidity Label

		//Humidity Button
		bHumiUse = new JButton("Set As Humidity");
		bHumiUse.setBounds(280, 646, 150, 25);
		bHumiUse.setActionCommand("15");
		this.getContentPane().add(bHumiUse);
		
		bHumiOtherUse = new JButton("Update Variables");
		bHumiOtherUse.setBounds(280, 856, 150, 25);
		bHumiOtherUse.setActionCommand("16");
		this.getContentPane().add(bHumiOtherUse);
		
		bHumiRun = new JButton("Run");
		bHumiRun.setBounds(500, 646, 70, 25);
		bHumiRun.setActionCommand("17");
		this.getContentPane().add(bHumiRun);
		
		bHumiPause = new JButton("Pause");
		bHumiPause.setBounds(500, 698, 70, 25);
		bHumiPause.setActionCommand("18");
		this.getContentPane().add(bHumiPause);
		
		bHumiSave = new JButton("Save");
		bHumiSave.setBounds(500, 750, 70, 25);
		bHumiSave.setActionCommand("19");
		this.getContentPane().add(bHumiSave);
		
		bHumiLoad = new JButton("Load");
		bHumiLoad.setBounds(500, 802, 70, 25);
		bHumiLoad.setActionCommand("20");
		this.getContentPane().add(bHumiLoad);
		
		bHumiReset = new JButton("Reset");
		bHumiReset.setBounds(500, 856, 70, 25);
		bHumiReset.setActionCommand("21");
		this.getContentPane().add(bHumiReset);
		//Humidity Button
		
		//Humidity Panel
		JPHumidifier = new JPanel();
		JPHumidifier.setBackground(new Color(135, 206, 250));
		JPHumidifier.setBounds(0, 600, 900, 300);
		getContentPane().add(JPHumidifier);
		JPHumidifier.setLayout(null);
		//Humidity Panel
		//Humidity*****************************************************Humidity
	}
	
	//Getters for Thermostat text fields
	/**
	 * method to get the temperature user entered
	 * @return initial temperature
	 */
	public double getInitialTemperature(){
		return Double.parseDouble(tfInitialTemperature.getText());
	}
	/**
	 * method to get the ambient temperature user entered
	 * @return ambient temperature
	 */
	public double getAmbientTemperature(){
		return Double.parseDouble(tfAmbientTemperature.getText());
	}
	/**
	 * method to get the ambient temperature rate user entered
	 * @return ambient rate
	 */
	public double getAmbientTempRate(){
		return Double.parseDouble(tfAmbientTempRate.getText());
	}
	/**
	 * method to get the desired temperature user entered
	 * @return desired temperature
	 */
	public double getDesiredTemperatue(){
		return Double.parseDouble(tfDesiredTemperature.getText());
	}
	/**
	 * method to get the desired temperature rate user entered
	 * @return desired rate
	 */
	public double getDesiredTempRate(){
		return Double.parseDouble(tfDesiredTempRate.getText());
	}
	/**
	 * method to get the upper bound value user entered
	 * @return temperature upper bound 
	 */
	public double getTempUpperBound(){
		return Double.parseDouble(tfTempUpperBound.getText());
	}
	/**
	 * method to get the lower bound value user entered
	 * @return temperature lower bound
	 */
	public double getTempLowerBound(){
		return Double.parseDouble(tfTempLowerBound.getText());
	}
	/**
	 * method to get the thermostat refresh rate user entered
	 * @return refresh rate
	 */
	public double getTempRefresh(){
		return Double.parseDouble(tfTempRefresh.getText());
	}
	
	//Getters for Sprinkler text fields
	/**
	 * method to get the soil moisture user entered
	 * @return initial soil moisture
	 */
	public double getInitialSoilMoisture(){
		return Double.parseDouble(tfInitialSoilMoisture.getText());
	}
	/**
	 * method to get the ambient soil moisture user entered
	 * @return ambient soil moisture
	 */
	public double getAmbientSoilMoisture(){
		return Double.parseDouble(tfAmbientSoilMoisture.getText());
	}
	/**
	 * method to get the ambient soil moisture rate user entered
	 * @return ambient rate
	 */
	public double getAmbientSoilMoisRate(){
		return Double.parseDouble(tfAmbientSoilMoisRate.getText());
	}
	/**
	 * method to get the desired soil moisture user entered
	 * @return desired soil moisture
	 */
	public double getDesiredSoilMoisture(){
		return Double.parseDouble(tfDesiredSoilMoisture.getText());
	}
	/**
	 * method to get the desired soil moisture rate user entered
	 * @return desired rate
	 */
	public double getDesiredSoilMoisRate(){
		return Double.parseDouble(tfDesiredSoilMoisRate.getText());
	}
	/**
	 * method to get the upper bound soil moisture user entered
	 * @return soil moisture upper bound
	 */
	public double getSoilMoisUpperBound(){
		return Double.parseDouble(tfSoilMoisUpperBound.getText());
	}
	/**
	 * method to get the lower bound soil moisture user entered
	 * @return soil moisture lower bound
	 */
	public double getSoilMoisLowerBound(){
		return Double.parseDouble(tfSoilMoisLowerBound.getText());
	}
	/**
	 * method to get the sprinkler refresh rate user entered
	 * @return refresh rate
	 */
	public double getSoilMoisRefresh(){
		return Double.parseDouble(tfSoilMoisRefresh.getText());
	}
	
	//Getters for Humidifier text fields
	/**
	 * method to get the humidity user entered
	 * @return initial humidity
	 */
	public double getInitialHumidity(){
		return Double.parseDouble(tfInitialHumidity.getText());
	}
	/**
	 * method to get the ambient humidity user entered
	 * @return ambient humidity
	 */
	public double getAmbientHumidity(){
		return Double.parseDouble(tfAmbientHumidity.getText());
	}
	/**
	 * method to get the ambient humidity rate user entered
	 * @return ambient rate
	 */
	public double getAmbientHumiRate(){
		return Double.parseDouble(tfAmbientHumiRate.getText());
	}
	/**
	 * method to get the desired humidity user entered
	 * @return desired humidity
	 */
	public double getDesiredHumidity(){
		return Double.parseDouble(tfDesiredHumidity.getText());
	}
	/**
	 * method to get the desired humidity rate user entered
	 * @return desired rate
	 */
	public double getDesiredHumiRate(){
		return Double.parseDouble(tfDesiredHumiRate.getText());
	}
	/**
	 * method to get the upper bound humidity user entered
	 * @return humidity upper bound
	 */
	public double getHumiUpperBound(){
		return Double.parseDouble(tfHumiUpperBound.getText());
	}
	/**
	 * method to get the lower bound humidity user entered
	 * @return humidity lower bound
	 */
	public double getHumiLowerBound(){
		return Double.parseDouble(tfHumiLowerBound.getText());
	}
	/**
	 * method to get the humidifier refresh rate user entered
	 * @return refresh rate
	 */
	public double getHumiRefresh(){
		return Double.parseDouble(tfHumiRefresh.getText());
	}
	
	//Action listener for Thermostat buttons
	public void bTempUse(ActionListener e) {
		this.bTempUse.addActionListener(e);
	}
	public void bTempOtherUse(ActionListener e) {
		this.bTempOtherUse.addActionListener(e);
	}
	public void bTempRun(ActionListener e) {
		this.bTempRun.addActionListener(e);
	}
	public void bTempPause(ActionListener e) {
		this.bTempPause.addActionListener(e);
	}
	public void bTempSave(ActionListener e) {
		this.bTempSave.addActionListener(e);
	}
	public void bTempLoad(ActionListener e) {
		this.bTempLoad.addActionListener(e);
	}
	public void bTempReset(ActionListener e) {
		this.bTempReset.addActionListener(e);
	}
	
	//Action listeners for Sprinkler buttons
	public void bSoilMoisUse(ActionListener e) {
		this.bSoilMoisUse.addActionListener(e);
	}
	public void bSoilMoisOtherUse(ActionListener e) {
		this.bSoilMoisOtherUse.addActionListener(e);
	}
	public void bSoilMoisRun(ActionListener e) {
		this.bSoilMoisRun.addActionListener(e);
	}
	public void bSoilMoisPause(ActionListener e) {
		this.bSoilMoisPause.addActionListener(e);
	}
	public void bSoilMoisSave(ActionListener e) {
		this.bSoilMoisSave.addActionListener(e);
	}
	public void bSoilMoisLoad(ActionListener e) {
		this.bSoilMoisLoad.addActionListener(e);
	}
	public void bSoilMoisReset(ActionListener e) {
		this.bSoilMoisReset.addActionListener(e);
	}
	
	//Action listeners for Humidifier buttons
	public void bHumiUse(ActionListener e) {
		this.bHumiUse.addActionListener(e);
	}
	public void bHumiOtherUse(ActionListener e) {
		this.bHumiOtherUse.addActionListener(e);
	}
	public void bHumiRun(ActionListener e) {
		this.bHumiRun.addActionListener(e);
	}
	public void bHumiPause(ActionListener e) {
		this.bHumiPause.addActionListener(e);
	}
	public void bHumiSave(ActionListener e) {
		this.bHumiSave.addActionListener(e);
	}
	public void bHumiLoad(ActionListener e) {
		this.bHumiLoad.addActionListener(e);
	}
	public void bHumiReset(ActionListener e) {
		this.bHumiReset.addActionListener(e);
	}
	
	/**
	 * method to set lblCurrentTemp 
	 * @param currentTemp current temperature
	 */
	public void setLblCurrentTemp(String currentTemp){
		lblCurrentTemp.setText(String.valueOf(currentTemp) + "\u00b0" + "C");
	}
	/**
	 * method to set lblTempUpdateRate
	 * @param tempUpdateRate rate of change
	 */
	public void setLblTempUpdateRate(String tempUpdateRate){
		lblTempUpdateRate.setText(String.valueOf(tempUpdateRate) + "\u00b0" + "C/s");
	}
	/**
	 * method to set lblTempLimitUpper
	 * @param tempLimitUpper upper limit
	 */
	public void setLblTempLimitUpper(String tempLimitUpper){
		lblTempLimitUpper.setText(String.valueOf(tempLimitUpper) + "\u00b0" + "C");
	}
	/**
	 * method to set lblTempLimitLower
	 * @param tempLimitLower lower limit
	 */
	public void setLblTempLimitLower(String tempLimitLower){
		lblTempLimitLower.setText(String.valueOf(tempLimitLower) + "\u00b0" + "C");
	}
	/**
	 * method to set thermostat visual as on
	 */
	public void setThermostatOn(){
		tfThermostatOn.setBackground(Color.GREEN);
		tfThermostatOff.setBackground(Color.WHITE);
	}
	/**
	 * method to set thermostat visual as off
	 */
	public void setThermostatOff(){
		tfThermostatOn.setBackground(Color.WHITE);
		tfThermostatOff.setBackground(Color.RED);
	}
	/**
	 * method to set air conditioner visual as on
	 */
	public void setAirConditionerOn(){
		tfAirConditioner.setBackground(Color.CYAN);
		tfFurnace.setBackground(Color.WHITE);
	}
	/**
	 * method to set furnace visual as on
	 */
	public void setFurnaceOn(){
		tfAirConditioner.setBackground(Color.WHITE);
		tfFurnace.setBackground(Color.ORANGE);
	}
	/**
	 * method to set a/c and furnace visual as off
	 */
	public void setACAndFOff(){
		tfAirConditioner.setBackground(Color.WHITE);
		tfFurnace.setBackground(Color.WHITE);
	}
	
	/**
	 * method to set lblCurrentSoilMois
	 * @param s current soil moisture
	 */
	public void setLblCurrentSoilMois(String s){
		lblCurrentSoilMois.setText(String.valueOf(s) + "%");
	}
	/**
	 * method to set lblSoilMoisUpdateRate
	 * @param s rate of change
	 */
	public void setLblSoilMoisUpdateRate(String s){
		lblSoilMoisUpdateRate.setText(String.valueOf(s) + "%/s");
	}
	/**
	 * method to set lblSoilMoisLimitUpper
	 * @param s upper limit
	 */
	public void setLblSoilMoisLimitUpper(String s){
		lblSoilMoisLimitUpper.setText(String.valueOf(s) + "%");
	}
	/**
	 * method to set lblSoilMoisLimitLower
	 * @param s lower limit
	 */
	public void setLblSoilMoisLimitLower(String s){
		lblSoilMoisLimitLower.setText(String.valueOf(s) + "%");
	}
	/**
	 * method to set sprinkler visual as on
	 */
	public void setSprinklerOn(){
		tfSprinklerOn.setBackground(Color.GREEN);
		tfSprinklerOff.setBackground(Color.WHITE);
	}
	/**
	 * method to set sprinkler visual as off
	 */
	public void setSprinklerOff(){
		tfSprinklerOn.setBackground(Color.WHITE);
		tfSprinklerOff.setBackground(Color.RED);
	}
	
	/**
	 * method to set lblCurrentHumi
	 * @param s current humidity
	 */
	public void setLblCurrentHumi(String s){
		lblCurrentHumi.setText(String.valueOf(s) + "%");
	}
	/**
	 * method to set lblHumiUpdateRate
	 * @param s rate of change
	 */
	public void setLblHumiUpdateRate(String s){
		lblHumiUpdateRate.setText(String.valueOf(s) + "%/s");
	}
	/**
	 * method to set lblHumiLimitUpper
	 * @param s upper limit
	 */
	public void setLblHumiLimitUpper(String s){
		lblHumiLimitUpper.setText(String.valueOf(s) + "%");
	}
	/**
	 * method to set lblHumiLimitLower
	 * @param s lower limit
	 */
	public void setLblHumiLimitLower(String s){
		lblHumiLimitLower.setText(String.valueOf(s) + "%");
	}
	/**
	 * method to set humidifier visual as on
	 */
	public void setHumidifierOn(){
		tfHumidifierOn.setBackground(Color.GREEN);
		tfHumidifierOff.setBackground(Color.WHITE);
	}
	/**
	 * method to set humidifier visual as off
	 */
	public void setHumidifierOff(){
		tfHumidifierOn.setBackground(Color.WHITE);
		tfHumidifierOff.setBackground(Color.RED);
	}
	
	/**
	 * method to return string of current temperature label
	 * @return current temperature
	 */
	public String getLblCurrentTemp(){
		return lblCurrentTemp.getText();
	}
	/**
	 * method to return string of temperature rate of change
	 * @return rate of change
	 */
	public String getLblCurrentTempRate(){
		return lblTempUpdateRate.getText();
	}
	
	/**
	 * method to return string of current soil moisture label
	 * @return current soil moisture
	 */
	public String getLblCurrentSoilMois(){
		return lblCurrentSoilMois.getText();
	}
	/**
	 * method to return string of soil moisture rate of change
	 * @return rate of change
	 */
	public String getLblCurrentSoilMoisRate(){
		return lblSoilMoisUpdateRate.getText();
	}
	
	/**
	 * method to return string of current humidity label
	 * @return current humidity
	 */
	public String getLblCurrentHumi(){
		return lblCurrentHumi.getText();
	}
	/**
	 * method to return string of humidity rate of change
	 * @return rate of change
	 */
	public String getLblCurrentHumiRate(){
		return lblHumiUpdateRate.getText();
	}
	
}
