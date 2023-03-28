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
    
    Stack NewQueue = new Queue();
    NewStack.enqueue(1);
    NewStack.enqueue(2);
    NewStack.enqueue(3);
    NewStack.enqueue(4);
    NewStack.enqueue(5);
    NewStack.enqueue(6);
    NewStack.enqueue(7);
    System.out.println(NewStack.size());
    System.out.println(NewStack.front());
    System.out.println(NewStack);
    NewStack.dequeue();
    System.out.println(NewStack.size());
    System.out.println(NewStack.front());
    System.out.println(NewStack);
  }
}
