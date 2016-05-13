
public class Main {
	public static void main(String []args){
		DoublyLinked Link = new DoublyLinked();
		Link.addFirst(6);
		Link.addFirst(9);
		Link.addFirst(3);
		Link.add(Link.head, 10);
		System.out.println(Link);
	}
}
