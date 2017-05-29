<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Submit</title>
</head>
<body>
<%

String name,email,country,pass;
name=request.getParameter("name");
email=request.getParameter("email");
country=request.getParameter("country");
pass=request.getParameter("pass");


Class.forName("com.mysql.jdbc.Driver");
Connection con=null;
PreparedStatement ptmt=null;
con=DriverManager.getConnection("jdbc:mysql://localhost/my_db", "root","");
if(con!=null)
{

	ptmt=con.prepareStatement("insert into tbl_exam(vchr_name,vchr_email,vchr_country,vchr_pass) value(?,?,?,?)");
	ptmt.setString(1, name);
	ptmt.setString(2, email);
	ptmt.setString(3, country);
	ptmt.setString(4, pass);
	ptmt.execute();
	response.sendRedirect("ok.jsp");
	
	
}


%>

</body>
</html>