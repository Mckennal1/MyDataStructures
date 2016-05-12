/*Implementation of SinglyLinked list using the process of
 *Encapsulation from Node.java class.
 */
public class SinglyLinked {
	
	Node head;
	Node tail;
	int counter=0; 

	public void insertFirst(int data){
		Node first = new Node();
		first.setData(data);
		first.setNext(head);
		head=first;
		counter++;
	}//end insertFirst
	
	public void insertLast(int data){
		Node last = new Node();
		last.setData(data);
		Node node=head;
		//always make new reference to head
		if(head==null){
			head=last;
		}
		else{
			while(node.getNext()!=null){
			node=node.getNext();
			}
			node.setNext(last);
			counter++;
		}
	}//end insertLast
	
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
	}//deleteLast
	
	public void insert(Node previous, int current){
		Node n = head;
		if (n==null){
			insertFirst(current);
		}
		else{
			Node node = new Node();//new object
			node.setData(current);//set new data to new object
			Node node1=previous.getNext();
			previous.setNext(node);//previous is set to current 
			node.setNext(node1);//current is set to next
			counter++;
		}
	}//end insert
	
	public void delete(int data){
		Node node = head;
		if(node.getData()==data){//if the only node in the list is the data we want to delete
			node=null;
			counter--;
			//return "Empty LinkedList";// nothing is in the LinkedList
		}
		
		while(node.getNext()!=null){//traverse the List to find it
			if(node.getData()==data){
				Node prev = new Node();
				prev.setNext(node);
				prev.setNext(node.getNext());
				node.setNext(null);
				//node=null;
				counter--;
			}
		}
		
	}//end delete
	
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
	}// end toString
}//end SinglyLinked
