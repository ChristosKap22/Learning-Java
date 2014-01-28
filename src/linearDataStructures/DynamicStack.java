package linearDataStructures;

public class DynamicStack<T> {
	private Node top;
	private int count;

	public DynamicStack() {
		this.top = null;
		this.count = 0;
	}

	public void push(T value) {
		if (this.top == null) {
			this.top = new Node(value);
		} else {
			Node newTop = new Node(value, this.top);
			this.top = newTop;
		}

		this.count++;
	}

	public T pop() {
		if (this.count == 0) {
			throw new IllegalStateException("The stack is empty");
		} else {
			T topValue = this.top.value;
			this.top = this.top.next;
			this.count--;

			return topValue;
		}
	}
	
	public T peek() {
		if (this.count == 0) {
			throw new IllegalStateException("The stack is empty");
		} else {
			return this.top.value;
		}
	}
	
	public void clear() {
		this.top = null;
		this.count = 0;
	}
	
	public int count() {
		return this.count;
	}

	private class Node {
		private T value;
		private Node next;

		public Node(T value) {
			this.value = value;
			this.next = null;
		}

		public Node(T value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}
