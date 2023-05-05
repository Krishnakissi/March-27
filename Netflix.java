class Netflix{


public static void main (String args[]){
	
	String englishSeries[]={"Wednesday","MoneyHeist","Friends","BigBangTheory","SquidGame","Mismatched",
	"NeverHaveHighEver","VampireDiares","EmilyInParis","ManVsBee","Dark","Dracula","Narcos","DearWhitePeople","TheStranger"};
	
	String hindhiMovies[]={"Jawan","Shehzada","Selfie","Pathan","Michael","Bawaal","MissionManju","Bholaa",
	"Gaslight","Badboy","MrsUndercover","PinkyBeautyPalour","BicycleDays","Rosh","Aazam"};

	String teluguMovies[]={"Arya","Arya 2","Julayi","Pushpa","varudu","Bunny","Sarrainodu","Happy","S/O Sathyamurthy"
	,"Gangotri","Parugu","RaceGuram","Vedam","Yevadu","Rudhramadevi"};


	System.out.println("******************************************************************************");	
	System.out.println("List of englishSeries:"+englishSeries.length);

    for(int i=0;i<englishSeries.length;i++){
	System.out.println(englishSeries[i]);
}


	System.out.println("******************************************************************************");	
	System.out.println("List of hindhiMovies:"+hindhiMovies.length);
	
	for(int i=0; i<hindhiMovies.length; i++){
		System.out.println(hindhiMovies[i]);
	}


	System.out.println("******************************************************************************");	
	System.out.println("List of teluguMovies:"+teluguMovies.length);
	for(int i=0; i<teluguMovies.length; i++){
		System.out.println(teluguMovies[i]);
	}

}
}