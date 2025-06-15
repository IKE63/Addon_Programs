package SD_Programs;

public class Doubly_Linked_List_Insertion {
	
	    class Node {
	        int data;
	        Node prev, next;

	        Node(int val) {
	            data = val;
	            prev = null;
	            next = null;
	        }
	    }

	    Node head = null;
	    Node tail = null;

	    public void insertEnd(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = tail = newNode;
	        } else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	    }

	    public void insertAtMiddle(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = tail = newNode;
	            return;
	        }

	        int count = 0;
	        Node temp = head;
	        while (temp != null) {
	            count++;
	            temp = temp.next;
	        }

	        int mid = count / 2;
	        temp = head;
	        for (int i = 0; i < mid - 1; i++) {
	            temp = temp.next;
	        }

	        newNode.next = temp.next;
	        if (temp.next != null) {
	            temp.next.prev = newNode;
	        } else {
	            tail = newNode;
	        }
	        newNode.prev = temp;
	        temp.next = newNode;
	    }

	    public void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	Doubly_Linked_List_Insertion dll = new Doubly_Linked_List_Insertion();
	        dll.insertEnd(1);
	        dll.insertEnd(2);
	        dll.insertEnd(4);
	        dll.insertEnd(5);
	        dll.insertAtMiddle(3);
	        dll.display();
	    }
}