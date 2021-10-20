public class Stack {
	public static final int NOT_VALID = Integer.MIN_VALUE;
	int[] items;
	int top;
	

	public Stack(int inSize) {
		items = new int[inSize];
		top = 0;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public static void main(String[] args) {

	}

	public boolean push(int i) {
		if (this.isFull())
			return false;

		items[top] = i;
		++top;
		return true;
	}

	public boolean isFull() {
		return top == items.length;
	}

	public int pop() {
		--top;
		int r = items[top];
		return r;
	}

	public int peek() {
		if(isEmpty()) return Stack.NOT_VALID;
		return items[top-1];
	}
}
