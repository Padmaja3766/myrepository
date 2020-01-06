import java.sql.Date;
import java.util.ArrayList;

import com.del.dao.StudentDAO;
import com.del.entity.Student;
public class DBTest2 
{
	public static void main(String[] args)
	{
		StudentDAO sdao = new StudentDAO();
	Student s = new Student(10,"Chandra Shekar",15,new Date(1990,10,12));
	if(sdao.modifyStudent(s))
		System.out.println("Student Record Modified");
	else
		System.out.println("Modification Failed");
     /*ArrayList<Student> slist = sdao.getStudent();
     for(Student s : slist)
    	 System.out.println(s.getRno()+" "+s.getName()+" "+s.getAge());*/
		/*Student s = sdao.getStudent(13);
		if(s!=null)
			System.out.println(s.getRno()+" "+s.getName()+" "+s.getAge());
		else
			System.out.println("Employee With Rno 13 does not exist");*/
		/*if(sdao.removeStudent(103))
			System.out.println("Student Deleted Successfully");
		else
			System.out.println("Student with Rno 13 Does not Exist");*/
		
  	}
}