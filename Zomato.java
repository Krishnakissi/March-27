class Zomato{
	public static double searchItem (String itemName){
		System.out.println("searchItem method started");
		if("Chicken Biryani"==itemName){
			System.out.println("Thanks for selecting"+itemName);
			return 250.00;
		}
		if("Shawarma"==itemName){
			System.out.println("Thanks for selecting"+itemName);
			return 70.00;
		}
		if("Golden Chicken"==itemName){
			System.out.println("Thanks for selecting"+itemName);
			return 350.00;
		}
		if("Mutton Biryani"==itemName){
			System.out.println("Thanks for selecting"+itemName);
			return 420.00;
		}
		if("Veg Fried Rice"==itemName){
			System.out.println("Thanks for selecting"+itemName);
			return 120.00;
		}
		if("Schezwan Fried Rice"==itemName){
			System.out.println("Thanks for selecting"+itemName);
			return 150.00;
		}
		if("Gobi Manchurian"==itemName){
			System.out.println("Thanks for selecting"+itemName);
			return 180.00;
		}
		if("Panner tika"==itemName){
			System.out.println("Thanks for selecting"+itemName);
			return 220.00;
		}
		if("Masala Dosa"==itemName){
			System.out.println("Thanks for selecting"+itemName);
			return 70.00;
		}
		if("Singapore Rice"==itemName){
			System.out.println("Thanks for selecting"+itemName);
			return 90.00;
		}
		System.out.println("searchItem method Ended");
		return 0.00;
	}
}