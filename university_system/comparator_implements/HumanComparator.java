package comparator_implements;

import java.util.Comparator;

import parts_of_system.Human;


public class HumanComparator<T> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		
		String aSubN = ((Human) o1).getSecondName();
		String bSubN = ((Human) o2).getSecondName();
		
			if((aSubN.compareTo(bSubN)) == 0) {
				aSubN = ((Human) o1).getFirstName();
				bSubN = ((Human) o2).getFirstName();
			
				return aSubN.compareTo(bSubN);
			}
			return aSubN.compareTo(bSubN);	 
	}
}
