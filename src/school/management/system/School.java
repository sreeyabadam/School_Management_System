package school.management.system;

import java.util.List;
//school have multiple teachers and students
public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	//new school object is created
	public School(List<Teacher> teachers,List<Student> students) {
		this.teachers=teachers;
		this.students=students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}
	
	public List<Teacher> getTeachers(){
		return teachers;
	}
	public List<Student> getStudents(){
		return students;
	}
	
	//To add a teacher or a student
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	
	//return total money earned by the school
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public static void updateTotalMoneyEarned(int amount) {
		totalMoneyEarned+=amount;
	}
	public static void updateTotalMoneySpent(int amountsp) {
		totalMoneySpent+=amountsp;
	}
}
