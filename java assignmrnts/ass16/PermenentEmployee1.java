package myfirstpackage;

public class PermenentEmployee1 extends Employee4spl  implements PromotionalOffer
{

	
	public PermenentEmployee1(String name, String designation, int age, int PF,
			int Gratuity, int salary) {
		super(name, designation, age, PF, Gratuity, salary);
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

	String PermanentCode;
	public void setpcode(String pcode)
	{
		this.PermanentCode=pcode;
	}
	public String Getpcode()
	{
		return  PermanentCode;
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
	
	
	void disp()
	{
		System.out.println("EmpCode:"+ GetEmpcode());
		System.out.println("Gender:"+ Getgender());
		System.out.println("PhoneNo:"+ Getphone());
		System.out.println("PermanentCode:"+ Getpcode());
		
		
		
	}
	public int seasonoffer(int totalpurchaseamount)
	{
		//totalpurchaseamount=totalpurchaseamount*25/100;
		//System.out.println("25% of purchase:"+totalpurchaseamount);
		return totalpurchaseamount;
	}
	public int regularoffer(int amount)
	{
		//amount=amount*10/100;
		//System.out.println("10% of purchase:"+amount);
		return amount;
	}

	}