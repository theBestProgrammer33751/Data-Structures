import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinglyLinkedListTester {

	@Test
	void testEmptyListSize() {
		
		//test that a newly created list is size 0
		SinglyLinkedList list = new SinglyLinkedList();
		assertTrue(list.getSize() == 0);
		list.addNode(new Node(5));
		list.addNode(new Node(6));
		list.addNode(new Node(7));
		list.remove(0);
		assertTrue(list.get(0, 2, 0) == 7);
		
		
	}

}
