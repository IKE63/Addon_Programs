package SD_Programs;

public class Singly_Linked_List_Insertion {

		Node head;
		 
		class Node{
			int data;
			Node next;
			
			Node(int value){
				data=value;
				next=null;
				
			}
		}
		public void insertAtStart(int data) {
			Node newNode=new Node(data);
			newNode.next=head;
			head=newNode;
		}
		public void insertAtEnd(int data) {
			Node newNode=new Node(data);
			if(head==null)
			{
				head=newNode;
				return;
			}
			Node temp=head;
			while(temp.next!=null)
			{
			 temp=temp.next;
			}
		   temp.next=newNode;
		
		}
		public void insertAtPosition(int data, int pos) {
			Node newNode=new Node(data);
			if (pos==0)
			{
				insertAtStart(data);
				return;
			}
			Node temp = head;
			int count = 0;
			while(temp!=null && count < pos -1) {
				temp=temp.next;
				count++;
				
			}
			if (temp==null) {
				System.out.println("Positions Out of Bound");
				return;
				
			}
			newNode.next=temp.next;
			temp.next=newNode;
			}
		public void display() {
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+ "->");
				temp=temp.next;
			}
			System.out.println("null");
		}
		public static void main(String[] args) {
			Singly_Linked_List_Insertion sl = new Singly_Linked_List_Insertion();
			sl.insertAtStart(5);
			sl.insertAtStart(10);
			sl.insertAtPosition(51, 2);
			sl.insertAtPosition(12, 1);
			sl.insertAtEnd(27);
			sl.insertAtEnd(7);
			sl.display();
			
			
		}
	}



