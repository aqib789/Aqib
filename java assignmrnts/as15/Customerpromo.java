package myfirstpackage;

public class Customerpromo  implements  PromotionalOffer
{
	
	String name,address;
	int age,phone;
	
	Customerpromo(String name,String address, int age,int phone )
	{
		this.name=name;
		this.address=address;
		this.age=age;
		this.phone=phone;
				
	}

	public static void main(String[] args) {
		Customerpromo cust=new Customerpromo("Amal", "Malappuram", 28, 987654);
		System.out.println("Customer Details");
		System.out.println("------------------------");
		System.out.println("name:"+cust.name);
		System.out.println("Address:"+cust.address);
		System.out.println("age:"+cust.age);
		System.out.println("Phone-number:"+cust.phone);
		cust.regularOffer(3500);
		cust.seasonOffer(1800);

	}
	public void seasonOffer(int totalPurchaseAmount) {
		
		totalPurchaseAmount=totalPurchaseAmount*10/100;
		System.out.println("10% of purchase:"+totalPurchaseAmount);
	}

	
	public void regularOffer(int amount) {
		amount=amount*0/100;
		System.out.println("0% of purchase:"+amount);
		
	}

	@Override
	public void seasonoffer(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void regularoffer(int amount) {
		// TODO Auto-generated method stub
		
	}

}