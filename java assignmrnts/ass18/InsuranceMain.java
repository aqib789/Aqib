package ass18;

public class InsuranceMain extends Insurance {

	
	
	void registerInsurance()
	{ 
		
		System.out.println("InsuranceNo:"+InsuranceNo);
		System.out.println("InsureAmount:"+InsureAmount);
     }
	void payEMI() 
	{  
	
		System.out.println("EMI:"+totalEMI);	
	}
	     
	int claimInsurance() 
	{
		if(totalEMI==InsureAmount)
		{
		return InsureAmount;
	   }
		else 
		{
			return totalEMI;
		}	
		
	}
	public static void main(String[] args) {
		InsuranceMain in=new InsuranceMain();
			
			in.registerInsurance();
			in.payEMI();
			if(in.totalEMI==in.InsureAmount)
			{
				int insur=in.claimInsurance();
				System.out.println(" Insureamount:"+insur);
		   }
			else {
				int total=in.claimInsurance();
				
				System.out.println("TotalEMI:"+total);
			}

	

}
	}