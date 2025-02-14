
public class SinglyLinkedList {
	//a Singly Linked List has 0 or more nodes
	public Node head; //the start of the list or null
	private int size; //how many Node objects?
	
	public SinglyLinkedList() {
		head = null;
		size = 0;
	}
	
	//getters/setters/helper methods
	public int getSize() {
		return size;
	}
	
	//adding Nodes!
	public void addNode(Node newNode) {
		
		//what must be updated in order to add a new Node?
		size++;
		
		//does the 	Head node need to be updated?
		if(head == null) {
			head = newNode;
			
		}
		else {
//			//visit every node in the list
//			//if you find one that has a null next reference
//			//you found where to add the new node!!!
//			Node temp = head;
//			while(temp.next != null) {
//				//move to the next Node
//				temp = temp.next;
//				
//			}
//			//ready to add!
//			//temp is now the last node (end of the list)
//			temp.next = newNode; //"add" the new node :)
			
			//call the helper method
			add(head, newNode);
		}
		
	}
	/*
	 * Return the Node at the index
	 * null if index is invalid
	 */
	
	/*
	 * Recursive private add method
	 */
	private void add(Node curr, Node newNode) {
		//Base case - some trivial case where
		//you know what to do and can end the recursion
		if(curr.next == null) { //@ a node with no neighbor!
			curr.next = newNode;
		}else {
			//using a method call, move to the next node
			add(curr.next, newNode);
		}
	}
	/*
	 * Remove and return the removed Node
	 */
	public Node remove(int index) {
		if(index < 0 || index >= size) {
			return null;
		}
		else {
			size--;
			if(index == 0) {
				Node firstIndex = head;
				head = head.next;
				return firstIndex;
			}
			else {
				return remove(index);
			}
		}
	}
	/*
	 * Helper method for remove
	 */
	public Node remove(Node curr, int index, int currIndex) {
		if(currIndex + 1 == index) {
			Node storage = curr.next;
			if(storage != null) {
				curr.next = storage.next;
			}
			size--;
			return storage;
		}
	}
	public Node get(int index) {
		//check index
		if(index < 0 || index >= size) {
			return null;
		}
		else {
			//use a loop to figure out
			Node temp = head;
			int curr = 0;
			while(curr < index-1) {
				
				temp = temp.next;
				curr++;
			}
				//the previous Node is the only node referencing
				//the Node that we want!
				return temp.next;
		}
	}
	
	/*
	 * Recurisve get method
	 */
	public Node get(Node curr, int index, int currIndex) {
		if(currIndex == index) {//base case - we're done! no more recursion (no method call)
			return null;
		}
		else {
			return get(curr.next, index, currIndex + 1);
		}
 	}
	

}
