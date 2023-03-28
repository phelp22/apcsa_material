public class Driver {
  public static void main (String[] args) {
    Stack NewStack = new Stack();
    NewStack.push(1);
    System.out.println(NewStack.size());
    NewStack.push(2);
    System.out.println(NewStack);
    NewStack.push(3);
    NewStack.push(4);
    NewStack.push(5);
    System.out.println(NewStack.size());
    System.out.println(NewStack);
    NewStack.pop();
    System.out.println(NewStack);
    System.out.println(NewStack.size());
    System.out.println(NewStack.top());
  }
}
