package linearDataStructures;

public class Main {

	public static void main(String[] args) {
		DynamicStack<Integer> stack = new DynamicStack<Integer>();
		
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}

		while (stack.count() != 0) {
			System.out.println(stack.pop());
		}
		
		stack.pop();
	}

}
