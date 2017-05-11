$(document).ready(function()
{
	$("#button").click(function(){
		date();

		var firstsname=$("#text").val();
		if(firstsname=="")
		{
			$("#name").text("This field is manditory");
		}
		else
		{
			$("#name").text("");
		}
		var surname=$("#text1").val();
		if(surname=="")
		{
			$("#name1").text("This field is manditory");
		}
		else
		{
			$("#name1").text("");
		}
		var mobemail=$("#text2").val();
		if(mobemail=="")
		{
			$("#mobile").text("This field is manditory");
		}
		else if(/^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/ .test(mobemail)==true || /^(?:(?:\+|0{0,2})91(\s*[\-]\s*)?|[0]?)?[789]\d{9}$/.test(mobemail)==true)
		{
			$("mobile").text("");
		}
		else
		{
			$("#mobile").text("Invalid");
		}
		var pass=$("#text3").val();
		if(pass=="")
		{
			$("#password").text("This field is manditory");
		}
		else if(/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,}/.test(pass)==false)
		{
			$("#password").text("Invalid");

		}
		else
		{
			$("password").text("");
		}
	});


});
function date()
{
	var d = new Date();
    var n = d.getFullYear();
    var x=$("#year").val();

    if(n-x<13)
   {
   	alert("Sorry you are under age to use Facebook.");
   }
}