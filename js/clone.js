$(document).ready(function()
{
	$("#mybutton").click(function()
	{
		var add=$("#text").val();
		$("#para").text(add).clone().appendTo("body");
		



	});

});