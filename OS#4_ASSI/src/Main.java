import java.util.*;

public class Main {
	public static Scanner input = new Scanner(System.in);
	public static ArrayList<Memory> partitions = new ArrayList<Memory>();

	public static void allocate(int n) {
		while (true) {
			System.out
					.println("Size to allocate or 0 to print and -1 to finish process");
			int sz = input.nextInt(), res = 0;
			if (sz == -1)
				break;
			if (sz == 0) {
				print();
				continue;
			}
			if (n == 1)
				res = Allocate.firstFit(sz);
			else if (n == 2)
				res = Allocate.bestFit(sz);
			else if (n == 3)
				res = Allocate.worstFit(sz);
			else
				continue;
			System.out.println(res);
		}
	}

	public static void deallocate() {
		while (true) {
			System.out
					.println("address to deallocate or 0 to print and -1 to finish process");
			int address = input.nextInt();
			if (address == -1)
				break;
			if (address == 0) {
				print();
				continue;
			}
			if (Deallocate.deAllo(address))
				System.out.println("Wrong address");
			else
				System.out.println("Successfully deallocated");
		}
	}

	public static void main(String[] args) {
		int n, sz, address = 1, c;
		System.out.print("Number of partitions : \n");
		n = input.nextInt();
		System.out.println("Size of each partition : ");
		for (int i = 0; i < n; ++i) {
			sz = input.nextInt();
			Memory e = new Memory(sz, false, address, sz);
			partitions.add(e);
			address += sz;
		}
		while (true) {
			System.out.println("Choose operation");
			System.out.println("1. Allocation");
			System.out.println("2. De-allocation");
			System.out.println("3. Defregmentation");
			System.out.println("4. print");
			System.out.println("5. Exit");
			c = input.nextInt();
			if (c == 5)
				break;
			if (c == 1) {
				System.out.println("1. First Fit");
				System.out.println("2. Best Fit");
				System.out.println("3. Worst Fit");
				n = input.nextInt();
				allocate(n);
			} else if (c == 2) {
				deallocate();
			} else if (c == 3) {
				Defragmentation.def();
			} else if (c == 4)
				print();
		}

		input.close();
	}

	public static void print() {
		System.out.println("i     oriSize      free      address");
		for (int i = 0; i < partitions.size(); ++i) {
			Memory e = new Memory();
			e = partitions.get(i);
			System.out.println(i + "     " + e.getOriginalSize() + "     "
					+ e.getSz() + "     " + e.getAddress());
		}
	}

}
