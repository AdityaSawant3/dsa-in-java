public class QueueClass {
    public static void main(String[] args) {
        QueueImplementation q = new QueueImplementation(4);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.printQueue();
        System.out.println("Peek element: " + q.peek());

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.printQueue();
        System.out.println("Peek element: " + q.peek());

        
        q.dequeue();
        q.printQueue();
    }
}

class QueueImplementation {
	private int[] array;
	private int front;
	private int rear;
	private int size;

	public QueueImplementation(int capacity) {
		array = new int[capacity];
		this.front = -1;
		this.rear = -1;
		this.size = capacity;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public boolean isFull() {
		return rear == size-1;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		}
		return array[front];
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		if (front == -1) {
			front = 0;
		}
		array[++rear] = data;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		}
		int value = array[front];
		if (front == rear) {
			front = -1;
			rear = -1;
		} else {
			front++;
		}
		return value;
	}

	public void printQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}

		for (int i = front; i <= rear; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}