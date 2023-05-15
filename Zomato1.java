class Zomato1{
 public static void searchMenu(String foodName){
 System.out.println("Zomato1 method started");
     if("Chicken Biryani"==foodName){
	 System.out.println("thanks for selecting"+foodName);
	 return 120.00;
	 
	 if("Veg Biryani"==foodName){
	 System.out.println("thanks for selecting"+foodName);
	 return 90.00;
 }
 
 
 System.out.println("Zomato1 method ended ");

  public static void searchMenu(String foodName,int quantity){
 System.out.println("Zomato1 method started");
     if("Chicken Biryani"==foodName){
	 System.out.println("thanks for selecting"+foodName);
	 return 120.00*quantity;
	 
	 if("Veg Biryani"==foodName){
	 System.out.println("thanks for selecting"+foodName);
	 return 90.00*quantity;
 }
 
 
 System.out.println("Zomato1 method ended ");

 
 
 
}
}