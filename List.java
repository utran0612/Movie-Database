public class List{
	
	private int n; //instance variable that holds the number of items in the list
	private Movie head; //the pointer that points to the head of the node
	
	public List(){ //constructor
		n = 0; //sets the list to zero 
		head = null; //makes the head node point to nothing
	}
	
	public int length() { //method that will return the length of the list
		return n; //returns n
	}
	
	public boolean isEmptyList(){ //method that will check and see if list is empty
		return n == 0; //if n==0 then return true
					//if n!=0 then return false
	}
	
	public Movie searchReturn(int key){ //searchs for node based off key then return
		Movie temp = head; //sets temp pointer to head
		for (int i = 0; i < n; i++){ //loop that go through each item in list
			if (key == temp.getIDKey()){ //if the key is equal to the temp key
				return temp; //return the temp node
			}
			temp = temp.getNext(); //otherwise set temp to the next and go again
		} //if you go through the loop that means that none of the nodes have the key
		return null; //then return null 
	}
	
	public Movie searchRemove(int key){ //searches for node off key then removes node from list
		Movie temp = head; //sets temp pointer to the head node
		if (temp.getIDKey() == key){ //if the temp node is equal to the key
			head=head.getNext(); //set the head to the one after itself
			n--; //subtract one to n to keep current list size
			return temp; //return the temp pointer
		}
		while (temp.getNext()!=null){ //loop that runs through entire list
			if (key == temp.getNext().getIDKey()){ //if the next node's key is equal to the key
				Movie result = temp.getNext(); //make result pointer equal to the next node
				temp.setNext(temp.getNext().getNext()); //set the next pointer to the next next node
				n--; //subtract one to n to keep current list size
				return result; //return the result node
			}
			temp = temp.getNext(); //otherwise set temp to the next node and go again
		} //if you go through the loop that means that none of the nodes have the key
		return null; //then return null 
	}
	
	
	public void insert(Movie x){ //inserts node into list
		if (n!=0){ //if the node list is not empty
			x.setNext(head); //set the new node pointer to what the head is pointing to
		}
		head=x; //make the head pointer point to the new node
		n++; //increase n by one to keep list size
	}
	
	public void printList(){ //prints all the objects in the list
		Movie temp = head; //sets temp pointer to the head node
		System.out.println(n); //prints the number of items in the list
		for (int i = 0; i < n; i++){ //goes through the entire list
			System.out.println(temp.getIDKey()); //prints out that nodes key
			temp=temp.getNext(); //then sets pointer to the next node
		}
	}
}