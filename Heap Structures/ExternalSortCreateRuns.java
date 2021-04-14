import java.util.*;

class ExternalSortCreateRuns
{
// #################################
// Instance variables
  JavaMinHeap minHeap;
  boolean minHeapNotFull;

// #################################
// Public Methods
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    minHeap = new JavaMinHeap(args[0]);
    minHeapNotFull = true;
    while (scanner.hasNext() != null){
      fill();
      createRun();
    }
  }

// #################################
// Private Methods
private void fill()
{
  while (minHeapNotFull && scanner.hasNext() != null){
    minHeapNotFull = minHeap.load(scanner.next());
  }
  minHeap.reheap();
  return;
}

private void createRun()
{
  String smallest; 
  while (scanner.hasNext() != null){
    System.out.println(minHeap.replace(scanner.next()));
  }
  return;
}

// #################################
// Properties

}
