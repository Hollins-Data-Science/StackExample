// The IntStack interface defines the methods that a stack must implement

public interface IntStack {
    public void push(int item); // Push an int on to the top of the stack

    public int pop(); // Pop the top int off of the stack and return it

    public boolean empty(); // Returns true if the stack is empty
}