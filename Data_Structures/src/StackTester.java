import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTester {

	@Test
	void test() {
		//1) create a Stack
		Stack<Double> stack = new Stack<Double>();
		
		//2) check the size
		assertTrue(stack.size()==0);
	}
	
	@Test
	void testPush() {
		
		//1) create a Stack
		Stack<Integer> s = new Stack<Integer>();
		
		//2) Add 1 element
		s.push(1);
		System.out.println(s);
		//3) check content using toString
		assertTrue(s.toString().equals("[1]"));
		
		//4) add one more to continue checking
		s.push(5);;
		assertTrue(s.toString().equals("[1, 5]"));
	}
	
	//add another tester for pop
	@Test
	void testPop() {
Stack<Integer> s = new Stack<Integer>();
		
		//2) Add 1 element
		s.push(1);
		System.out.println(s);
		//3) check content using toString
		assertTrue(s.toString().equals("[1]"));
		
		//4) add one more to continue checking
		s.push(5);;
		assertTrue(s.pop().toString().equals("5"));
	}

}




















