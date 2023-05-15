class Temples1{
	public static void main (String []args){
	
	String godsNames[]={"Ganesha","Venkateshwara","SaiBaba","Rama","Hanuman","Shiva","Raghavendhra","Lakshmi","Vishnu",
	"Durga","Saraswathi","Parvathi","Ayyappan","Murugan","Krishna"};
	
	System.out.println("Main started");	
	getGodsNames(godsNames);
	System.out.println("Main ended");	

	}
	
	
	public static void getGodsNames(String godsNames[] ){
	System.out.println("GodsName entered here is:"+godsNames.length);
	for(int i=0; i<godsNames.length; i++){
		System.out.println(godsNames[i]);
		}
	}
}