package adapter;

import domain.Symptom;

public class ComparatorSymptomName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		String o1Name=((Symptom) o1).getName();
		String o2Name=((Symptom) o2).getName();
		
		return o1Name.compareTo(o2Name);			
	}
}