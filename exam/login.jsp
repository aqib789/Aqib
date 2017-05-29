<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String email1,pass1;
email1=request.getParameter("email1");
pass1=request.getParameter("pass1");

Class.forName("com.mysql.jdbc.Driver");
Connection con=null;
PreparedStatement ptmt,ptmt1=null;
ResultSet rs,rs1=null;

con=DriverManager.getConnection("jdbc:mysql://localhost/my_db", "root","");
if(con!=null)
{
	ptmt=con.prepareStatement("select * from tbl_exam where vchr_email=? and vchr_pass=?");
	ptmt1=con.prepareStatement("select * from tbl_exam where vchr_email=?");
	ptmt.setString(1, email1);
	ptmt.setString(2, pass1);
	ptmt1.setString(1, email1);
	rs=ptmt.executeQuery();
	rs1=ptmt1.executeQuery();
	
	if(rs.next())
	{
		response.sendRedirect("ok.jsp");
	}
	else if(rs1.next())
	{
		response.sendRedirect("perror.jsp");
	}
	else
	{
		
		response.sendRedirect("uerror.jsp");
	}
	
}
%>

</body>
</html>