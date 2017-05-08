package myfirstpackage;

public class Employee {
	
	private int int_month;
	private int int_salary;
	
	Employee(int int_month,int int_salary)
	{
		this.int_month=int_month;
		this.int_salary=int_salary;
		
		
	}
	private int int_calculatesalary()
	{
		return int_month*int_salary;
	}
	
	public static void main(String [] args)
	{
		Employee myobject=new Employee(12,30000);
		int int_area=myobject.int_calculatesalary();
		System.out.println(int_area);
		
	}

}
