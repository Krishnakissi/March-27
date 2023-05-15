class DthConnectionTester{
	public static void main(String []d){
		DthConnection dth1=new DthConnection(1,"TataSky",500,"6months");
		System.out.println(dth1.dthId+" "+dth1.name+" "+dth1.noOfChannels+" "+dth1.plan);
	}
}
