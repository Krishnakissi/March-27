class MncCompanies {

public static void main(String argss[]){

	String companyNames[]={"Microsoft","Apple","L&T","TCS","IBM","Deloitte","CocoCola","Accenture","Dell","Infosys","Google",
	"Oracle","Infotech","HSBC","Honeywell"};

	System.out.println("List of Top MNC Companies are:"+companyNames.length);
	for(int i=0; i<companyNames.length; i++){
		System.out.println(companyNames[i]);
	}
}
}