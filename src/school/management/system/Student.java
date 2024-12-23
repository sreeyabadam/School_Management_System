package school.management.system;

public class Student {
	//student has following properties
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feestotal;	
	
	//to add a new student:
	public Student(int id,String name,int grade) {
		this.id=id;
		this.name=name;
		this.grade=grade;
		feesPaid=0;
		feestotal=30000;
	}
	//to change the feesPaid section of student
	public void PayFees(int fee) {
		feesPaid+=fee;
		School.updateTotalMoneyEarned(fee);
	}
	
	//to change the grade of the student:
	public void setGrade(int grade) {
		this.grade=grade;
	}
	
	//get id of the student
	public int getId() {
		return id;
	}
	public int getgrade() {
		return grade;
	}
	public String name() {
		return name;
	}
	public int getFeesPaid() {
		return feesPaid;
	}
	public int getFeesTotal() {
		return feestotal;
	}
	public int getRemainingFees() {
		return feestotal-feesPaid;
	}
	@Override
	public String toString() {
		return "Student name: "+name+
				"\nFees Paid so far: "+feesPaid;
	}
	
}


