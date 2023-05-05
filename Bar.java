class Bar{

      static String[] Alcohol = {"Royal Stag","Black&White","Teacher's","Amruth","Manshion House","100 Piper's",
      "Budwiser","Calsberg","Tubourg","Black Label","Signature","Black Dog","KF Ultra","KF Ultra Max","Old Monk Legend"};


public static void main (String args[]){
	
	
	System.out.println("List of Brands without for loop");
	System.out.println("1:"+Alcohol[0]+"\n"+"2:"+Alcohol[1]+"\n"+"3:"+Alcohol[2]);
	System.out.println("**************************************");
	

	
		    System.out.println("List of Brands using for loop");
			System.out.println("Size of Array List is:"+Alcohol.length);

	for(int i=0;i<Alcohol.length;i++){
     System.out.println(Alcohol[i]);



}

}
}