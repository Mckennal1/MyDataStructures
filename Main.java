/*
 * Main.java using the main method to run implementation
 */
public class Main {
	public static void main(String []args){
		SinglyLinked Link = new SinglyLinked();
		Link.insertFirst(5);
		Link.insertFirst(10);
		//Link.insert(Link.head.getNext(),11);
		Link.insertFirst(7);
		Link.insertLast(15);
		Link.delete(5);
		System.out.println(Link);
	}
}