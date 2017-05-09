package ass18;

public abstract class Insurance {
    String  InsuranceNo="INS100"; 
    int InsureAmount=5000,totalEMI=10000;
	abstract void registerInsurance();
	abstract void  payEMI();
	
	
}
