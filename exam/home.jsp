<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<script type="text/javascript" src="javascript/jquery.js"></script>
<script type="text/javascript" src="javascript/exam.js"></script>
</head>
<body>
<div class="Header" >
<div class="container">
	<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-4" style="background-color:blue";>
		<form id="form" action="login.jsp" method="post"><br>
			<label>Login</label><br>
			<input type="text" placeholder="User name" name="email1" id="email1">
			<div id="login" style="position:absolute; left:146px; color:red;"></div>
			<br><br>
			
			<input type="password" placeholder="Password" name="pass1" id="pass1">
			<div id="lpass" style="position:absolute; left:146px; color:red;"></div>
			<br>
			
			<input type="Submit" value="login" id="ok">
		</form>
		<br>
		</div>
	</div>

</div>
</div>
<br><br><br><br>
<div class="Footer" >
	<div class="container">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4"style="background-color:grey";>
			<br>
			<form id="form1" action="submit.jsp" method="post" >
				<label>Name</label>
				<input type="text" style="margin-left:90px"; name="name" id="name">
				<div id="text" style="position:absolute; left:234px; color:red;"></div>
				<br>
				<label>Gender</label>
				<font size=3><input type="radio" name="optradio" style="margin-left:91px">Male</font>
							<font size=3><input type="radio" name="optradio">Female</font><br>
				<label>Email</label>
				<input type="text" style="margin-left:91px"; name="email" id="email">
				<div id="text1" style="position:absolute; left:234px; color:red;"></div>
				<br>
				<label>Country</label>
				<select style="margin-left:73px"; name="country" id="coundry">
					<option>India</option>
					<option>Germany</option>
					<option>Australia</option>
					<option>UAE</option>	
				</select>
				<div id="text2" style="position:absolute; left:146px; color:red;"></div>
				<br>
				<label>Hobbies</label>
				<input type="checkbox" style="margin-left:74px";>Reading<br>
				<input type="checkbox" style="margin-left:135px";>Music<br>
				<input type="checkbox" style="margin-left:135px";>Browsing<br>
				<input type="checkbox" style="margin-left:135px";>Playing<br>
				<label>Password</label>
				<input type="password" style="margin-left:64px"; name="pass" id="pass">
				<div id="text3" style="position:absolute; left:146px; color:red;"></div>
				<br>
				<div class="col-md-4"></div>
				<div class="col-md-4"><br>
					<input type="Submit" value="Submit" id="submit">
				</div>
			</form>
				
			</div>		
		</div>
	</div>
</div>


</body>
</html>