package adapter;

import domain.Symptom;

public class ComparatorSeverityIndex implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int o1Index=((Symptom)o1).getSeverityIndex();
		int o2Index=((Symptom)o2).getSeverityIndex();
		
		if(o1Index>o2Index) return 1;
		else if(o1Index<o2Index)return -1;
		return 0;
	}

}
