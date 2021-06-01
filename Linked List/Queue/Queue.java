
class Queue {
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

/* a method to remove the head of the queue */
   public void dequeue(){
      if(!isEmpty()){
         if (count > 1){
            Node temp = head;
            head = head.next;
            temp.next = null;
         } else { head = null; tail = null; }
         count -= 1;
      } return;
   }

  
/* a method that returns true if the queue is empty */
   public boolean isEmpty(){
      return (count == 0);
   }

/* a method that returns the length of the queue */
   public int length(){
      return count;
   }
}  

/* a method that returns the front element of the queue */
   public int peek(){
      if (!isEmpty()){ return head; }
   }

// ######################################
// Sub-Class
class Node extends Queue {
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
