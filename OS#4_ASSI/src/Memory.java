public class Memory {
	private int Sz;
	private boolean z;

	Memory() {
		setSz(0);
		setZ(false);
	}

	Memory(int s, boolean a) {
		Sz = s;
		z = a;
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
}
