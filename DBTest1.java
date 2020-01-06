import java.sql.Date;
import java.util.ArrayList;

import com.del.dao.EmployeeDAO;
import com.del.entity.Employee;
public class DBTest1 
{
	public static void main(String[] args)
	{
		EmployeeDAO edao = new EmployeeDAO();
	/*Employee e = new Employee(103,"Chandra Shekar",2200,new Date(1990,10,12));
	if(edao.modifyEmployee(e))
		System.out.println("Employee Record Modified");
	else
		System.out.println("Modification Failed");*/
     /*ArrayList<Employee> elist = edao.getEmployee();
     for(Employee e : elist)
    	 System.out.println(e.getEmpid()+" "+e.getName()+" "+e.getSalary());*/
		Employee e = edao.getEmployee(102);
		if(e!=null)
			System.out.println(e.getEmpid()+" "+e.getName()+" "+e.getSalary());
		else
			System.out.println("Employee With id 103 does not exist");
		/*if(edao.removeEmployee(103))
			System.out.println("Employee Deleted Successfully");
		else
			System.out.println("Employee with id 103 Does not Exist");*/
		
  	}
}