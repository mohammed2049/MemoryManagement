public class Memory {
	private int Sz;
	private boolean z;
	private int address;
	private int originalSize;

	Memory() {
		setSz(0);
		setZ(false);
		setAddress(0);
		setOriginalSize(0);
	}

	Memory(int s, boolean a, int address, int originalSize) {
		Sz = s;
		z = a;
		this.address = address;
		this.originalSize = originalSize;
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

	public int getOriginalSize() {
		return originalSize;
	}

	public void setOriginalSize(int originalSize) {
		this.originalSize = originalSize;
	}
}
