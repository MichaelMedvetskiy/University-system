package comparator_implements;

import java.util.Comparator;

public class UniversityComparator<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		String aSubN = o1.toString();
		String bSubN = o2.toString();
		
		return aSubN.compareTo(bSubN);
		
	}

}
