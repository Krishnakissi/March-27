class SuperMarket{
	
  public static void main(String args[]){

	String groceries[]={"MoongDal","Groundnut","ChannaDal","Matki","MasoorDal","Atta","Sojji","RajmaChawal",
	"Udid","Chowli","ChannaGreen","Wal","Soyabean","kabuliChana","TurDal"};
	
	String chocolate[]={"KitKat","Snickers","milkyWay","FerreroRocher","5 Star","Galaxy","Fuse","Melody",
	"MarsBar","Lotus","Hershey's","Pacari","Eclaris","Coffybite","toblerone"};
	
	String shampoo[]={"AllClear","Pantene","Garnier","TRESemme","Dove","Sunsilk","Himalaya","L'oreal",
	"Head&Shoulder's","ClinicPlus+","Patanjali","ParkAvenue","Fiama","ManMatters","Mamaearth"};
	
	String perfume[]={"SetWet","Foog","WildStone","Brut","Axe","Nivea","Roadster","Denver","ParkAvenue",
	"CalvinKlein","Boss","Ajmal","Nautica","Davidoff","Villan"};
	
	
	String soap[]={"Pears","Santoor","MysoreSandal","Dettol","Lux","Liril","Medimix","Cinthol","Hamam","Lifebuoy","Biotique",
	"Fiama","KhadiNatural","Johnson and Johnson","Dove"};
	
	
	String tshirtBrand[]={"Lee","DNMX","US Polo","Perfomax","Puma","NetPlay","Nike","Arrow","AllenSolly","Vnan Heusen",
	"Levi;s","Mufti","Jack&Jones","Aidas","Tommy Hilfiger"};
	
	System.out.println("**************************************************");
	System.out.println("Groceries list:"+groceries.length);
	for(int i=0; i<groceries.length; i++){
		System.out.println(groceries[i]);
	}

	System.out.println("**************************************************");
	System.out.println("Chocolate list:"+chocolate.length);
	for(int i=0; i<chocolate.length; i++){
		System.out.println(chocolate[i]);
	}

	System.out.println("**************************************************");
		System.out.println("Shampoo list:"+shampoo.length);
		for(int i=0; i<shampoo.length; i++){
			System.out.println(shampoo[i]);
		}

	System.out.println("**************************************************");
		System.out.println("Perfume list:"+perfume.length);
		for(int i=0; i<perfume.length; i++){
			System.out.println(perfume[i]);
		}

	System.out.println("**************************************************");
		System.out.println("Soap list:"+soap.length);
		for(int i=0; i<soap.length; i++){
			System.out.println(soap[i]);
		}

	System.out.println("**************************************************");
		System.out.println("TshirtBrand list:"+tshirtBrand.length);
		for(int i=0; i<tshirtBrand.length; i++){
			System.out.println(tshirtBrand[i]);
		}




}
}