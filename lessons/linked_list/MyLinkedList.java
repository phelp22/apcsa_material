import java.io.*;
import java.util.*;


public class MyLinkedList {

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
        return walker.getData();
      }
      counter++;
      walker = walker.getNext();
    }
    return "";
  }

  /* Return the list as a string */
  public String toString(){
    // Create a reference to head. It will help loop through the list
    Node walker = head;
    String LinkedList = "";
    while (walker != null) {
      LinkedList += walker.getData() + " ";
      walker = walker.getNext();
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
      size++;
      walker = walker.getNext();
    }
    return size;
  }


  /*Adds a new node which contains value at index */
  public void add(int index, String value){
    Node walker = new Node(value);
    walker.setNext(head);
    if (index == 0) {
      add(value);
    }
    else {
      for (int i = 0; i < index; i++) {
        walker = walker.getNext();
      }
      Node NewNode = new Node(value);
      NewNode.setNext(walker.getNext());
      walker.setNext(NewNode);
    }
  }


  /* Returns the index of the first node in the list that contains value. */
  public int indexOf(String value){
    Node walker = head;
    int counter = 0;
    while (walker != null) {
      if (walker.getData() == value) {
        return counter;
      }
      counter++;
      walker = walker.getNext();
    }
    return -1;
  }


  /* Remove node al location index */

  public void remove(int index){
    Node walker = head;
    if (head.getNext().getNext() == null) {
        walker.setNext(null);
    } 
    else if (head != null) {
      if (index == 0) {
      	head = walker.getNext();
      }
      else {
        for (int i = 0; i < index; i++) {
          if (i == index - 1) {
            walker.setNext(walker.getNext().getNext());
          }
          walker = walker.getNext();
        }
      }
    }  
  }
}
