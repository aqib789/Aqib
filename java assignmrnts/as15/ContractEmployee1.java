package myfirstpackage;

public class ContractEmployee1 extends Employee4spl implements PromotionalOffer {

	public ContractEmployee1(String name, String designation, int age, int PF,
			int gratuity, int salary)
	{
		super(name, designation, age, PF, gratuity, salary);
		
	}
	
int Empcode;
public void SetEmpcode(int Ecode)
{
	this.Empcode=Ecode;
}
public int GetEmpcode()
{
	return  Empcode;
}
 int Contractduration;
	

	public int getContractduration()
	{
	return Contractduration;
}
public void setContractduration(int contractduration)
{
	Contractduration = contractduration;
}

	int phone;
	public void Setphone(int ph)
	{
		this.phone=ph;
	}
	public int Getphone()
	{
		return  phone;
	}
	String Gender;
	public void setgender(String gender)
	{
		this.Gender=gender;
	}
	
	public String Getgender()
	{
		return  Gender;
	}
	void display()
	{
		System.out.println("EmpCode:"+ GetEmpcode());
		System.out.println("Gender:"+ Getgender());
		System.out.println("PhoneNo:"+ Getphone());
		System.out.println("Contract duration:"+getContractduration());
	}
	public void seasonoffer(int totalpurchaseamount)
	{
		totalpurchaseamount=totalpurchaseamount*15/100;
		System.out.println("15% of purchase:"+totalpurchaseamount);
	}
	public void regularoffer(int amount)
	{
		amount=amount*8/100;
		System.out.println("8% of purchase:"+amount);
	}


}
