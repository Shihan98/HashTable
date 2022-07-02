
public class LinkedList {
	Node head;
	Node tail;
	
	LinkedList (){
		this.head = this.tail = null;
	}
	
	public void insert(int data) {
		Node newNode = new Node(data);
		
		if(this.head == null) {
			this.head = this.tail = newNode;
		}else {
			this.tail.next = newNode;
			this.tail = newNode;
		}
	}
	
	public void remove(int data) {
		Node temp = this.head;
		Node prev = null;
		
		while(temp != null) {
			if(temp.number == data) {
				if(temp == head) {
					head = temp.next;
					temp.next = null;
					System.out.println("Number : "+data+" successfully removed");
					return;
				}else if(temp == tail) {
					tail = prev;
					tail.next = null;
					System.out.println("Number : "+data+" successfully removed");
					return;
				}else {
					prev.next = temp.next;
					temp.next = null;
					System.out.println("Number : "+data+" successfully removed");
					return;
				}
			}
			prev = temp;
			temp = temp.next; 
		}
	}
	
	public void print() {
		Node temp = this.head;
		while(temp!=null) {
			temp.printDetails();
			temp = temp.next;
		}
	}
}
