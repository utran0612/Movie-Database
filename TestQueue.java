// Gary Parker
// Test for the Array Queue

public class TestQueue {
    public static void main(String[] args){
	Queue a = new Queue();
	Movie xNode = new Movie("Jane", 19200102, 88, 99, true);
	Movie yNode = new Movie("Joe", 20200102,54, 70, true);
	Movie zNode = new Movie("Jack", 22222222, 100, 60, true);
	Movie kNode = new Movie("Jill", 93456785, 2000, 100, true);
	a.enqueue(xNode);
	a.enqueue(yNode);
	a.enqueue(zNode);
	a.enqueue(kNode);
	a.printQueue();
	System.out.println();
	System.out.println(a.front().getIDKey());
	System.out.println();
	a.printQueue();
	System.out.println();
	System.out.println(a.dequeue().getIDKey());
	System.out.println();
	a.printQueue();
	System.out.println();
	System.out.println(a.isEmpty());
	while(!a.isEmpty()) {
	    System.out.println(a.dequeue().getIDKey());
	    System.out.println();
	}
    	a.printQueue();
	System.out.println(a.isEmpty());
	System.out.println();
	a.enqueue(xNode);
	a.enqueue(yNode);
	a.enqueue(zNode);
	for (int i = 0; i < 20; i++) {
	    a.enqueue(xNode);
	    a.enqueue(yNode);
	    a.enqueue(zNode);
	    a.dequeue();
	    a.dequeue();
	    a.dequeue();
	}
	a.printQueue();
    }
}

