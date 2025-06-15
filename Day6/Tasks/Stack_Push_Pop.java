package SD_Programs;

public class Stack_Push_Pop {
int []stack = new int[5];
int top=-1;
public void push(int num) {
	stack[++top]=num;

}
	public void pop()

	{
	if(top!=-1)
		{
		System.out.println("Popped out:"+stack[top]);
			top--;

		}

		else 

		{

			System.out.println("Stack is empty");

		}
	}
public void display() {

	for(int i =0;i<stack.length;i++) {

		System.out.println(stack[i]+" ");

	}
	}

	public static void main(String[] args) {

		Stack_Push_Pop rk=new Stack_Push_Pop();

		rk.push(2);

		rk.push(3);

		rk.push(4);

		rk.push(5);

		rk.push(6);

		rk.pop();

		rk.display();
	}
}
