package parts_of_system;

public class Student extends Human {
	private int yearOfstyding;
	private String groupName;

	public Student(Human hum, int yearOfstyding, Group group) {
		super(hum.getFirstName(), hum.getSecondName(), hum.getYearOfBirth());
		this.yearOfstyding = yearOfstyding;
		this.groupName = group.getNameOfGroup();
	}
	
	public int getYearOfstyding() {
		return yearOfstyding;
	}
	public void setYearOfstyding(int yearOfstyding) {
		this.yearOfstyding = yearOfstyding;
	}
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(Group group) {
		this.groupName = group.getNameOfGroup();
	}
	@Override
	public String toString() {
		return this.getFirstName()+ " " + this.getSecondName();
		
	}
	
	
public static void addStudent(Human hum, int yearOfstyding,  Group g, Department dep) {
	
	g.students.add(new Student(hum, yearOfstyding, g)); 
	
	dep.studentsOfdepartment.add(Student.getStudent(hum, g)); 
	
}
public static Student getStudent(Human hum, Group g) {
	
	for(Student stud : g.students) {
		if((stud.getSecondName().equals(hum.getSecondName())) & (stud.getFirstName().equals(hum.getFirstName()))) {
			return stud;
		}
	}
	System.out.println("Student with such First and Second name doesn't exist");
	return null;
	}


}
