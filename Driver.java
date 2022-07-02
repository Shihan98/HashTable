
public class Driver {

	public static void main(String args[]) {
		
		HashTable ht1 = new HashTable();
		
		ht1.insert(5);
		ht1.insert(10);
		ht1.insert(20);
		ht1.insert(1);
		ht1.insert(0);
		ht1.insert(100);
		ht1.insert(13);
		ht1.insert(21);
		ht1.insert(140);
		ht1.insert(135);
		ht1.insert(24);
		
		ht1.printTable();
		
		System.out.println();
		
		ht1.retrieve(100);
		
		ht1.printTable();
		System.out.println();
		ht1.search(100);
	}
}
