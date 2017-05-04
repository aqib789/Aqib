package myfirstpackage;

public class PermenentEmployee extends Employee4 {

	public PermenentEmployee(String name, String designation, int age, int PF,
			int gratuity, int salary)
	{
		super(name, designation, age, PF, gratuity, salary);
		
	}
	int permenentcode;
	public int getPermenentcode() 
	{
		return permenentcode;
	}
	public void setPermenentcode(int permenentcode)
	{
		this.permenentcode = permenentcode;
	}
	void display()
	{
		System.out.println("permenent code:"+permenentcode);
	}

}
