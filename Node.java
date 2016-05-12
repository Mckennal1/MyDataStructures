/*
 * Node.java class using Encapsulation to hide data
 */
public class Node {
	private int data;
	private Node next;
	
	//Getter and setter methods to allow access of the private variables
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}