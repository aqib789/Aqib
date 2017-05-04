package myfirstpackage;

public class ContractMain {
	public static void main(String [] args)
	{
		ContractEmployee obj=new ContractEmployee("Jasim","Accounter",22,200,300,40000);
		obj.setContractcode(5);
		obj.display();
		obj.empdisplay();
		
	}

}
