class Zomato1Runner{
	public static void main(String zomato1[]){
	System.out.println("Main method Started");
	
	
	String foodName="Chicken Biryani";
	double price= Zomato1.searchMenu(foodName);
	System.out.println("The price of  "+foodName+" is "+price);
	
	System.out.println("Main method Ended");

	}

}