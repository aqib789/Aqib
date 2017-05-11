$(document).ready(function()
{
	$("#mybutton").click(function()
	{
		var add=$("#text").val();
		$("#select").append("<option>"+add+"</option>");




	});

});