public class Driver {
  public static void main (String[] args) {
    Stack NewStack = new Stack();
    NewStack.push(1);
    NewStack.push(2);
    NewStack.push(3);
    NewStack.push(4);
    NewStack.push(5);
    System.out.println(NewStack.size());
    System.out.println(NewStack);
    System.out.println(NewStack.pop());
    System.out.println(NewStack);
    System.out.println(NewStack.size());
    System.out.println(NewStack.top());
    
    Queue NewQueue = new Queue();
    NewQueue.enqueue(1);
    NewQueue.enqueue(2);
    NewQueue.enqueue(3);
    NewQueue.enqueue(4);
    NewStack.enqueue(5);
    NewQueue.enqueue(6);
    NewQueue.enqueue(7);
    System.out.println(NewQueue.size());
    System.out.println(NewQueue.front());
    System.out.println(NewQueue);
    NewQueue.dequeue();
    System.out.println(NewQueue.size());
    System.out.println(NewQueue.front());
    System.out.println(NewQueue);
  }
}
