class Garage1{
 
 public static void main (String args[]){
   
  String workers[]={"Krishna","Pavan","Karthik","Bharath","Vinay","Sandeep","Jayanth","Akarsh","Rakshith","Vikas","Hemanth"
  ,"Pradeep","Arun","Santhosh","Satish"};
 
  System.out.println("Main Started");
  getworkers(workers);
  
  System.out.println("Main Started");
 }
 
 
	
 public static void getWorkers( String workers[]){
 System.out.println("No of Workers are:"+workers.length);
 
 for(int i=0; i<workers.length; i++){
	System.out.println(workers[i]);
 }
 }
}