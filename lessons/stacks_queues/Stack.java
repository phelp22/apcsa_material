
public class Stack{
  // This Stack class is designed for integer values >= 0
  
  // Instance variables here
  private Node tail;
  private Node head;
 // COnstructor
  public Stack() {
    head = null;
    tail = null;
  }   

  // Add element to stack
  public void push(int value){
    if (isEmpty() == true) {
      head.setData(value);
      tail.setData(value);
    }
    else if (size() == 1) {
      node NewNode = new Node(value);
      head.setNext(NewNode);
      tail = NewNode;
    }
    else {
      node NewNode = new Node(value);
      tail.setNext(NewNode);
      tail = NewNode;
    }
  }

  // Remove element from stack  
  public int pop(){
    if (isEmpty == false) {
      Node walker = head;
      while (head.getNext() != null) {
        walker = walker.getNext();
      }
      tail = walker; 
      return walker.getNext(); 
    }
    else return -1;
  }

  // Get top element
  public int top(){
    return tail.getData();
  }

  // Check is stack empty
  public boolean isEmpty(){
    if (size() == 0) return true;
    else return false;
  }

  // Return size stack
  public int size(){
    int counter = 0;
    Node walker = head;
      while (head.getNext() != null) {
        walker = walker.getNext();
        counter++;
      }
    return counter;
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

