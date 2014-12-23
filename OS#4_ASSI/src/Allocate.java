import java.util.ArrayList;

public class Allocate {
	
	boolean  worstFit(int sz){
		
		int idx = -1 , mx = 0; 
		for(int i = 0 ; i < Main.partitions.size() ; i++){
			Memory e = new Memory();
			e = Main.partitions.get(i);
			
			if(e.getSz() >= mx && e.getSz() >= sz){
				mx = e.getSz(); 
				idx = i;
			}
			
		}
		
		if(idx == -1){
			//System.out.println("Error");
			return false;
		}else{
			System.out.println("Allocated Succssfuly");
			Memory e = new Memory();
			e = Main.partitions.get(idx);
			e.setSz(e.getSz() - sz);
			Main.partitions.add(idx, e); 
			return true;
		}
		
	}
	
}
