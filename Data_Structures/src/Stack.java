import java.util.ArrayList;

public class Stack<J> {
	
	//Data
	private ArrayList<J> data;
	
	//add a constructor - default constructor
	public Stack() {
		//initialize the instance vars!
		data = new ArrayList<J>();
		
		
	}
	/*
	 * Add the element to the Stack
	 */
	public void push(J el) {
		data.add(el); //end of the list is the "TOP"
	}
	
	public J peek() {
		return data.get(data.size() - 1);
	}
	/*
	 * remove AND return the top of the Stac
	 * return null if empty
	 */
	public J pop() {
		J value = data.get(data.size()-1);
		data.remove(data.size()-1);
		return value;
	}
	
	/*
	 * return the size of the stack
	 */
	public int size() {
		return data.size();
	}
	//use the arrayList to return a String
	//representation of the data
	public String toString() {
		return data.toString();
	}
	
	
	
	
	
}


























































