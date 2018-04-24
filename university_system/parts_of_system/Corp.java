package parts_of_system;


public class Corp {
	private String address;
	private String name;
	
	public Corp(String address, String name) {
		setAddress(address);
		setName(name);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
	public static void addCorp(String address, String name, University univ) {
		
			univ.corps.add(new Corp(address, name));
		
	}
	public static Corp getCorps(String name,University univ) {
		for(Corp corp : univ.corps) {
			if((corp.getName().equals(name))) {
				return corp;
			}
		}
		System.out.println("Corp with such number doesn't exist");
		return null;
	}

}
