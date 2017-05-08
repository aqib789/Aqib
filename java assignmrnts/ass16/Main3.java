package myfirstpackage;

public class Main3 {
public static void main(String[] args) {
		
		PermenentEmployee1 pemp=new PermenentEmployee1("John", "HR", 35, 200, 300, 15000);
		pemp.empdisplay();
		pemp.setpcode("PM100");
		pemp.Setphone(98967623);
		pemp.SetEmpcode(1001);
		pemp.setgender("Male");
		pemp.disp();
		int totalpurchaseamount=pemp.seasonoffer(4500);
		int amount=pemp.regularoffer(7000);
		
		if(totalpurchaseamount>=2500&&amount>=2500)
		{
			int x=totalpurchaseamount*25/100;
			int total=totalpurchaseamount-x;
			System.out.println("totalPurchaseAmount:"+total);
			 int y=amount*10/100;
			int totalamount=amount-y;
			System.out.println("Amount :"+totalamount);
		}
		System.out.println("\n");
		
		ContractEmployee1 pemp1=new ContractEmployee1("Yasir", "Manager", 35, 200, 100, 150000);
		pemp1.empdisplay();
		pemp1.setContractduration(5);
		pemp1.Setphone(98966482);
		pemp1.SetEmpcode(1004);
		pemp1.setgender("Male");
		pemp1.display();
		totalpurchaseamount =pemp1.seasonoffer(9000);
		pemp1.regularoffer(4500);
		if(totalpurchaseamount>=2500&&amount>=2500)
		{
			int x=totalpurchaseamount*15/100;
			int total=totalpurchaseamount-x;
			System.out.println("totalPurchaseAmount:"+total);
			 int y=amount*8/100;
			int totalamount=amount-y;
			System.out.println("Amount :"+totalamount);
		}
		
		
		
		
		
		
		

	}

}



