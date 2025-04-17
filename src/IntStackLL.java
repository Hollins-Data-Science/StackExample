/*
This class implements a stack of integers as a linked list of items
  
Remember stacks are a LIFO data structure, last in first out. This means you can only access items in order of recency, most recent to least recent (the reverse order you added them to the stack).

The public methods for using the the stack are:
void push(int) // Push an int on to the top of the stack
int pop() // Pop the top int off of the stack and return it
boolean empty() // Returns true if the stack is empty
There is also a string conversion to view the contents of the stack.
*/
public class IntStackLL implements IntStack {
  /*
   * This class represents a single item on the stack
   */
  private class IntStackItem {
    int value; // this item's value
    IntStackItem previous = null; // a link to the item below this one
  }

  private IntStackItem top = null; // a link to the top item on the stack

  /*
   * push() adds an item to the top of the stack
   * Note that push does not return anything
   */
  public void push(int value) {
    // create a new stack item to hold the value
    IntStackItem newItem = new IntStackItem();

    // initialize it to the value given to push
    newItem.value = value;

    // set its previous link to the current top item
    newItem.previous = top;

    // set the top item to be this new item
    top = newItem;
  }

  /*
   * pop() removes the top item from the stack and returns its value
   * Will encounter an error if the stack is empty
   */
  public int pop() {
    // pull off the top item
    IntStackItem topItem = top;

    // the top is now the item below topItem
    top = topItem.previous;

    // return the former top item's value
    return topItem.value;
  }

  /*
   * empty() returns a boolean indicating whether the stack is empty
   * Use empty to check the stack before popping
   */
  public boolean empty() {
    // if top is null then the stack is empty
    // System.out.println(this.top.value);
    return (top == null);
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
    IntStackItem current = top;
    while (current != null) {
      output += String.format("%d%n", current.value);
      // Shift to the item below
      current = current.previous;
    }
    output += String.format("Bottom of IntStack");
    return output;
  }
}