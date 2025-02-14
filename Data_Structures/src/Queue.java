
public class Queue<P> {
	 
	//data - MUST ONLY use Stack(s)
	private Stack<P> stackOne;
	private Stack<P> storage;
	private P value;
	public Queue() {
		//job of the constructor is to initialize the instance variables
		stackOne = new Stack<P>();
		storage = new Stack<P>();
	}
	
	/*
	 * Add to the queue
	 */
	public void enqueue(P el) {
		stackOne.push(el);
	}
	
	/*remove from the queue
	 * return NULL if empty
	 * */
	public P dequeue() {
		/*
		 * if(queue is empty) {
		 * 	don't try to access stuff
		 * }
		 */
		int size = stackOne.size();
		if(stackOne.size() == 0) {
			value = null;
		}
		
		if(stackOne.size() > 1) {
			for(int i = 1; i < size; i++) {
				P secondValue = stackOne.pop();
				System.out.println("pop "+secondValue);
				storage.push(value);
			}
			value = stackOne.pop();
			int secondSize = storage.size();
			for(int i = 0; i < secondSize; i++) {
				stackOne.push(storage.pop());
			}
		}
		
		
		if(stackOne.size() == 1) {
			value = stackOne.pop();
		}
		System.out.println("value is "+value);
		return value;
	
	}
	
	//return next element in the Queue BUT
	//DO NOT REMOVE
	public P peek() {
		int theSize = stackOne.size();
		int anotherSize = storage.size();
		for(int i = 0; i < theSize; i++) {
			storage.push(stackOne.pop());
		}
		P value = stackOne.peek();
		
		for(int i = 0; i < anotherSize; i++) {
			stackOne.push(storage.pop());
		}
		return value;
	}
	
	public int size() {
		return stackOne.size();
	}
	
	public String toString() {
		return stackOne.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
