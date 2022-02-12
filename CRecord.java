//Jack Aleksa
//CRecord
public class CRecord{
	
	private Customer[] h; //instance variable for array
	
	public CRecord(){
		h = new Customer[100]; //makes array of nodes size 100
	}
	
	public boolean isEmptyRecord(){ //checks if hash is empty
		for (int i = 0; i < 100; i++){ //loops through each spot in array
			if (h[i] != null){ //if there is something 
				return false; //return false
			}
		}
		return true; //if get through loop return true
	}
	
	public void insert(Customer x){ //inserts node into hash
		int key = x.getCCNKey() % 100; //finds key for the inserting node
		if (h[key] == null){ //if index where node is insert is null
			h[key] = x; //set that idex to new node
		}else{
			insert2(h[key], x); //add to the seperate chaining 
		}
	}
	
	private void insert2(Customer p, Customer x){ //adds node to end of chain
		if (p.getNext() == null){ //if next node is null
			p.setNext(x); //set new node to next node
		}else{ //recusion
			insert2(p.getNext(), x); //run again on next node in chain
		}
	}
	
	public Customer search(int x){ //searchs for node and returns
		int key = x % 100; //finds key of search node
		return search2(h[key], key); //recusive function for search
	}
	
	private Customer search2(Customer p, int k){ //recursive function for search
		if (p == null){ //if node is null
			return null; //return null
		}else if (p.getCCNKey() == k){ //if node is key
			return p; //return node
		}else{ //recursion
			return search2(p.getNext(), k); //run again on next node 
		}
	}
	
	public Customer remove(int x){ //removes node from hash
		int key = x % 100; //finds key for node to be removed
		Customer temp = h[key]; //sets temp not to key index
		if (temp == null){ //if the index is null
			return null; //remove node doesn't exist return null
		}
		if (temp.getCCNKey() == x){ //if index is key
			h[key] = h[key].getNext(); //set the index to next node in chain
			return temp; //return temp node
		}
		while (temp.getNext() != null){ //go through chain
			if (x == temp.getNext().getCCNKey()){ //if next node is equal to key
				Customer result = temp.getNext(); //result equal next node
				temp.setNext(temp.getNext().getNext()); //set next to next of next
				return result; //return result
			} //node equal to key
			temp = temp.getNext(); //set temp to next
		} //not in chain
		return null; //return null
	}
	
	public void printRecord(){ //prints hash
		for(int i = 0; i < 100; i++){ //goes through each index
			if (h[i] == null){ //if index is null
				System.out.println("-"); //prints nothing
			}else{ //has something in index
				printChain(h[i]); //prints chain
			}
		}
	}
	
	private void printChain(Customer p){ //prints chain
		Customer temp = p; //sets temp to index node
		while(temp != null){ //loop that goes through each node
			System.out.print(temp.getCCNKey() + " "); //prints node key
			temp=temp.getNext(); //get to next node
		}
		System.out.println();
	}
}