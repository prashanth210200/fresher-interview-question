package fresher;

	import java.util.Stack;

	public class StackProgram {
	    public static void main(String[] args) {
	        // Create a new stack
	        Stack<String> stack = new Stack<>();

	        // Push elements onto the stack
	        stack.push("Java");
	        stack.push("Python");
	        stack.push("C++");

	        // Pop elements from the stack
	        String topElement = stack.pop();
	        System.out.println("Popped element: " + topElement);

//	        // Peek at the top element without removing it
//	        String peekedElement = stack.peek();
//	        System.out.println("Peeked element: " + peekedElement);
//
//	        // Check if the stack is empty
//	        boolean isEmpty = stack.isEmpty();
//	        System.out.println("Is stack empty? " + isEmpty);
//
//	        // Get the size of the stack
//	        int size = stack.size();
//	        System.out.println("Stack size: " + size);
	    }
	}


