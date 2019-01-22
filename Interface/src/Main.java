public class Main {
	
	public static void main(String[] args) {

	DeskPhone mikePhone=new DeskPhone(20220202, true);

		//ITelephone mikePhone = new DeskPhone(20220220,true);
		mikePhone.powerOn();
		mikePhone.callPhone(20220202);
		mikePhone.answer();
		
		DeskPhone EddiePhone=new DeskPhone(200300400,true);
		EddiePhone.powerOn();
		EddiePhone.callPhone(200300400);
		EddiePhone.answer();

	}

}
