class MncCompanies1 {

public static void main(String argss[]){

	String companyNames[]={"Microsoft","Apple","L&T","TCS","IBM","Deloitte","CocoCola","Accenture","Dell","Infosys","Google",
	"Oracle","Infotech","HSBC","Honeywell"};
	
	System.out.println("Main Started");
	getCompanyNames(companyNames);
	System.out.println("Main Ended");
}
	
	public static void getCompanyNames(String companyNames[]){
	System.out.println("List of Top MNC Companies are:"+companyNames.length);
	for(int i=0; i<companyNames.length; i++){
		System.out.println(companyNames[i]);
	}
}
}