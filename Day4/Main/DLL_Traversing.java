package SD_Programs;

public class DLL_Traversing {
	class node {
	    int data;
	    node prev;
	    node next;

	    node(int data) {
	        this.data = data;
	    }
	}   
	    node head = null;
	    node tail = null;

	    void insert(int data) {
	        node newnode = new node(data);
	        if (head == null) {
	            head = 
	            tail = newnode;
	        } else {
	            tail.next = newnode;
	            newnode.prev = tail;
	            tail = newnode;
	        }
	    }
	    void front() {
	        node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println(); 
	    }
	    void backward() {
	        node current = tail;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.prev;
	        }
	        System.out.println();
	    }
	     public static void main(String[] args) {
	    	 DLL_Traversing n = new DLL_Traversing();
	        n.insert(1);
	        n.insert(2);
	        n.insert(3);
	        n.insert(4);
	        n.front();
	        n.backward();
	    
	}
}


