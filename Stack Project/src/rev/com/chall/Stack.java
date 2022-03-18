package rev.com.chall;

import java.util.EmptyStackException;

public class Stack {

	private int arr[];

	private int capacity;

	private int top;

	public Stack(int size) {

	     arr  = new int[size];

		capacity = size;

		top = -1;

	}
	
	public boolean isEmpty() {

		 return top == -1;

		 }
	
	public int peek() {

		  if (!isEmpty()) {

		  return arr[top];

		  } else {

		 System.exit(-1);

		  }

		  return -1;

		  }
	
	public boolean isFull() {
		 
		 return top == capacity - 1;

		 }
	
	public void push(int x) {

		 if (isFull()) {

		 System.out.println("Amount of numbers you can push has now reached full" +
		                     " capacity, here is the limit you have reached:"
		                      + capacity);

		 System.exit(-1);

		  }
		 
		 System.out.println("Inserting:" + x);

		 arr[++top] = x;
	
}
	
	public int pop() {

		 if (isEmpty()) {

			 throw new EmptyStackException();

		 }

		 System.out.println("Removing " + peek());

		 return arr[top--];

		  }
	
	public void max() {

		 int accumulator = 0;
		 
		 if (isEmpty()) {
			 throw new EmptyStackException();
		 }

		 if (!isEmpty()) {

		 for(int i = 0; i < arr.length; i++) {
		 
		   if(accumulator < arr[i]) {

		   accumulator = arr[i];

		   }

		   else if(isEmpty()) {

		   break;
		  
		   }

		 }
		 
		 System.out.println("The max top value is: " + accumulator);

		   } 
		 
	}
	
}
