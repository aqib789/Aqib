package myfirstpackage;

public class ContractEmployee extends Employee4 {

	public ContractEmployee(String name, String designation, int age, int PF,
			int gratuity, int salary)
	{
		super(name, designation, age, PF, gratuity, salary);
		
	}
	int Contractcode;
	public int getContractcode() 
	{
		return Contractcode;
	}
	public void setContractcode(int Contractcode)
	{
		this.Contractcode = Contractcode;
	}
	void display()
	{
		System.out.println("Contract duration:"+Contractcode);
	}

}
