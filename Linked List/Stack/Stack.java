class Stack
{
// ######################################
// Class Variables
  private Node head;

// ######################################
// Public Methods
/* this method will add a new node to the top of the list */
   public void push(String str){
      Node body = new Node(str);
      body.key = str;
      body.next = head;
      head = body;
      return;
   }

/* method that removes nodes from the top of the stack */
   public String pop(){
      String temp = head.key;
      head = head.next;
      return temp;
   }
  
/* a method that returns the front element of the queue */
   public int peek(){
      if (!isEmpty()){ return head; }
   }
\
/* returns true if the list is empty */
  public boolean isEmpty(){
    return (length() == 0);
  }

/* A method that prints out each string in the list */
   public void dump(){
     Node temp = head;
     while (temp != null){
       System.out.println(temp.key);
       temp = temp.next;
     }
     return;
   }
}

// ######################################
// Sub-Class
public class Node <Gen> extends Stack {
   // ######################################
   // Class Variables
   public Gen key;
   public Node next;
  
   // ######################################
   // Constructor
   Node (Gen object){
      key = object;
      next = null;
   }
}
