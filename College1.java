class College1{

	public static void main(String args[]){

	String departments[]={"CivilEngineering","MechanicalEngineering","ElectricalEngineering","ComputerScienceEngineering",
	"AreaspaceEngineering","TextileEngineering","AutomobileEngineering","EnvironmentalEngineering","BiomedicalEngineering",
	"PetroleumEngineering","SoftwareEngineering","MaterialScience","AppliedMechanics","ElectronicEngineering","EngineeringDrawing"};

	System.out.println("Main Started");
	getDepartments(departments);
	System.out.println("Main ended");
	}


	public static void getDepartments(String departments[]){
	System.out.println("No of Departments are:"+departments.length);
	for(int i=0; i<departments.length; i++){
		System.out.println(departments[i]);
	}
}
}