function test()
{
	var d = new Date();
    var n = d.getFullYear();
    var x=document.getElementById("year").value;
    
	if (document.getElementById('text').value=="") 
		{
			document.getElementById("name").innerHTML="This field is manditory";
		}
	  else
			{
				document.getElementById("name").innerHTML="";
			}
	if (document.getElementById('text1').value=="") 
		{
			document.getElementById("name1").innerHTML="This field is manditory";
		}	
	  else
			{
				document.getElementById("name1").innerHTML="";
			}
	if (document.getElementById('text2').value=="") 
		{
			document.getElementById("mobile").innerHTML="This field is manditory";

		}
	
	
	else if(/^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/ .test(document.getElementById("text2").value)==true || /^(?:(?:\+|0{0,2})91(\s*[\-]\s*)?|[0]?)?[789]\d{9}$/.test(document.getElementById("text2").value)==true)
		{
		    document.getElementById("mobile").innerHTML="";	
		}
		else
		{
			document.getElementById("mobile").innerHTML="invalid";
		}
		if (document.getElementById('text3').value=="") 
		{
			document.getElementById("password").innerHTML="This field is manditory";

		}
	else if(/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,}/.test(document.getElementById("text3").value)==false)
	{
		document.getElementById("password").innerHTML="invalid";
	}
	  else
			{
				document.getElementById("password").innerHTML="";
			}

   if(n-x<13)
   {
   	alert("Sorry you are under age to use Facebook.");
   }
}