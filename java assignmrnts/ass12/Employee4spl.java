package myfirstpackage;

public class Employee4spl {
	
		String name;
		String designation;
		int age,PF,gratuity,salary;
		
		public Employee4spl(String name,String designation,int age,int PF,int gratuity,int salary)
		{
			this.name=name;
			this.designation=designation;
			this.age=age;
			this.PF=PF;
			this.gratuity=gratuity;
			this.salary=salary;
			
			
		}
		public int calculatesalary()
		{
			return(salary-(PF+gratuity));
		}
		void empdisplay()
		{
			System.out.println("name:"+name);
			//System.out.println("Designation:"+designation);
			System.out.println("age:"+age);
			System.out.println("salary:"+calculatesalary());
			
		}

	}



