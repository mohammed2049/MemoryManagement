public class Defragmentation {
	private static int accumlativeSize;

	Defragmentation() {
		accumlativeSize = 0;
	}

	public static void def() {
		int address = 0;
		for (int i = 0; i < Main.partitions.size(); i++) {
			Memory e = new Memory();
			e = Main.partitions.get(i);
			accumlativeSize += e.getSz();
		}
		int idx = Main.partitions.size() - 1;
		address = Main.partitions.get(idx).getAddress()
				+ Main.partitions.get(idx).getSz();
		Memory e = new Memory(accumlativeSize, false, address, accumlativeSize);

		if (accumlativeSize != 0)
			Main.partitions.add(e);

	}
}
