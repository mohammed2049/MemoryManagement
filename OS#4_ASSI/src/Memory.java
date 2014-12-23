public class Memory {
	private int Sz;
	private boolean z;
	private int address;
	Memory() {
		setSz(0);
		setZ(false);
	}

	Memory(int s, boolean a , int address) {
		Sz = s;
		z = a;
		this.address = address;
	}

	public int getSz() {
		return Sz;
	}

	public void setSz(int sz) {
		Sz = sz;
	}

	public boolean isZ() {
		return z;
	}

	public void setZ(boolean z) {
		this.z = z;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}
}
