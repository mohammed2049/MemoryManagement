public class Allocate {

	public static int firstFit(int sz) {
		for (int i = 0; i < Main.partitions.size(); ++i) {
			if (Main.partitions.get(i).getSz() >= sz) {
				int newSz = Main.partitions.get(i).getSz() - sz;
				Main.partitions.get(i).setSz(newSz);
				Main.partitions.get(i).setZ(true);
				return Main.partitions.get(i).getAddress();
			}
		}
		return -1;
	}

	public static int bestFit(int sz) {
		int idx = -1, min = (1 << 29), newSz = 0;
		for (int i = 0; i < Main.partitions.size(); ++i) {
			Memory e = new Memory();
			e = Main.partitions.get(i);
			if (e.getSz() >= sz && e.getSz() - sz < min) {
				min = e.getSz() - sz;
				idx = i;
				newSz = e.getSz() - sz;
			}
		}
		if (idx != -1) {
			Main.partitions.get(idx).setSz(newSz);
			Main.partitions.get(idx).setZ(true);
			idx = Main.partitions.get(idx).getAddress();
		}
		return idx;
	}

	public static int worstFit(int sz) {

		int idx = -1, mx = -1, newSz = 0;
		for (int i = 0; i < Main.partitions.size(); i++) {
			Memory e = new Memory();
			e = Main.partitions.get(i);
			if (e.getSz() >= mx && e.getSz() >= sz) {
				mx = e.getSz();
				idx = i;
				newSz = e.getSz() - sz;
			}

		}

		if (idx != -1) {
			Main.partitions.get(idx).setSz(newSz);
			Main.partitions.get(idx).setZ(true);
			return Main.partitions.get(idx).getAddress();
		}
		return idx;
	}
}
