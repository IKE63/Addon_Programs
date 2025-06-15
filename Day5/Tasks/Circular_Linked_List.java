package SD_Programs;

public class Circular_Linked_List {
	Node last=null;
	public void insert(int val) {
		Node newnode=new Node(val);
		if(last==null) {
			newnode.next=newnode;
			last=newnode;
		}
		else {
			  newnode.next = last.next;
			  last.next = newnode;
			  last =newnode;
		}
	}
		public void display() {
			Node temp=last.next;
			 do {
		            System.out.print(temp.data + " ");
		            temp = temp.next;
		        } while (temp != last);
			 System.out.println(temp.data);
		}
			
		public static void main(String[] args) {
			Circular_Linked_List n=new  Circular_Linked_List();
		n.insert(4);
		n.insert(5);
		n.insert(2);
		n.display();
	}
}
