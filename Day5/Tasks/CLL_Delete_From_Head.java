package SD_Programs;

public class CLL_Delete_From_Head {
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
	public void delatbeg() {
		Node temp=last.next;
		last.next = temp.next;
	
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
		CLL_Delete_From_Head n=new  CLL_Delete_From_Head();
		n.insert(1);
		n.insert(2);
		n.insert(3);
		n.display();
		System.out.println("delete at beginning");
		n.delatbeg();
		n.display();
	}
}




