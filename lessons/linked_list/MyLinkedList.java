import java.io.*;
import java.util.*;


public class MyLinkedList{

  private Node head;

  public MyLinkedList(){
    head = null;
  }


  /* Add a new node which data value to the front of the list */
  public void add(String value) {
    Node NewNode = new Node(value);
    NewNode.setNext(head);
    head = NewNode;
  }

  /* Returns the value in the node at location index. */
  public String get(int index){
    
    // Create a reference to head. It will help loop through the list
    Node walker = head;
    // Counter to track a node position
    int counter = 0;
    while (walker != null) {
      if (counter == index) {
        return walker.data;
      }
      counter++;
      walker = walker.next;
    }
  }

  /* Return the list as a string */
  public String toString(){
    // Create a reference to head. It will help loop through the list
    Node walker = head;
    String LinkedList = "";
    while (walker != null) {
      LinkedList += " " + walker.data;
      walker = walker.next;
    } 
    return LinkedList;
  }

  /* Returns the number of elements in the list */
  public int size(){
    // Create a reference to head. It will help loop through the list
    Node walker = head;
    // Counter to track a node position
    int size = 1;
    while (walker != null) {
      counter++;
      walker = walker.next;
    }
    return size;
  }


  /*Adds a new node which contains value at index */
  public void add(int index, String value){
    Node walker = new Node(value);
    walker.next = head;
    for (i = 0; i < index; i++) {
      walker = walker.next;
    }
    
    Node NewNode = new Node(value);
    NewNode.setNext(walker.next);
    node.next = walker.next;
    walker.next = node;
  }


  /* Returns the index of the first node in the list that contains value. */
  public int indexOf(String value){
    Node walker = head;
    counter = 0;
    while (walker != null) {
      if (walker.data == value) {
        return counter;
      }
      counter++;
      walker = walker.next;
    }
  }


  /* Remove node al location index */

  public void remove(int index){
    Node walker = head; 
    if (head != null && head.next.next != null) {
      for (int i = 0; i <= index; i++) {
        if (i == index - 1) {
          Node previous = walker;
          Node after = walker.next.next;
          previous.next = after;
        }
      }
    }
    if (head.next.next == null) {
      head = null; 
    }
  }
}
