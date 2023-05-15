class ChatsShop1{
	
public static void main(String args[]){

	String chatsMenu[]={"PaniPuri","MasalaPuri","BhelPuri","SevPuri","DhaiPuri","Churmuri",
	"NippatMasala","NippatBhel","BangarpetMasala","ChowChowMasala","MangloreMasala","SamosaMasala",
	"PeanutMasala","Tamatomasala","AluPuri"};
	
	System.out.println("Main started");
	getChatsMenu(chatsMenu);
	System.out.println("Main ended");
	}

	public static void getChatsMenu(String chatsMenu[]){
	System.out.println("Chats in Menu are:"+chatsMenu.length);
	for(int i=0; i<chatsMenu.length; i++){
	System.out.println(chatsMenu[i]);
	
}
}
}