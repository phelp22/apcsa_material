
import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    MyLinkedList myList = new MyLinkedList();
    myList.add("a");
    myList.add("b");
    myList.add("c");
    myList.add("d");
    myList.add("e");
    System.out.println(myList.get(2));
    System.out.println(myList.size());
    myList.add(3, "f");
    System.out.println(myList);
    myList.remove(2);
    System.out.println(myList);
    myList.remove(0);
    System.out.println(myList);
    myList.remove(3);
    System.out.println(myList.indexOf("b"));
    System.out.println(myList);
  }
}
