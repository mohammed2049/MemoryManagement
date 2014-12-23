public class Deallocate {
	private static Memory e = new Memory();

	public static boolean deAllo(int address){
		for(int i = 0 ; i < Main.partitions.size() ; ++i){
			e = Main.partitions.get(i);
			if(e.getAddress() == address && e.isZ()){
				Main.partitions.get(i).setZ(false);
				int oriSz = Main.partitions.get(i).getOriginalSize();
				Main.partitions.get(i).setSz(oriSz);
				return true;
			}
		}
		return false;
	}
}
