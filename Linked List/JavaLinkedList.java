class JavaLinkedList
{
// creates a node that takes user input as the key
  private Node head;

// this method will add a new node to the top of the list
  public void add(String str){
    Node body = new Node(str);
    body.key = str;
    body.next = head;
    head = body;
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

/* method that removes strings from a linked list */
  public void remove(String str){
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

/* method that counts the number of items in the list and returns them as an integer */
  public int length(){
    int count = 0;                              // initialises a variable to keep count
    Node temp = head;                           // starts at the top of the list
    while (temp!=null){                         // opens a loop to iterate through the list
      count += 1;                               // add 1 to count  
      temp = temp.next;                         // move to next node
    }
    return count;                               // return the count to the caller
  }

/* returns true if the list is empty */
  public boolean isEmpty(){
    if(length() == 0){
      return true;
    } else { return false; }
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
