package com.del.webapp.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.del.webapp.dao.CoursesDAO;
import com.del.webapp.entity.Courses;
@WebServlet("/CoursesCrudServlet")
public class CoursesCrudServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String submit = request.getParameter("sub");
		CoursesDAO cdao = new CoursesDAO();
		Courses c = new Courses();
		String message = "successfull";
		c.setCourse_id(Integer.parseInt(request.getParameter("course_id")));
		RequestDispatcher rd = request.getRequestDispatcher("CoursesCrud.jsp");
        if(submit.equals("Add_Courses") || submit.equals("Modify_Courses"))
		{
			c.setCourse_name(request.getParameter("course_name"));
			c.setCourse_duration(Double.parseDouble(request.getParameter("course_duration")));
			c.setCourse_fee(Double.parseDouble(request.getParameter("course_fee")));
			if(submit.equals("Add_Courses"))
			{
				cdao.insertCourses(c);
				message=message+"Inserted Record";
			}
			else
			{
				cdao.modifyCourses(c);
				message=message+"Modified Record";
			}
		}
		else if(submit.equals("Delete_Courses"))
		{
			if(cdao.removeCourses(c.getCourse_id()))
				message=message+"Record Deleted";
			else
				message="Deletion Failed";
		}
		else if(submit.equals("Show_Courses"))
		{
			c = cdao.getCourses(c.getCourse_id());
			request.setAttribute("cour", c);
		}
		out.println("<h1><center>"+message+"</center></h1>");
		rd.include(request,response);
	}
}
