public class Queue{
  // This Queue class is designed for integer values >= 0
  
  // Place private instance variables here 
  private Node head;
  private Node tail;
  public final int size = 6;
  
  // Place constructors here
  public Queue(){
    head = null;
  }
  
  // Enqueue a new value to the queue
  public void enqueue(int value){
    if (size() != size) {
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
    else {
      Node NewNode = new Node(value);
      tail.setNext(NewNode);
      dequeue();
    }
  }
    

   
  // Dequeue a value from the queue
  public int dequeue(){
    head = head.getNext();
    return head.getData();
  }

  // Return the front/top
  public int front(){
    return head.getData();
  }


  // Check is queue is empty
  public boolean isEmpty(){
    if (head == null) return true;
    else return false;
  }

  // Return queue size
  public int size(){
    if (isEmpty() == false) {
      int counter = 0;
      Node walker = head;
        while (walker != null) {
          walker = walker.getNext();
          counter++;
        }
      return counter;
    }
    else return 0;
  }
  

  
  // Print queue
  public String toString(){
    String accumulator = "";
    Node walker = head;
    for (int i = 0; i < size(); i++) {
      accumulator += walker.getData() + " ";
      walker = walker.getNext();
    }
    return accumulator;
  }

}
