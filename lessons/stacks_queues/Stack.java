
public class Stack{
  // This Stack class is designed for integer values >= 0
  
  // Instance variables here
  private Node tail;
  private Node head;
 // COnstructor
  public Stack() {
    head = null;
  }   

  // Add element to stack
  public void push(int value){
    if (isEmpty() == true) {
      Node NewNode = new Node(value);
      head = NewNode;
      tail = NewNode;
    }
    else if (size() == 1) {
      Node NewNode = new Node(value);
      head.setNext(NewNode);
      tail = NewNode;
    }
    else {
      Node NewNode = new Node(value);
      tail.setNext(NewNode);
      tail = NewNode;
    }
  }

  // Remove element from stack  
  public int pop(){
    if (isEmpty() == false) {
      Node walker = head;
      while (walker.getNext() != null) {
        walker = walker.getNext();
      }
      tail = walker; 
      return walker.getData(); 
    }
    else return -1;
  }

  // Get top element
  public int top(){
    return tail.getData();
  }

  // Check is stack empty
  public boolean isEmpty(){
    if (head == null) return true;
    else return false;
  }

  // Return size stack
  public int size(){
    if (isEmpty() == false) {
      int counter = 0;
      Node walker = head;
        while (walker.getNext() != null) {
          walker = walker.getNext();
          counter++;
        }
      return counter;
    }
    else return 0;
  }

  // Print stack
  public String toString(){
    String accumulator = "";
    Node walker = head;
    for (int i = 0; i < size(); i++) {
      accumulator += walker.getData();
      walker = walker.getNext();
    }
    return accumulator;
  }
}

