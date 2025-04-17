import java.util.Stack; // Array based stack
import java.util.Deque; // Linked list based deque

class Main {
  public static void main(String[] args) {
    // Create the stack
    IntStack stack = new IntStackLL();
    // IntStack stack = new IntStackArray();
    // Stack<Integer> stack = new Stack<>();

    // Load IntStackArray()n the first two fibonacci numbers thus setting up the
    // recurrence relation
    stack.push(0);
    stack.push(1);

    // Loop 10 times adding the next 10 Fibonacci numbers to the stack
    for (int i = 0; i < 10; i++) {
      // Pull two previous numbers
      int first = stack.pop();
      int second = stack.pop();
      // Next is the sum of these two
      int next = first + second;
      // Push them all back on
      stack.push(second);
      stack.push(first);
      stack.push(next);
    }

    // Print the stack
    // System.out.println(stack);
    while (!stack.empty()) {
      int val = stack.pop();
      System.out.println(val);
    }
  }
}