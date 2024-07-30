package sub8;

public class RemoteLG implements RemoteCotrol {

	@Override
	public void powerOn() {
		System.out.println("LG powerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("LG powerOff...");
	}

	@Override
	public void chUp() {
		System.out.println("LG chUP...");
	}

	@Override
	public void chDown() {
		System.out.println("LG chDown...");
	}

	@Override
	public void soundUp() {
		System.out.println("LG soundUP...");
	}

	@Override
	public void soundDown() {
		System.out.println("LG powerDown...");
	}

}
