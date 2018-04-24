package parts_of_system;

import java.util.TreeSet;

import comparator_implements.*;


public class Department {
	private Teacher bossOfDepartmen;
	private String departmentName;
	
	public TreeSet<Teacher> teachersOfdepartment = new TreeSet<Teacher>(new HumanComparator<Teacher>());
	public TreeSet<Student> studentsOfdepartment = new TreeSet<Student>(new HumanComparator<Student>());
	public TreeSet<Group> groupsOfdepartment = new TreeSet<Group>(new UniversityComparator<Group>());
	
	public Department(String departmentName) {
		setDepartmentName(departmentName);
	}

	public Teacher getBossOfDepartmen() {
		return bossOfDepartmen;
	}

	public void setBossOfDepartmen(Teacher bossOfDepartmen) {
		this.bossOfDepartmen = bossOfDepartmen;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String toString() {
		return this.departmentName;
	}
	public static void addDepartment(String departmentName, Institute inst) {
	
		inst.departments.add(new Department(departmentName));
		
	}
	public static Department getDepartment(String departmentName,Institute inst) {
		for(Department dep : inst.departments) {
			if((dep.getDepartmentName().equals(departmentName))) {
				return dep;
			}
		}
		System.out.println("Department with such name doesn't exist");
		return null;
	}
}
