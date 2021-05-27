class Deque {
// ######################################
// Class Variables
   private Node head;
   private Node tail;
   private int count;

// ######################################
// Public Methods
/* a method the lets you add the the back of the queue */
   public void enqueue(int num){
      Node backOfLine = new Node (int num);
      if (isEmpty()){
         head = backOfLine;
         tail = backOfLine;      
      } else {
         tail.next = backOfLine;
         tail = backOfLine;
      }
      count += 1;
      return;
   }

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
  
/* a method that returns true if the queue is empty */
   public boolean isEmpty(){
      return (count == 0);
   }  

/* a method that returns the front element of the queue */
   public int peek(){
      if (!isEmpty()){ return head; }
   }
}
// ######################################
// Sub-Class
class Node extends Deque {
   // #################################
   // Class Variables
   int key;
   Node next;
   
   // #################################
   Constructor
   Node (int idNum){
      key = idNum;
      next = null;
   }
}
