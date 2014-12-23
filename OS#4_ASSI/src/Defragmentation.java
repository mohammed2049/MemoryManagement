public class Defragmentation {

	public static void def() {
		int address = 0, accumlativeSize = 0;
		for (int i = 0; i < Main.partitions.size(); i++) {
			Memory e = new Memory();
			e = Main.partitions.get(i);
			if (e.isZ()) {
				accumlativeSize += e.getSz();
				Main.partitions.get(i).setOriginalSize(
						e.getOriginalSize() - e.getSz());
				Main.partitions.get(i).setSz(0);
			}
		}
		int idx = Main.partitions.size() - 1;
		address = Main.partitions.get(idx).getAddress()
				+ Main.partitions.get(idx).getOriginalSize();
		Memory e = new Memory(accumlativeSize, false, address, accumlativeSize);

		if (accumlativeSize != 0)
			Main.partitions.add(e);

	}
}
