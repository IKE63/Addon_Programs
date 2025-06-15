package SD_Programs;

public class CLL_Insert_At_Tail {
	Node last=null;
	public void insert(int val) {
		Node newnode=new Node(val);
		if(last==null) {
			newnode.next=newnode;
			last=newnode;
		}
		else {
			 newnode.next=last.next;
			 last.next=newnode;
			 last=newnode;
		}
	}
	public void insertatend(int val) {
		Node newnode=new Node(val);
			newnode.next=last.next;
			last.next=newnode;
			last=newnode;
		}
public void display() {
	Node temp=last.next;
	while(true) {
		System.out.println(temp.data+" ");
		temp=temp.next;
		if(temp==last.next) {
			break;
		}
}
}
public static void main(String[] args) {
	CLL_Insert_At_Tail n=new  CLL_Insert_At_Tail();
	n.insert(1);
	n.insert(2);
	n.insert(3);
	n.display();
	System.out.println(" insert at end");
	
	n.insertatend(5);
	n.insertatend(6);
	
	System.out.println();
	n.display();
}

}
