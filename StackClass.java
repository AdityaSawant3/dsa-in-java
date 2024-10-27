import java.util.Arrays;

public class StackClass {
	public static void main(String[] args){
		StackImplementationClass stack = new StackImplementationClass(5);

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.printStack();
		System.out.println("Element at peek is: " + stack.peek());

		stack.pop();
		stack.pop();
		stack.printStack();
		System.out.println("Element at peek is: " + stack.peek());
	}
}

class StackImplementationClass {
	private int[] array;
	private int top;
	private int size;

	public StackImplementationClass(int capacity) {
		array = new int[capacity];
		this.top = -1;
		this.size = capacity;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size-1;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return array[top];
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack is full");
			return;
		}
		array[++top] = data;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return array[top--];
	}

	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}