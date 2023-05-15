class Pubs1{


public static void main(String args []){

	String pubsNames[]={"Toca","DrunkenDaddy","TipsyBull","Drink&DIne","Gilly's","Stories","Hangover",
		"FlyOverDrinkery","Sherlocks","Bob'sBar","OzonePub","Boho","4sBar","Blurred","hammered"};
		
		System.out.println("Main started");
		getpubsNames(pubsNames);
		
		System.out.println("Main ended");

		
	}
	
	
	
	public static void getpubsNames(String pubsNames[]){
	System.out.println("Names of Pubs in Banglore:"+pubsNames.length);
	
	for(int i=0; i<pubsNames.length; i++){
		System.out.println(pubsNames[i]);	
	}
}
}