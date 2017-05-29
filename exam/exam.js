$(document).ready(function()
{
	var a=false;
	$("#ok").click(function(){
	$("#form").submit(function(){
		
		
		if(a==false)
			{
			return false;
			}
		else
			{
			return true;
			}
	});
	var email=$("#email1").val();
	
	if (email=="")
		{
		$("#login").text("This field is manditory");
		a=false;
		
		}
	else
		{
		$("#login").text("");
		a=true;
		}
	var logpass=$("#pass1").val();
	if(logpass=="")
		{
		$("#lpass").text("This field is manditory");
		a=false;
		}
	else
		{
		$("#lpass").text("");
		a=true;
		}


});
	$("#submit").click(function(){
		
		$("#form1").submit(function(){
			
		
			if(a==false)
				{
				return false;
				}
			else
				{
				return true;
				}
		});
		var name=$("#name").val();
		if(name=="")
		{
			$("#text").text("This field is manditory");
			a=false;
		}
		else
		{
			$("#text").text("");
			a=true;
		}
		
		var email=$("#email").val();
		if(email=="")
		{
			$("#text1").text("This field is manditory");
			a=false;
		}
		else if(/^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/ .test(email)==true)
		{
			$("#text1").text("");
			a=true;
		}
		else
		{
			$("#text1").text("Invalid");
			a=false;
		}
		var pass=$("#pass").val();
		if(pass=="")
		{
			$("#text3").text("This field is manditory");
			a=false;
		}
		else if(/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,}/.test(pass)==false)
		{
			$("#text3").text("Invalid");
			a=false;

		}
		else
		{
			$("#text3").text("");
			a=true;
		}
		
		
	});
	
	
	
});