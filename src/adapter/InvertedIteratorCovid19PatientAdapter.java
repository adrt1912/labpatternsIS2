package adapter;

import domain.Covid19Pacient;
import domain.Symptom;
import java.util.Vector;

public class InvertedIteratorCovid19PatientAdapter implements InvertedIterator{

	int pos=0;
	Vector<Symptom> symptom;
	
	public InvertedIteratorCovid19PatientAdapter(Covid19Pacient p) {
		symptom=new Vector<Symptom>(p.getSymptoms());
	}
	
	@Override
	public Object previous() {
		Symptom sintoma=symptom.get(pos);
		pos--;
		return sintoma;
	}

	@Override
	public boolean hasPrevious() {
		return pos>=0;
	}

	@Override
	public void goLast() {
		pos=symptom.size()-1;
	}
}