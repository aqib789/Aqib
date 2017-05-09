package myfirstpackage;

public class InsuranceMain extends Insurance
{
	public static void main(String [] args)
	{
		InsuranceMain in=new InsuranceMain();
		in.registerinsurance();
		in.payEMI();
		if(in.totalEMI==in.insuranceamount)
		{
			System.out.println("Insurance amount:"+in.claiminsurance());
		}
		else
		{
			System.out.println("Total EMI:"+in.totalEMI);
		}
		
		
	}

	
	void registerinsurance()
		{
		System.out.println("Insurance no:"+insuranceno);
		System.out.println("Insurance amount:"+insuranceamount);
		
		}

	
	void payEMI()
		{
		System.out.println("Total EMI:"+totalEMI);
		
		}
	int claiminsurance()
		{
			if(insuranceamount==totalEMI)
			{
				return insuranceamount;
				
				
			}
			else
			{
				return totalEMI;
			}
		}
	}
	


