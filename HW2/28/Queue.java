/*****************************************************
 * interface Queue
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 ******************************************************/


public interface Queue<Quasar> {

    //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
    //means of removing an element from collection:
    //Dequeues and returns the first element of the queue.

    public Quasar dequeueEnd();
    public Quasar dequeueFront();
    //means of adding an element to collection:
    //Enqueue an element onto the back of this queue.

    public void enqueueEnd( Quasar x );
    public void enqueueFront( Quasar x );
    //Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty();

    //Returns the first element of the queue without dequeuing it.
    public Quasar peekFront();
    public Quasar peekEnd();


}//end interface Queue                                                                                           
