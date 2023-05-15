class CreditCard1{
	public static void main (String []args){
	
	String creditCardNames[]={"AxisBank","SBI","HDFC","ICICI","YesBank","IndusBank","RBI","BankOfBaroda","VijayaBank",
	"BankofIndia","AndhraBank","HSBC","CanaraBank","IDFC","PunjabNationalBank"};
	
	System.out.println("Main Started");
	getCreditCardNames(creditCardNames);
	System.out.println("Main Ended");
	}
	
	public static void getCreditCardNames(String creditCardNames[]){
	System.out.println("CreditCardNames entered here is:"+creditCardNames.length);
	for(int i=0; i<creditCardNames.length; i++){
		System.out.println(creditCardNames[i]);
		}
	}
}