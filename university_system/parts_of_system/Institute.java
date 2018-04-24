package parts_of_system;


import java.util.TreeSet;

import comparator_implements.HumanComparator;
import comparator_implements.UniversityComparator;

public class Institute {
	private String nameOfInstitute;
	private Teacher bossOfInstitute;
	private Corp corpsOfinstitute;
	
	public TreeSet<Department> departments =  new TreeSet<Department>(new UniversityComparator<Department>());
	public TreeSet<Teacher> teachersOfInstitute = new TreeSet<Teacher>(new HumanComparator<Teacher>());
	
	public Institute(String nameOfinstitute, Corp corpsOfinstitute) {
		setNameOfInstitute(nameOfinstitute);
		setCorpOfinstitute(corpsOfinstitute);
	}

	public String getNameOfInstitute() {
		return nameOfInstitute;
	}

	public void setNameOfInstitute(String nameOfinstitute) {
		this.nameOfInstitute = nameOfinstitute;
	}

	public Teacher getBossOfInstitute() {
		return bossOfInstitute;
	}

	public void setBossOfInstitute(Teacher bossOfInstitute) {
		this.bossOfInstitute = bossOfInstitute;
	}

	public Corp getCorpOfinstitute() {
		return corpsOfinstitute;
	}

	public void setCorpOfinstitute(Corp corpsOfinstitute) {
		this.corpsOfinstitute = corpsOfinstitute;
	}
	@Override
	public String toString() {
		return this.nameOfInstitute;
	}
	public static void addInstitute(String nameOfinstitute, Corp corpsOfinstitute, University univ) {
	
			univ.institute.add(new Institute(nameOfinstitute, corpsOfinstitute));
			
		
	}
	public static Institute getInstitute(String nameOfinstitute,University univ) {
		for(Institute inst : univ.institute) {
			if((inst.getNameOfInstitute().equals(nameOfinstitute))) {
				return inst;
			}
		}
		System.out.println("Institute with such name doesn't exist");
		return null;
	}

}
