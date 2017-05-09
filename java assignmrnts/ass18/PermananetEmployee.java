package ass18;

public class PermananetEmployee extends Employee  implements  promotinalOffers 
{

	
	public PermananetEmployee(String name, String designation, int age, int PF,
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
	
	private String Getpcode() 
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
	public void SetTotalEmi(int TotalEmi)
	{
		this.totalEMI=TotalEmi;
	}
	public int GetTotalEmi()
	{
		return  totalEMI;
	}
	
	void disp()
	{
		//System.out.println("EmpCode:"+ GetEmpcode());
		System.out.println("Gender:"+ Getgender());
		System.out.println("PhoneNo:"+ Getphone());
		System.out.println("PermanentCode:"+ Getpcode());
		
		
		
	}
	
	public void seasonOffer(int totalPurchaseAmount) {
		totalPurchaseAmount=totalPurchaseAmount*25/100;
		System.out.println("25% of purchase:"+totalPurchaseAmount);
		
	}
	
	public void regularOffer(int amount) {
		amount=amount*10/100;
		System.out.println("10% of purchase:"+amount);
		
	}
	public void setInsureAmount(int InsureAmount)
	{
		this.InsureAmount=InsureAmount;
	}
	void registerInsurance()
	{
		InsuranceNo="INS_"+GetEmpcode()+"721";
		System.out.println("InsuranceNo:"+InsuranceNo);
		System.out.println("InsureAmount:"+GetInsureAmount());
		
	}
	void payEmi()
	{ int emi;
		emi=GetInsureAmount()*5/100;
		int PayEMI=emi+GetTotalEmi();
		System.out.println("PayEMI:"+PayEMI);
		
	}


	}
