package observer;

import adapter2.ShowPacientTableGUI;
import domain.Covid19Pacient;
import factory.FactorySympthom;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Covid19Pacient pacient=new Covid19Pacient("aitor", 25,new FactorySympthom());
		new PacientObserverGUI (pacient);
		new PacientSymptomGUI ((Covid19Pacient)pacient);
		new PacientThermometerGUI((Covid19Pacient)pacient);
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
		gui.setPreferredSize(new java.awt.Dimension(300, 200));
		gui.setVisible(true);		/*
		 * Covid19Pacient pacient2=new Covid19Pacient("ane", 22,new FactorySympthom());
		new PacientObserverGUI (pacient2);
		new PacientSymptomGUI ((Covid19Pacient)pacient2);*/
	}
}