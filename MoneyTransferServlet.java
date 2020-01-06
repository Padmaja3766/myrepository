package com.del.first.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.del.first.dao.AccountsDAO;
@WebServlet("/MoneyTransferServlet")
public class MoneyTransferServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = null;
		/*Cookie[] c = request.getCookies();
		for(Cookie c1 : c)
			if(c1.getName().contentEquals("username"))
					username=c1.getValue();*/
		HttpSession session = request.getSession();
		username = (String) session.getAttribute("username");
		double amount = Double.parseDouble(request.getParameter("amount"));
		if(new AccountsDAO().updateBalance(username, amount))
			out.println("<h1>Amount Transfer Successfull</h1>");
		else
			out.println("<h1>Transfer Failed</h1>");
	}

}
