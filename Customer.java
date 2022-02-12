public class Customer{
	
	private String name;
	private int ccn;
	private String email;
	private Queue wishlist;
	private Customer next;
	private List watchlist;
	
	public Customer(String name0, int ccn0, String email0){
		name = name0;
		ccn = ccn0;
		email = email0;
	}
	
	public String getName(){ //creates method that will return name
		return name; //returns name of node
	}
	
	public void setName(String name0){ //sets name of node to new name
		name = name0; //takes name given and sets it to name
	}

	public void setCCN(int ccn0){ //sets CCN of node to new CCN
		ccn = ccn0; //takes CCN given and sets it to new CCN
	}	
	
	public int getCCN(){ //creates method that will return CCN
		return ccn; //returns CCN
	}
	
	public String getEmail(){ //creates method that will return email
		return email; //returns email of node
	}
	
	public void setEmail(String email0){ //sets name of node to new email
		email = email0; //takes email given and sets it to email
	}
	
	public int getCCNKey(){//gets the key of the CCN
		//the key is the last 4 digits of the CCN
		return ccn%10000;//takes mode 10000 of CCN to return last four digits
	}

	public Queue getWishList(){
		return wishlist;
	}
	
	public List getWatchList(){
		return watchlist;
	}
	
	public Customer getNext(){
		return next;
	}
	
	public void setNext(Customer next0){
		next = next0;
	}
}