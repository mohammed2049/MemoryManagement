
public class Defragmentation {
	private int accumlativeSize;
	
	public Defragmentation() {
		accumlativeSize = 0;
	}
	
	void def(){
		
		for(int i = 0 ; i < Main.partitions.size() ; i++){
			Memory e = new Memory();
			e = Main.partitions.get(i);
			accumlativeSize += e.getSz();
		}
		
		Memory e = new Memory();
		int idx = Main.partitions.size() - 1;
		e.setAddress(Main.partitions.get(idx).getAddress() + Main.partitions.get(idx).getSz());
		e.setSz(accumlativeSize);
		
		if(accumlativeSize != 0){
		Main.partitions.add(e);
		}
	}

}
