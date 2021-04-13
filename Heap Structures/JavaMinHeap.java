class JavaMinHeap<Gen>
{
// #################################
// Instance variables
  private static Gen[] minHeap;
  private static int size, count;


// #################################
// Constructor
  public MyMinHeap (int maxsize){
    if (maxsize > 0){
      size = maxsize;
      minHeap = new Gen[size];
      count = 0;
    }
  }


// #################################
// Public Methods

/*
This method attempts to insert a new value,
if the array array is full it returns
false to stop the incoming stream of data
*/
  boolean insert(Gen value)
  {
    if (count < size) {
      count++;
      minHeap[count-1] = value;
      upHeap(count-1);
      return true;
    } else {
      return false;
    }
  }

/*
this method removes the head by switching
the first and last index in the heap,
removing the last and then reheaping
*/
  Gen remove()
  {
    if(count > 0){
      swap(0, count-1);
      count--;
      downHeap(0);
    }
    return (minHeap[count]);
  }

/*
this method swaps an incoming value and
the head of the heap then sorts for heap order
*/
  Gen replace(String value)
  {
    Gen temp = minHeap[0];
    minHeap[0] = value;
    downHeap(0);
    return temp;
  }


/*
returns the value in the specified index
*/
  Gen peek()
  {
    return minHeap[0];
  }

/*
fills the heap with a stream of inputs as
opposed to one at a time
*/
  void load(Gen[] inputStream)
  {
    for(int i = 0; i < size; i++){
      minHeap[i] = inputStream[i];
    }
    return;
  }

/*
this is a method to put a heap in minHeap order
starts with the parent of the last element and
downheaps, then moves to the next parent to it's
left and repeats
*/
  void reheap ()
  {
    for (int i = (count /2); i>=0; i--){
      upHeap(i);
    }
    return;
  }


// #################################
// Private Methods

/*
A method to sort the heap from the top
down and put it back in heap order
*/
  private static void downHeap(int index)
  {
    Gen parent = minHeap[(index)];
    Gen child1 = minHeap[(2*(index+1)-1)];
    Gen child2 = minHeap[(2*(index+1))];
    if (child1.compareTo(child2) < 0){
      if (parent.compareTo(child1) == 1){
        swap(index, (2*(index+1)-1));
        downHeap((2*(index+1)-1));
      } else {
        return;
      }
    } else {
      if (parent.compareTo(child2) == 1){
        swap(index, (2*(index+1)));
        downHeap((2*(index+1)));
      } else {
        return;
      }
    }
  }

/*
A method to sort a heap from the bottom up
*/
  private static void upHeap(int index)
  {
    int parent = index / 2;                                                
    while (index != 0 && minHeap[index].compareTo(minHeap[parent]) < 0){ 
      swap(index, parent);                                               
      index = parent;
      parent = (index/2);
    }
    return;
  }

/*
A method to swap two values in the heap
*/
  private static void swap(int indexFirst, int indexSecond)
  {
    Gen temp = minHeap[indexFirst];
    minHeap[indexFirst] = minHeap[indexSecond];
    minHeap[indexSecond] = temp;
    return;
  }

  public static int getCount() { return count; }
  public static int getSize(){ return size;  }
}
