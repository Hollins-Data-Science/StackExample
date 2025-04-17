/*
This class implements a stack of integers using an array
  
Remember stacks are a LIFO data structure, last in first out. This means you can only access items in order of recency, most recent to least recent (the reverse order you added them to the stack).

The public methods for using the the stack are:
void push(int) // Push an int on to the top of the stack
int pop() // Pop the top int off of the stack and return it
boolean empty() // Returns true if the stack is empty
There is also a string conversion to view the contents of the stack.
*/

public class IntStackArray implements IntStack {
  private int capacity = 2; // the memory space of the array backend
  private int size = 0; // number of elements on stack
  private int[] backend = new int[capacity]; // the backing array

  public void push(int value) {
    // Check if there is space
    if (size == capacity) {
      // There is no space!
      // Need to create a new bigger array
      // New array will be twice the size
      int new_capacity = capacity * 2;
      int[] new_backend = new int[new_capacity];
      // Loop over old array and copy to new array
      for (int i = 0; i < backend.length; i++) {
        new_backend[i] = backend[i];
      }
      // Swap new array in place of old array
      capacity = new_capacity;
      backend = new_backend;
    }
    backend[size] = value; // place value in array
    size++; // increment size by 1
  }

  public int pop() {
    size--; // decrement size by 1
    return backend[size]; // return top item
  }

  public boolean empty() {
    return (size == 0);
  }

  /*
   * toString() overloads the base toString method to print out the contents of
   * the stack.
   * Use this for debugging
   */
  public String toString() {
    String output = "";
    output += String.format("Top of IntStack%n");
    // Start the top item
    for (int i = 0; i < size; i++) {
      output += String.format("%d%n", backend[i]);
    }
    output += String.format("Bottom of IntStack");
    return output;
  }
}