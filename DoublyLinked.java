/*
 * Doubly Linked list using Encapsulation
 */
public class DoublyLinked {
	Node head; 
	Node tail;
	int counter=0;
	
	public void addFirst(int data){// addFirst
		Node node = new Node();
		node.setData(data);
		node.setNext(head);
		node.setPrevious(null);
		head=node;
		counter ++;
	}//end addFirst
	
	public void addLast(int data){//add Last
		Node last = new Node();
		last.setData(data);
		Node node = head;
		if(head==null){
			head=last;
		}
		else {
			while(node.getNext()!=null){
				node=node.getNext();
			}
			node.setNext(last);
			last.setPrevious(tail);
			counter++;
		}
	}//end addLast
	
	public void deleteFirst(){
		head=head.getNext();
		counter--;
	}//end deleteFirst
	
	public void deleteLast(){
		if(head!=null)
		{
			Node node = head;
			while(node.getNext()!=null)
			{
				tail=node;
				node=node.getNext();	
			}
			tail.setNext(null);
			counter--;
		}
	}//end deleteLast

	public void add(Node previous, int data){
		Node n = head;
		if(n==null){
			addFirst(data);
		}
		else{
			Node node = new Node();
			node.setData(data);
			Node node1 = previous.getNext();
			previous.setNext(node);
			node.setPrevious(previous);
			node.setNext(node1);
			node1.setPrevious(node);
			counter++;
		}
	}
	
	public void delete(int data){
		Node node=head;
		while(node.getNext()!=null){
			if(node.getData()==data){
				Node pre = node.getPrevious();
				Node next = node.getNext();
				pre.setNext(next);
				next.setPrevious(pre);
				counter--;
			}
		}
	}// end delete
	
	public String toString(){
		//don't move head or you will get null pointer exception
		String a = "";
		Node new2 = head;
		if (new2==null){
			return "Empty";
		}
		
		for (int i = 0; i < counter; i++){
			while(new2!=null){
				a+=new2.getData()+"\n";//appending to a string, add data into that string
				new2=new2.getNext();
			}
		}
		return a; 
	}//end toString();
	
}//end DoublyLinked
