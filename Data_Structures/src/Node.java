
public class Node<T> {
	//Data to be stored
	private T data;
	public Node next;  //null or references neighboring Node
	
	//add a constructor
	public Node(T data) {
		this.data = data;
	}
	
	//add getter/setter for data
	public T getData() {
		return data;
	}
	
	public void setData(T value) {
		data = value;
	}
	

}






