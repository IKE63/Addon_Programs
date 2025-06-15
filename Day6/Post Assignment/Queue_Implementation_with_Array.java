package SD_Programs;

public class Queue_Implementation_with_Array {
	    int[] queue;
	    int front;
	    int rear;
	    int size;

	    public Queue_Implementation_with_Array(int size) {
	        this.size = size;
	        queue = new int[size];
	        front = 0;
	        rear = -1;
	    }

	    public void enqueue(int value) {
	        if (rear == size - 1) {
	            System.out.println("Queue is full");
	            return;
	        }
	        rear++;
	        queue[rear] = value;
	    }

	    public void dequeue() {
	        if (front > rear) {
	            System.out.println("Queue is empty");
	            return;
	        }
	        System.out.println("Dequeued: " + queue[front]);
	        front++;
	    }

	    public void display() {
	        if (front > rear) {
	            System.out.println("Queue is empty");
	            return;
	        }
	        System.out.print("Queue: ");
	        for (int i = front; i <= rear; i++) {
	            System.out.print(queue[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	Queue_Implementation_with_Array q = new Queue_Implementation_with_Array(5);

	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);
	        q.display();

	        q.dequeue();
	        q.display();
	    }
	}



