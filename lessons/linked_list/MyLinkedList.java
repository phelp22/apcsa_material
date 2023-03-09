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
    if (head == null) {
      head = NewNode;
    else {
      NewNode.next = head;
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
    
    return "";
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
    int counter = 0;
    while (walker != null) {
      counter++;
      walker = walker.next;
    }
    return counter;
  }


  /*Adds a new node which contains value at index */
  public void add(int index, String value){

  }


  /* Returns the index of the first node in the list that contains value. */
  public int indexOf(String value){
    return 0;
  }


  /* Remove node al location index */

  public void remove(int index){
  }
}
