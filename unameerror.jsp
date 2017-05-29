<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Facebook</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- <script src="script/fb.js"></script>
 -->
<script src="script/fbajax.js"></script>
<link rel="stylesheet" href="css/fb.css">

<link rel="stylesheet" href="css/bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
#body {
    background-color: #dfe3ee;
}
 #background
{
background-color:#4867aa;
}
#logo
{
margin-left:180px;
}
#form
{
position: fixed;
margin-left:550px;
margin-top:-100px;
}
#img
{
 position: fixed;
 margin-left:50px;
 margin-top: 25px;
}

#regform
{
 
    position: fixed;
    margin-left: 650px;
    margin-top: 20px;
}
.container
{
	padding:0;
    width: 1110px;
}
#unerror
{
  margin: 0 0 10px;
    position: absolute;
    top: 65px;
    color: red;
}
#pwderror
{
   position: absolute;
    color: red;
    margin: 65px;
    left: 160px;
    
}
input[type=text] {
    
    padding: 2px 8px;
    margin: 8px 0;
    
}
input[type=password]
{
    
    padding: 2px 8px;
    margin: 8px 0;

    
}
.lab
{
  color:#ff0000;
}


#white{
	background-color:#ffffff;
	
}


.txtarea
	{
    z-index: auto;
    position: relative;
    letter-spacing: 2px;
    width:400px;
    ine-height: 20px;
    font-size: 14px;
    transition: none;
    background: #ffffff !important;
     border: none;
   left:20px;
    
}
.spansrch
{
	position: absolute;
    left: 328px;
}

.add{
	z-index: auto;
    position: relative;
    letter-spacing: 12px;
    bottom: 20px;
    ine-height: 20px;
    font-size: 14px;
    transition: none;
    background: #3b5998 !important;
    right: 55px;
	
}
.field{
	
	height: 100px;
   
  
    width:640px;
    
}
.top-buffer { margin-top:100px; }
#diverror{
	background-color: white;
    width: 500px;
	    height: 350px;
}

.border{
	border-right:1px solid grey;
	
}
</style>
</head>
<body id="body">
<div  id="background">

<div class="row">

 <div class="col-xs-12 col-lg-12 col-md-2">
 </div>
 <div class="col-xs-12 col-lg-12 col-md-8">
<font color="#ffffff" size="10" face="Blurry"> facebook</font> 
 <input type="button"  class="btn btn-success" value="SignUp">
  </div>
  <div class="col-xs-12 col-lg-12 col-md-2">
 </div>
 </div>
 </div>
 <div class="row">
 <form:form name="loginform" id="loginform" method="POST" action="/spring3/login" modelAttribute="LoginBean">
 <div class="row top-buffer">
 <div class="col-xs-12 col-lg-12 col-md-4">
 </div>
  <div class="col-xs-12 col-lg-12 col-md-4">
 <div id="diverror">
 <div class="col-xs-12 col-lg-12 col-md-12">
 <label>Facebook Login</label><hr>
 </div>
 <div class="row">
 <div class="col-xs-12 col-lg-12 col-md-2"></div>
 <div class="col-xs-12 col-lg-12 col-md-3">
 <label>Email or Phone</label></div>
 <div class="col-xs-12 col-lg-12 col-md-7" >
<input type="text" id="txtusername" name="uname" style="border-color:red;">

          <span class="glyphicon glyphicon-warning-sign" style="right:25px;color:red;"></span>
        
 </div>
 </div>
 <div class="row">
 <div class="col-xs-12 col-lg-12 col-md-2"></div>
 <div class="col-xs-12 col-lg-12 col-md-3">
 <label>Password:</label></div>
 <div class="col-xs-12 col-lg-12 col-md-7">
 <input type="password"   id="txtpassword"  name="pswd" data-toggle="tooltip" data-placement="top"  style="color:red;"title="The password that you've entered  is incorrect <b> Forgotten password</b>"></div>
 </div> <br>
 <div class="row">
 <div class="col-xs-12 col-lg-12 col-md-5"></div>
 <div class="col-xs-12 col-lg-12 col-md-7">
 <input type="checkbox">Keep me logged in</div>
 </div><br>
 <div class="row">
 <div class="col-xs-12 col-lg-12 col-md-5"></div>
 <div class="col-xs-12 col-lg-12 col-md-7">
 <input type="submit" class=" btn btn-primary" id="btnlogin" value="Login" > or 
 <a href="facebook.jsp"> Sign up for Facebook</a></div>
 </div><br>
 <div class="row">
 <div class="col-xs-12 col-lg-12 col-md-5"></div>
 <div class="col-xs-12 col-lg-12 col-md-7">
 <a href=""> Forgotten Password??</a></div>
 </div>
 </div>
 </div>
 </div>
 </form:form>
 </div>
 

</body>
</html>