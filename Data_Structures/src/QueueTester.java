import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTester {

	@Test
	void test() {
		
		//create a queue
		Queue<Integer> firstQ = new Queue<Integer>();
		
		
		//add one element
		firstQ.enqueue(5);
		firstQ.enqueue(6);
		firstQ.enqueue(7);
		firstQ.enqueue(8);
		firstQ.enqueue(9);
		firstQ.enqueue(10);
		
		
 		//assertTrue(firstQ.dequeue() == 5);
		//assertTrue(firstQ.size() == 5);
		System.out.println(firstQ.peek());
		assertTrue(firstQ.peek() == 10);
		
		
	}

}
