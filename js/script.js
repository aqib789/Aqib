$(document).ready(function()
{
	
	$("#mybutton").click(function(){
		
		$("#demo").hide();
		var name=$("#text").val();
		if(name=="")
		{
		 $("#para").text("please enter a value");
		}
		else
		{
		$("#para").text(name);
		}
	});
	$("#mybutton").dblclick(function(){
		$("#demo").show();
	});
});
function myfunction()
{
	alert("hai");
}