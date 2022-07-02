
public class HashTable {

	LinkedList indexes[] = new LinkedList[5];
	
	public int hashCode(int data) {
		return data%5;
	}
	
	public void insert(int data) {
		int index = hashCode(data);
		
		if(indexes[index] == null) {
			LinkedList newList = new LinkedList();
			newList.insert(data);
			indexes[index] = newList;
		}else {
			LinkedList temp = indexes[index];
			temp.insert(data);
		}
	}
	
	public void retrieve(int data) {
		int index = hashCode(data);
		if(indexes[index] == null) {
			System.out.println("Item Not Found");
		}else {
			indexes[index].remove(data);
		}
	}
	
	
	public void search(int target) {
		
		int index = hashCode(target);
		
		if(indexes[index] == null) {
			System.out.println("Item Not Exist");
		}else {
			LinkedList temp = indexes[index];
			Node current = temp.head;
			
			while(current != null) {
				if(current.number == target) {
					System.out.println("Item Found");
					return;
				}
				
				current = current.next;
			}
			
			System.out.println("Item Not Exist");
		}
		
	}
	
	public void printTable() {
		for(LinkedList l : indexes) {
			if(l != null) {
				l.print();
			}
		}
	}
}
