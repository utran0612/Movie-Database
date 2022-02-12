//Jack Aleksa
//Queue
//COM212
public class Queue{
	
	private Movie[] q; //creates array that will hold list
	private int front; //variable that will hold where the front is
	private int n; //length of queue
	
	public Queue(){ //constructor
		q = new Movie[20]; //creates array of size 20 for q
		front = 0; //sets the beginning of the array
		n = 0; //sets the length of the array to zero
	}
	
	public void enqueue(Movie x){ //adds node x to the queue
		q[(front+n) % 20] = x; //adds the node to the tail of the queue
		n++; //increase the n to the proper size of the queue
	}
	
	public Movie dequeue(){ //takes node out of the queue and returns it
		int result = front; //sets the result to the front 
		front = (front+1) % 20; //set front to the next position in array
		n--; //decrease the length of n to the proper size of the queue
		return q[result]; //returns the result 
	}
	
	public Movie front(){ //returns the front of the queue
		return q[front]; //returns the front
	}
	
	public boolean isEmpty(){ //retuns true if empty flase if not
		return n==0; //checks to see if n is equal to zero
	}
	
	//printQueue method for Queue
	public void printQueue(){
		int tail = (front + n) % 20;
		System.out.println(front);
		System.out.println(tail);
		if (front <= tail){
			for(int i = front; i < tail; i++){
				System.out.println(q[i].getIDKey());
			}
		}else{
			for(int i = front; i < 20; i++){
				System.out.println(q[i].getIDKey());   
			}
			for(int i = 0; i < tail; i++){
				System.out.println(q[i].getIDKey());
			}
		}          
	}
}