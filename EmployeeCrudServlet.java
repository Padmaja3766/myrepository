package com.del.second.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.del.second.dao.EmployeeDAO;
import com.del.second.entity.Employee;
@WebServlet("/EmployeeCrudServlet")
public class EmployeeCrudServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String submit = request.getParameter("sub");
		EmployeeDAO edao = new EmployeeDAO();
		Employee e = new Employee();
		String message = "successfull";
		e.setEmp_id(Integer.parseInt(request.getParameter("emp_id")));
		RequestDispatcher rd = request.getRequestDispatcher("EmployeeCrud.jsp");
        if(submit.equals("Add_Employee") || submit.equals("Modify_Employee"))
		{
			e.setName(request.getParameter("ename"));
			e.setSalary(Double.parseDouble(request.getParameter("salary")));
			e.setDoj(Date.valueOf(request.getParameter("doj")));
			if(submit.equals("Add_Employee"))
			{
				edao.insertEmployee(e);
				message=message+"Inserted Record";
			}
			else
			{
				edao.modifyEmployee(e);
				message=message+"Modified Record";
			}
		}
		else if(submit.equals("Delete_Employee"))
		{
			if(edao.removeEmployee(e.getEmp_id()))
				message=message+"Record Deleted";
			else
				message="Deletion Failed";
		}
		else if(submit.contentEquals("Show_Employee"))
		{
			e = edao.getEmployee(e.getEmp_id());
			request.setAttribute("emp", e);
		}
		out.println("<h1><center>"+message+"</center></h1>");
		rd.include(request,response);
	}
}
