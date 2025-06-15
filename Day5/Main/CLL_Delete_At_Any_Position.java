package SD_Programs;
import java.util.Scanner;
public class CLL_Delete_At_Any_Position {

	class Node {
	        int data;
	        Node next;

	        Node(int val) {
	            data = val;
	            next = null;
	        }
	    }

	    Node head = null;
	    Node tail = null;

	    
	    public void insert(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	            newNode.next = head;
	        } else {
	            tail.next = newNode;
	            newNode.next = head;
	            tail = newNode;
	        }
	    }

	  
	    public void deleteAtPosition(int pos) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        
	        if (pos == 0) {
	            if (head == tail) {
	                head = tail = null;
	            } else {
	                head = head.next;
	                tail.next = head;
	            }
	            return;
	        }

	        Node temp = head;
	        int count = 0;

	        while (count < pos - 1 && temp.next != head) {
	            temp = temp.next;
	            count++;
	        }

	        
	        if (temp.next == head || temp.next == null) {
	            System.out.println("Position out of range.");
	            return;
	        }

	        Node toDelete = temp.next;
	        temp.next = toDelete.next;

	      
	        if (toDelete == tail) {
	            tail = temp;
	        }
	    }

	
	    public void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node temp = head;
	        System.out.print("CLL: ");
	        do {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println("(back to head)");
	    }

	    public static void main(String[] args) {
	    	CLL_Delete_At_Any_Position cll = new CLL_Delete_At_Any_Position();
	        Scanner sc = new Scanner(System.in);

	        cll.insert(10);
	        cll.insert(20);
	        cll.insert(30);
	        cll.insert(40);

	        System.out.println("Original List:");
	        cll.display();

	        System.out.print("Enter position to delete: ");
	        int pos = sc.nextInt();
	        cll.deleteAtPosition(pos);

	        System.out.println("List after deletion:");
	        cll.display();
	    }
	}



