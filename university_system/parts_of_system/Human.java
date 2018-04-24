package parts_of_system;

public class Human {
	private String firstName;
	private String secondName;
	private int yearOfBirth;

	public Human(String firstName, String secondName, int yearOfBirth) {
		setFirstName(firstName);
		setSecondName(secondName);
		setYearOfBirth(yearOfBirth);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public static void addHuman(String firstName, String secondName, int yearOfBirth) {
		new Human(firstName, secondName, yearOfBirth);
	}
	
}
