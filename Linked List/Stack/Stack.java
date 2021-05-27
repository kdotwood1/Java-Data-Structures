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
  public void pop(String str){
    Node temp = head;                           // starts at the top of the list
    if(temp.key.equals(str)){                   // checks the first Node if the string matches
    temp.next = temp.next.next;                 // point the current node to two nodes ahead and let garbage collection remove the node
    }
    while(temp.next != null){                   // opens a loop to iterate through the rest of the list
      if (temp.next.key.equals(str)){           // remove string from list by making the next of 
        temp.next = temp.next.next;             // Node before equal the reference to the Node after   
        return;                                 
      } else { temp = temp.next; }
    }
    return;
  }
  
/* a method that returns true if the linked list 
contains a node with a string, false otherwise */
   public boolean has(String str){
      Node temp = head;                           // temporary storage for the node created
      while(temp != null){                        // while node is not empty
         if(temp.key.equals(str)){                 //.equals() is a method to compare strings
            return true;                            // if the string is found, return true
         } else { temp = temp.next; }              // else traverse to the next node in the linked list
         return false;                             // if not found return false
      }
   }
  
/* a method that returns the front element of the queue */
   public int peek(){
      if (!isEmpty()){ return head; }
   }

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
