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
  }
}
