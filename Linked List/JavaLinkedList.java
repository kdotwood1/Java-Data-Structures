class JavaLinkedList
{
// creates a node that takes user input as the key
// a node is a singular object that references another node object, these links form a list 
  private Node head;

// this method will add a new node to the top of the list
  public void add(String str){
    Node body = new Node(str);
    body.key = str;
    body.next = head;
    head = body;
    return;
  }

// a method that returns true if the linked list contains a node with a string, false otherwise
  public boolean has(String str){
    Node temp = head;  // temporary storage for the node created
    while(temp != null){// while node is not empty
      if(temp.key.equals(str)){ // .equals is a method given in the briefing
        return true;
      } else { temp = temp.next; }
      return false;
    }
  }

// method that removes strings from a linked list
  public void remove(String str){
     // starts at the top of the list
    Node temp = head;
      // checks the first Node if the string matches
    if(temp.key.equals(str)){
    temp.next = temp.next.next;
    }
      // opens a loop to iterate through the rest of the list
    while(temp.next != null){
      if (temp.next.key.equals(str)){
            // remove string from list by making the next of 
            // SNode before equal the reference to the SNode after
        temp.next = temp.next.next;
        return;
      } else { temp = temp.next; }
    }
    return;
  }

// method that counts the number of items in the list and returns them as an integer
  public int length(){
    int count = 0; // initialises a variable to keep count
      // starts at the top of the list
    Node temp = head;
      // opens a loop to iterate through the list
    while (temp!=null){
      count += 1; // add 1 to count  
      temp = temp.next; // move to next node
    }
    return count;
  }

// returns true if the list is empty
  public boolean isEmpty(){
    if(length() == 0){
      return true;
    } else { return false; }
  }


// dump(): prints out each string in the list
   public void dump(){
     Node temp = head;
     while (temp != null){
       System.out.println(temp.key);
       temp = temp.next;
     }
     return;
   }
}
