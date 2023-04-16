package student;

public class StudentInfo {
	
		String name;
		String major;
		int id;
		
	

	public StudentInfo(String name,String major,int id) {
		
		this.name=name;
		this.major=major;
		this.id=id;
		
		
	}
	public void printInfo() {
		System.out.println("Name" + name);
		System.err.println("Major"+major);
		System.out.println("id"+id);
	}

}
