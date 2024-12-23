package school.management.system;

public class Teacher {
	
	//declaring all variables required for teacher class
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	//creating a new teacher 
	public Teacher(int id, String name, int salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		salaryEarned=0;
	}
	
	//to get name of the teacher
	public String getname(){
		return name;
	}
	
	//to get id of the teacher
	public int getid(){
		return id;
	}
	
	//to get salary of the teacher
	public int getsalary() {
		return salary;
	}
	
	//to set a salary of the teacher
	public void setsalary(int salary) {
		this.salary=salary;
	}
	
	/**
	 * Adds salary to the teacher
	 * Adds amount to MoneySpent by the school.
	 * @param salary
	 */
	public void receiveSalary(int salary) {
		salaryEarned+=salary;
		School.updateTotalMoneySpent(salary);
	}
	
	@Override
	public String toString() {
		return "Teacher Name: "+name+"\n"
				+"Teacher ID: "+id+"\n"
				+"Teacher Salary: "+salary+"\n"
				+"Salary earned so far:"+salaryEarned;
	}
	
}
