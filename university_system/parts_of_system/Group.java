package parts_of_system;

import java.util.*;

import comparator_implements.*;

public class Group {
	private Student chief;
	private Teacher curator;
	private String nameOfgroup;
	private Object department;
	private int yearOfstyding;
	

	public TreeSet<Student> students = new TreeSet<Student>(new HumanComparator<Student>());
	
	
	public Group(String nameOfgroup, Department department, int yearOfstyding) {
		setNameOfGroup(nameOfgroup);
		setDepartment(department);
		setYearOfstyding(yearOfstyding);
	}

	public Student getChief() {
		return chief;
	}

	public void setChief(Student chief) {
		this.chief = chief;
	}

	public Teacher getCurator() {
		return curator;
	}

	public void setCurator(Teacher curator) {
		this.curator = curator;
	}

	public String getNameOfGroup() {
		return nameOfgroup;
	}

	public void setNameOfGroup(String nameOfgroup) {
		this.nameOfgroup = nameOfgroup;
	}

	public Object getDepartment() {
		return department;
	}

	public void setDepartment(Object department) {
		this.department = department;
	}

	public int getYearOfstyding() {
		return yearOfstyding;
	}

	public void setYearOfstyding(int yearOfstyding) {
		this.yearOfstyding = yearOfstyding;
	}
	@Override
	public String toString() {
		return this.getNameOfGroup();
	}
	public static Group getGroup(String nameOfgroup, Department depart) {
		for(Group group : depart.groupsOfdepartment) {
			if((group.getNameOfGroup().equals(nameOfgroup))) {
				return group;
			}
		}
		System.out.println("This group doesn't exist");
		return null;
	}
	public static void addGroup(String nameOfgroup, Department department, int yearOfstyding) {
		
			department.groupsOfdepartment.add(new Group(nameOfgroup, department,yearOfstyding));
		
	}
	

}
