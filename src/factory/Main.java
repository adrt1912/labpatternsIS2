package factory;

import domain.Covid19Pacient;
import domain.Medicament;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p1=new Covid19Pacient("aitor", 35,new FactorySympthom());
		new PacientSymptomGUI(p1);
		new MedicalGUI(new Medicament("Ibuprofeno",new FactorySympthom()));
		
		Covid19Pacient p2=new Covid19Pacient("Juan",20,new FactorySympthom());
		p2.addSymptomByName("vómitos",2);
		p2.addSymptomByName("nauseas",1);
		p2.addSymptomByName("astenia", 3);
		p2.addSymptomByName("expectoracion", 1);
		p2.addSymptomByName("hemoptisis", 2);;
	}
}