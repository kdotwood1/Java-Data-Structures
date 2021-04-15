/* a node is a singular object that references another 
 node object, these links form a list */

public class Node <Gen> extends JavaLinkedList {
    public Gen key;
    public Node next;
 
    Node (Gen object){
       key = object;
       next = null;
    }
 }