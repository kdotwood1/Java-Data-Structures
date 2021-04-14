public class Node <Gen> extends JavaLinkedList {
    public Gen key;
    public Node next;
 
    SNode (String s){
       key = s;
       next = null;
    }
 }