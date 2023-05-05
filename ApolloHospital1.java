class ApolloHospital1{


	 
public static void main(String args[]){
	
	String doctorsName[]={"Dr Anand Subramanyam","Dr Anil Kamath","Dr Anoop P","Dr Bhaskar Pai",
	"Dr CB Prabhu","Dr Darshan Kumar A jain","Dr Deepak Rohidekar","Dr Dinesh Kamat","Dr Sujith","Dr Divya KS","Dr Gopal ST",
	"Dr Jagadeesh Kumar","Dr Jaidev Jadav","Dr Jaya Ranganath","Dr KVS Prasad"};

	System.out.println("Main Started");
	getDoctorsName(doctorsName);
	
	System.out.println("Main Ended");
}


	public static void getDoctorsName(String doctorsName[]){
		System.out.println("List of Names");
	

	System.out.println("No of DoctorsNames are:"+doctorsName.length);
	for(int i=0; i<doctorsName.length; i++){
		System.out.println(doctorsName[i]);
	}
}
}
