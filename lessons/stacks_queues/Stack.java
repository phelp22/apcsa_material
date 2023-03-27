
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
    if (size() == 1) {
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
      if (
      
    }
  }

  // Get top element
  public int top(){

  }

  // Check is stack empty
  public boolean isEmpty(){

  }

  // Return size stack
  public int size(){
  
  }

  // Print stack
  public String toString(){

  }


}

