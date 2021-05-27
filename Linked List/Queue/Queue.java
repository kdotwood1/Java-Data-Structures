
class Queue {
// points to the head of the queue
   private Node head;
// points to the tail of the queue
   private Node tail;
// stores the amount of clients in the queue
   private int count;

// a method the lets you add the the back of the queue
   public void enqueue(int num){
// creates a new client to be added 
      Node backOfLine = new Node (int num);
// checks to see if the litst is empty already
      if (isEmpty()){
// if true, set both pointers to the new client
         head = backOfLine;
         tail = backOfLine;      
      } else {
// otherwise only set the tail pointer to this new client
         tail.next = backOfLine;
         tail = backOfLine;
      }
// add one to the count and return
      count += 1;
      return;
   }

// a method to remove the head of the queue
   public void dequeue(){
// if the queue is empty do nothing skip to end
      if(!isEmpty()){
// checks to see if the queue has more than 1
         if (count > 1){
// creates a temp client stores the queue's head in it
            Client temp = head;
// moves the head pointer along to the next in the queue 
            head = head.next;
// removes pointer from old head
            temp.next = null;
// else sets the head and tail to null as the list will be empty again
         } else { head = null; tail = null; }
// update count variable then return
         count -= 1;
      }
      return;
   }

  
// a method that returns true if the queue is empty
   public boolean isEmpty(){
      if (count == 0) {
         return true;
      } else {
         return false;
      }
   }

// a method that returns the length of the queue
   public int length(){
      return count;
   }
}  

class Node extends Queue {
   int key;
   Node next;

   Node (int idNum){
      key = idNum;
      next = null;
   }
}
