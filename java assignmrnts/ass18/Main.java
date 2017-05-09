package ass18;

public class Main  extends Insurance
{
 
	
	
	
	public static void main(String[] args) {
		
		PermananetEmployee pemp=new PermananetEmployee("John", "HR", 35, 200, 300, 15000);
		System.out.println("Permanent Employee");
		System.out.println("....................");
		
		pemp.empdisplay();
		pemp.setpcode("PM100");
		pemp.Setphone(98967623);
		pemp.SetEmpcode(1001);
		pemp.setgender("Male");
		//pemp.regularOffer(2500);
		//pemp.seasonOffer(2000);
		pemp.SetTotalEmi(10000);
		
		pemp.payEMI();
		pemp.setInsureAmount(5000);
		pemp.registerInsurance();
		
		
		if(pemp.totalEMI==pemp.InsureAmount)
		{
			int insur=pemp.claimInsurance();
			System.out.println(" Insureamount:"+insur);
	   }
		else {
			int total=pemp.claimInsurance();
			
			System.out.println("TotalEMI:"+total);
		}
		pemp.payEmi();
		
		
		//pemp.disp();
		System.out.println("....................");
		Contractemployee cemp=new Contractemployee("Mary", "Accountant", 24, 500, 600, 10000);
		System.out.println("Contract Employee");
		System.out.println("....................");
		cemp.setduration(6);
		cemp.Setphone(9823672);
		cemp.SetEmpcode(1002);
		cemp.setgender("Female");
		cemp.empdisplay();
		//cemp.disp();
		//cemp.regularOffer(100);
		//cemp.seasonOffer(300);
		cemp.payEMI();
		cemp.setInsureAmount(3000);
		cemp.registerInsurance();
		cemp.SetTotalEmi(3000);
		
		
		if(cemp.totalEMI==cemp.InsureAmount)
		{
			int insur=cemp.claimInsurance();
			System.out.println(" Insureamount:"+insur);
	    }
		else 
		{
			
			int total=cemp.claimInsurance();
			
			System.out.println("TotalEMI:"+total);
		}
		
		cemp.payEmi();
		

	}
	
	
	
	private int GetInsureAmount() 
	{
		
		return  InsureAmount;
	}

	void payEMI()
	{
		System.out.println("EMI:"+totalEMI);	
    }
int claimInsurance() {
	if(totalEMI==InsureAmount)
	{
	return InsureAmount;
  }
	else {
		return totalEMI;
	}


}



@Override
void registerInsurance() {
	// TODO Auto-generated method stub
	
}
	
		
	
		
	}