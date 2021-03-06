
public class DeskPhone implements ITelephone {

	private int myNumber;
	private boolean isRinging;

	public DeskPhone(int myNumber, boolean isRinging) {

		this.myNumber = myNumber;
		this.isRinging = isRinging;
	}

	public int getMyNumber() {
		return myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("No action taken, desk phone does not have a power button");
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on deskphone");

	}

	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answering the desk phone");
			isRinging = false;
		}
	}

	@Override
	public boolean callPhone(int PhoneNumber) {
		if (PhoneNumber == myNumber) {
			isRinging = true;
			System.out.println("Ring Ring ");

		} else {
			isRinging = false;

		}
		return false;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}

}
