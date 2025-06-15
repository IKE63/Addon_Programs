package SD_Programs;

public class Doubly_Linked_List_Deletion {
	class node {
        int data;
        node prev;
        node next;
        node(int val) {
            this.data = val;           
            this.prev = null;
            this.next = null;
        }
    }
		node head=null;
		node tail=null;
		public void insert(int val) {
			node newnode=new node(val);
			if(head==null) {
				head=newnode;
				tail=newnode;
				newnode.next=null;
			}
			else {
				
				newnode.next=head;
				head.prev=newnode;	
				head=newnode;
			}
	}
		public void deleteatmid() {
			int count=0;
			node temp=head;
			while(temp!=null) {
				count++;
				temp=temp.next;
			}
			int mid=count/2;
			node bob=head;
			for(int i=1;i<mid;i++) {
				bob=bob.next;
			}
			(bob.next).prev=bob.next.next;
			(bob.next.next).prev=bob;
			bob.next=(bob.next.next).next;
			bob=bob.next.next;
		}
		public void display() {
			node temp=tail;
			while(temp.prev!=null) {
				System.out.print(temp.data+" ");
				temp=temp.prev;
		}
			System.out.println(temp.data);
	}

	public static void main(String[] args) {
		Doubly_Linked_List_Deletion n=new  Doubly_Linked_List_Deletion();
		n.insert(1);
		n.insert(2);
		n.insert(3);
		n.insert(4);
		n.insert(5);
		n.deleteatmid();
		n.display();
	
	}
}


