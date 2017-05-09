package ass18;

public class Employee extends Insurance{

	String name;
	String designation;
	int age,PF,Gratuity,salary;
	public Employee(String name,String designation,int age,int PF,int Gratuity,int salary)
	{
		this.name=name;
		this.designation=designation;
		this.age=age;
		this.PF=PF;
		this.Gratuity=Gratuity;
		this.salary=salary;
		
	}
	
		public int calculatesalary()
		{
			return(salary-(PF+Gratuity));
		}
		
 void empdisplay()
 {
	 System.out.println("Name:"+name);
		////System.out.println("Designation:"+designation);
		System.out.println("Age:"+age);
		//System.out.println("Salary:"+salary);
		
		System.out.println("TotalSalary:"+calculatesalary());
		
 }


void registerInsurance() {
	

	InsuranceNo="INS_"+getecode()+"670";
	
System.out.println("InsuranceNo:"+InsuranceNo);
	System.out.println("insureAmount:"+GetInsureAmount());
	
}


void payEMI() {
	System.out.println("EMI:"+getemi());
	
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
public void setInsureAmount(int InsureAmount)
{
	this.InsureAmount=InsureAmount;
}
public int GetInsureAmount()
{
	return InsureAmount;
}
String EmpCode;
public void setecode(String EmpCode)
{
	this.EmpCode=EmpCode;
}
private String getecode() {
	
	// TODO Auto-generated method stub
	return  EmpCode;
}
public void setemi(int totalEMI)
{
	this.totalEMI=totalEMI;
	
}
public int getemi()
{
	return totalEMI;
}
	
public static void main(String[] args) {

	Employee emp=new Employee("John", "HR", 35, 200, 300, 15000);
	emp.empdisplay();
	emp.setecode("E200");
	emp.setemi(50000);
	emp.payEMI();
	emp.setInsureAmount(3000);
	emp.registerInsurance();
	if(emp.totalEMI==emp.InsureAmount)
	{
		int insur=emp.claimInsurance();
		System.out.println(" insureamount:"+insur);
   }
	else {
		int total=emp.claimInsurance();
		
		System.out.println("totalEMI:"+total);
	}
}
		
	
	
	

}