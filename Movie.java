public class Movie{
	//private instances
	private String title;
	private int date;
	private int id;
	private int rating;
	private boolean isAvailable;
	private Movie left;
	private Movie right;
	private Movie next;

	//constructor method
	public Movie(String name, int date0, int id0, int rating0, boolean isAvailable0){
		title = name;
		date = date0;
		id = id0;
		rating = rating0;
		isAvailable = isAvailable0;
		}

	//get the movie's name
	public String getTitle(){
		return title;
		}
		
	public void setTitle(String title0){
		title = title0;
	}

	//get the movie's release date
	public int getDate(){
		return date;
	}
	
	public void setDate(int date0){
		date = date0;
	}

	//get the movie's id
	public int GetID(){
		return id;
	}

	public void setID(int id0){
		id = id0;
	}
	
	//get key
	public int getIDKey(){
		return id%10000;
	}
	
	//get the movie's rating
	public int getRating(){
		return rating;
	}
	
	public void setRating(int rating0){
		rating = rating0;
	}
	
	//see if whether or not we hold the movie
	public boolean isAvailable(){
		return isAvailable;
		}

	public Movie getLeft(){
		return left;
	}

	public Movie getRight(){
		return right;
	}

	public void setRight(Movie right0){
		right = right0;
	}

	public void setLeft(Movie left0){
		left = left0;
	}
	
	public Movie getNext(){
		return next;
	}

	public void setNext(Movie next0){
		next = next0;
	}
}

