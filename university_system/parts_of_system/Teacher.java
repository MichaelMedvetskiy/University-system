package parts_of_system;

public class Teacher extends Human {
	private String department;
	private String title;
	private String[] subjects;
	
	public Teacher(Human hum, String department, String title, String...subjects) {
		super(hum.getFirstName(), hum.getSecondName(), hum.getYearOfBirth());
		this.department = department;
		this.title = title;
		this.subjects = subjects;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	public Object showSubjects(Object[] s) {
		return s;
	}
	@Override
	public String toString() {
		return this.getFirstName()+ " " + this.getSecondName();
		
	}
	public static void addTeacher(Human hum, String department, String title, Department dep ,String...subjects) {
			dep.teachersOfdepartment.add(new Teacher(hum, department, title, subjects));
	}
	public static Teacher getTeacher(Human hum, Department dep) {
		for(Teacher tch : dep.teachersOfdepartment) {
			if((tch.getSecondName().equals(hum.getSecondName())) && (tch.getFirstName().equals(hum.getFirstName()))) {
				return tch;
			}
		}
		System.out.println("Teacher with such First and Second name doesn't exist");
		return null;
	}

	
}
