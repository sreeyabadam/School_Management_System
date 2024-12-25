package school.management.system;
import java.util.*;
public class Main
 {
	public static void main(String args[]) {
		Teacher lizzy=new Teacher(1,"Lizzy",1500);
		Teacher tom=new Teacher(2,"Tom",1200);
		Teacher riya=new Teacher(3,"Riya",1300);
		
		
		List<Teacher> teachersList=new ArrayList<>();
		teachersList.add(lizzy);
		teachersList.add(tom);
		teachersList.add(riya);
		
		Student sreeya=new Student(1,"Sreeya",5);
		Student jags=new Student(2,"Jags",9);
		Student priya=new Student(3,"Priya",10);
		
		List<Student> studentsList=new ArrayList<>();
		studentsList.add(sreeya);
		studentsList.add(jags);
		studentsList.add(priya);
		
		School ZPHS=new School(teachersList,studentsList);
		
		sreeya.PayFees(1000);
		
		System.out.println(sreeya.getFeesPaid());
		System.out.println("Remaining fees to be paid by sreeya is: "+sreeya.getRemainingFees());
		System.out.println("Total Money earned by the school: "+ZPHS.getTotalMoneyEarned());
		
		jags.PayFees(6000);
		System.out.println("Total Money earned by the school: "+ZPHS.getTotalMoneyEarned());
		
		System.out.println("--MAKING SCHOOL PAY SALARIES--");
		lizzy.receiveSalary(lizzy.getsalary());
		tom.receiveSalary(tom.getsalary());
		System.out.println("Total Money spent by the school: "+ZPHS.getTotalMoneySpent());
		riya.receiveSalary(riya.getsalary());
		System.out.println("\n"+riya);
	}
}
