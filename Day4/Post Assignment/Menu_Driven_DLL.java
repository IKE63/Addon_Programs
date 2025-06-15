package SD_Programs;

import java.util.Scanner;

public class Menu_Driven_DLL {
  class Node {
	        int data;
	        Node prev, next;

	        Node(int val) {
	            data = val;
	            prev = null;
	            next = null;
	        }
	    }

	    Node head = null, tail = null;

	    public void insertAtBeginning(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = tail = newNode;
	        } else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }

	    public void insertAtEnd(int val) {
	        Node newNode = new Node(val);
	        if (tail == null) {
	            head = tail = newNode;
	        } else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	    }

	    public void insertAtPosition(int val, int pos) {
	        if (pos == 0) {
	            insertAtBeginning(val);
	            return;
	        }

	        Node temp = head;
	        for (int i = 0; i < pos - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Position out of range.");
	            return;
	        }

	        Node newNode = new Node(val);
	        newNode.next = temp.next;
	        if (temp.next != null) {
	            temp.next.prev = newNode;
	        } else {
	            tail = newNode;
	        }
	        newNode.prev = temp;
	        temp.next = newNode;
	    }

	    public void deleteAtPosition(int pos) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        if (pos == 0) {
	            head = head.next;
	            if (head != null) head.prev = null;
	            else tail = null;
	            return;
	        }

	        Node temp = head;
	        for (int i = 0; i < pos && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Position out of range.");
	            return;
	        }

	        if (temp.prev != null) temp.prev.next = temp.next;
	        if (temp.next != null) temp.next.prev = temp.prev;
	        if (temp == tail) tail = temp.prev;
	    }

	    public void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node temp = head;
	        System.out.print("DLL: ");
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Menu_Driven_DLL dll = new Menu_Driven_DLL();
	        int choice;

	        do {
	            System.out.println("\n--- MENU ---");
	            System.out.println("1. Insert at Beginning");
	            System.out.println("2. Insert at End");
	            System.out.println("3. Insert at Position");
	            System.out.println("4. Delete at Position");
	            System.out.println("5. Display List");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value: ");
	                    dll.insertAtBeginning(sc.nextInt());
	                    break;
	                case 2:
	                    System.out.print("Enter value: ");
	                    dll.insertAtEnd(sc.nextInt());
	                    break;
	                case 3:
	                    System.out.print("Enter value: ");
	                    int val = sc.nextInt();
	                    System.out.print("Enter position: ");
	                    int pos = sc.nextInt();
	                    dll.insertAtPosition(val, pos);
	                    break;
	                case 4:
	                    System.out.print("Enter position to delete: ");
	                    dll.deleteAtPosition(sc.nextInt());
	                    break;
	                case 5:
	                    dll.display();
	                    break;
	                case 6:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 6);
	    }
	}



