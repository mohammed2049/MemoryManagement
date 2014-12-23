import java.util.*;

public class Main {
	public static ArrayList<Memory> partitions = new ArrayList<Memory>();

	public static void main(String[] args) {
		int n, sz , address = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Number of partitions : \n");
		n = input.nextInt();
		System.out.println("Size of each partition : ");
		for (int i = 0; i < n; ++i) {
			sz = input.nextInt();
			Memory e = new Memory(sz, false , address);
			partitions.add(e);
			address += sz;
		}
		
		
		for(int i = 0 ; i < partitions.size() ; ++i){
			Memory e = new Memory();
			e = partitions.get(i);
			System.out.println(i + " " + e.getSz() + " " + e.getAddress());
		}
		
		input.close();
	}

}
