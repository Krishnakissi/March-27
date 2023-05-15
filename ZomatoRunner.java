class ZomatoRunner{
	public static void main(String zomato[]){
	System.out.println("Main method Started");
	
	//invoking a method
	String itemName="Chicken Biryani";
	double price= Zomato.searchItem(itemName);
	System.out.println("The price of  "+itemName+" is "+price);
	
	System.out.println("Main method Ended");

	}
}
