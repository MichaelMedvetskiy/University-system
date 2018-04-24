package parts_of_system;


import java.util.TreeSet;

import comparator_implements.UniversityComparator;

public class University {
	private String bossOfUniversity;
	private String nameOfUniver;
	private int yearofFoundation;
	
	public static TreeSet<University> university = new TreeSet<University>(new UniversityComparator<University>());
	public TreeSet<Institute> institute = new TreeSet<Institute>(new UniversityComparator<Institute>());
	public TreeSet<Corp> corps = new TreeSet<Corp>(new UniversityComparator<Corp>());
	
	public University(String nameOfUniver, int yearofFoundation) {
		setNameOfUniver(nameOfUniver);
		setYearofFoundation(yearofFoundation);
	}
	
	//Getter and Setters
	public String getBossOfUniversity() {
		return bossOfUniversity;
	}
	public void setBossOfUniversity(String bossOfUniversity) {
		this.bossOfUniversity = bossOfUniversity;
	}
	public String getNameOfUniver() {
		return nameOfUniver;
	}
	public void setNameOfUniver(String nameOfUniver) {
		this.nameOfUniver = nameOfUniver;
	}
	public int getYearofFoundation() {
		return yearofFoundation;
	}
	public void setYearofFoundation(int yearofFoundation) {
		this.yearofFoundation = yearofFoundation;
	}
	public String toString() {
		return this.nameOfUniver;
	}
	public static void addUniversity(String nameOfUniver, int yearofFoundation) {
		
		university.add(new University(nameOfUniver, yearofFoundation));
	}
	public static University getUniversity(String nameOfUniver) {
		for(University univ : university) {
			if((univ.getNameOfUniver().equals(nameOfUniver))) {
				return univ;
			}
		}
		System.out.println("University with such name doesn't exist");
		return null;
	}

}
